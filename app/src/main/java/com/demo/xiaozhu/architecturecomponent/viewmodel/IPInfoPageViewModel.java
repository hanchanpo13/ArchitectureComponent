package com.demo.xiaozhu.architecturecomponent.viewmodel;

import android.arch.lifecycle.MutableLiveData;

import com.demo.xiaozhu.architecturecomponent.data.repository.DataCallBack;
import com.demo.xiaozhu.architecturecomponent.model.DemoInfo;
import com.demo.xiaozhu.architecturecomponent.data.repository.IPInfoRepository;
import com.demo.xiaozhu.architecturecomponent.viewmodel.entity.DemoEntity;

import java.util.ArrayList;
import java.util.List;

public class IPInfoPageViewModel extends MutableLiveData<DemoEntity> implements DataCallBack<DemoInfo> {

    private IPInfoRepository mIPInfoRepo = new IPInfoRepository(this);

    @Override
    public void onDataBack(DemoInfo demoInfo) {
        setValue(transform(demoInfo));
    }

    
    private DemoEntity transform(DemoInfo demoInfo) {
        ArrayList<DemoEntity.DemoItemEntity> demoItemEntities = new ArrayList<>();
        for (DemoInfo.AlbumsBean album : demoInfo.getAlbums()) {
            List<DemoInfo.AlbumsBean.ArtistsBean> artists = album.getArtists();
            if (artists != null && !artists.isEmpty()) {
                DemoInfo.AlbumsBean.ArtistsBean artistsBean = artists.get(0);
                DemoEntity.DemoItemEntity itemEntity = new DemoEntity.DemoItemEntity();
                itemEntity.setIconUrl(artistsBean.getPortrait());
                itemEntity.setTitle(artistsBean.getName() + "(" + artistsBean.getId() + ")");
                itemEntity.setDes(album.getType() + album.getName());
                demoItemEntities.add(itemEntity);
            }
        }

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setEntityList(demoItemEntities);
        return demoEntity;
    }

    public void showView() {
        mIPInfoRepo.requestData();
    }
}
