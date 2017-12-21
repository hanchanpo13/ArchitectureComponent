package com.demo.xiaozhu.architecturecomponent.ui;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.demo.xiaozhu.architecturecomponent.R;
import com.demo.xiaozhu.architecturecomponent.data.net.imagLoder.XZImageLoader;
import com.demo.xiaozhu.architecturecomponent.ui.base.XZBaseRecycleViewAdapter;
import com.demo.xiaozhu.architecturecomponent.viewmodel.IPInfoPageViewModel;
import com.demo.xiaozhu.architecturecomponent.viewmodel.entity.DemoEntity;

public class DemoFragment extends Fragment {

    public static final String TAG = "ProductListViewModel";
    private RecyclerView mRecyclerView;
    private DemoListAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.demo_fr_layout, container, false);
        mRecyclerView = rootView.findViewById(R.id.demo_list_view);
        mAdapter = new DemoListAdapter();
        mRecyclerView.setAdapter(mAdapter);
        return mRecyclerView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        IPInfoPageViewModel viewModel = new IPInfoPageViewModel();
        viewModel.observe(this, new Observer<DemoEntity>() {
            @Override
            public void onChanged(@Nullable DemoEntity demoInfo) {
                if (demoInfo != null) {
                    refreshUI(demoInfo);
                } else {
                    Toast.makeText(getActivity(), "数据异常", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void refreshUI(DemoEntity demoInfo) {
        mAdapter.refreshList(demoInfo.getEntityList(), false);
    }

    class DemoListAdapter extends XZBaseRecycleViewAdapter<DemoEntity.DemoItemEntity> {

        @Override
        public BaseViewHolder<DemoEntity.DemoItemEntity> onCreateViewHolder(ViewGroup parent, int viewType) {
            return new BaseViewHolder<DemoEntity.DemoItemEntity>(parent) {

                private ImageView demoListItemIvIcon;
                private TextView demoListItemTvTitle;
                private TextView demoListItemTvDesc;

                @Override
                public void initView(View view) {
                    demoListItemIvIcon = view.findViewById(R.id.demo_list_item_iv_icon);
                    demoListItemTvTitle = view.findViewById(R.id.demo_list_item_tv_title);
                    demoListItemTvDesc = view.findViewById(R.id.demo_list_item_tv_desc);
                }

                @Override
                public void bindDate(int position) {
                    DemoEntity.DemoItemEntity item = getItem(position);
                    if (item != null) {
                        XZImageLoader.loadImage(item.getIconUrl(), demoListItemIvIcon);
                        demoListItemTvTitle.setText(item.getTitle());
                        demoListItemTvDesc.setText(item.getDes());
                    }

                }
            };
        }
    }

}
