package com.demo.xiaozhu.architecturecomponent.viewmodel.entity;

import java.util.List;

/**
 * @Description:
 * @Author: fengzeyuan
 * @Date: 17/12/21 下午2:21
 * @Version: 1.0
 */
public class DemoEntity {

    private List<DemoItemEntity> mEntityList;

    public List<DemoItemEntity> getEntityList() {
        return mEntityList;
    }

    public void setEntityList(List<DemoItemEntity> entityList) {
        mEntityList = entityList;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "mEntityList=" + mEntityList +
                '}';
    }

    public static class DemoItemEntity {
        private String iconUrl;
        private String title;
        private String des;

        public String getIconUrl() {
            return iconUrl;
        }

        public void setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        @Override
        public String toString() {
            return "DemoItemEntity{" +
                    "iconUrl='" + iconUrl + '\'' +
                    ", title='" + title + '\'' +
                    ", des='" + des + '\'' +
                    '}';
        }
    }
}
