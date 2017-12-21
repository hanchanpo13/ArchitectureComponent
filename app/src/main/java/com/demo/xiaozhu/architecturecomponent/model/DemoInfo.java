package com.demo.xiaozhu.architecturecomponent.model;

import java.util.List;

/**
 * @Description:
 * @Author: fengzeyuan
 * @Date: 17/12/20 下午2:57
 * @Version: 1.0
 */
public class DemoInfo {


    /**
     * album_offset : 0
     * albums : [{"artists":[{"id":61800047,"name":"Mc王子辰","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/19/00/72484467.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}],"available":true,"company":"","cover":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/16/19/72479008.jpg&w=150&h=150&s=100&c=0&o=0&m=","id":2736401,"name":"热门伴奏","num_tracks":59,"release_date":"2017-03-28","type":"专辑"},{"artists":[{"id":61802185,"name":"Mc爱强","portrait":null,"valid":false}],"available":true,"company":"","cover":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/13/18/72493296.jpg&w=150&h=150&s=100&c=0&o=0&m=","id":2741391,"name":"我也想要上热门","num_tracks":10,"release_date":"2017-08-09","type":"专辑"},{"artists":[{"id":61684909,"name":"Various Artists","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/18/06/71814804.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}],"available":true,"company":"","cover":null,"id":2734876,"name":"최고 은혜 복음성가","num_tracks":0,"release_date":"2013-06-18","type":"专辑"}]
     * artist_offset : 0
     * artists : [{"id":61800047,"name":"Mc王子辰","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/19/00/72484467.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}]
     * dm_error : 0
     * error_msg : 操作成功
     * recommend : 0
     * total_albums : 3
     * total_artists : 1
     * total_tracks : 71
     * track_offset : 0
     * tracks : [{"album":{"cover":"/p1/14/17/72490259.jpg","id":2738798,"name":"买回忆的人"},"artists":[{"id":61773082,"name":"任帅兵","num_albums":2,"num_tracks":8,"portrait":"","valid":false}],"availability":"1110","dlyric":"","id":28128527,"medias":[{"bitrate":320,"p2purl":"D110153143D0599A7C050000008C7319530000009F.mp3"}],"mv":0,"slyric":"","title":"热门","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/13/04/72335971.jpg","id":2716290,"name":"我曾十步杀一人"},"artists":[{"id":61753801,"name":"Mc阳子","num_albums":2,"num_tracks":26,"portrait":"","valid":false}],"availability":"1110","dlyric":"","id":27925251,"medias":[{"bitrate":320,"p2purl":"6842E82B7E6EFF571905000000434467E20000003C.mp3"}],"mv":0,"slyric":"","title":"为了快手热门","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28117785,"medias":[{"bitrate":320,"p2purl":"612049AA330D17F7010500000065672EB000000013.mp3"}],"mv":0,"slyric":"","title":"我对自己开了一枪(伴奏版)","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28119235,"medias":[{"bitrate":320,"p2purl":"2DA617B96982C001FC050000005EC5380C00000025.mp3"}],"mv":0,"slyric":"","title":"我也想要当网红(伴奏版)","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28117775,"medias":[{"bitrate":320,"p2purl":"1C32077D0193D98720050000004B61F43D00000046.mp3"}],"mv":0,"slyric":"","title":"是我太过宠你(伴奏版)","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28117784,"medias":[{"bitrate":320,"p2purl":"5EBCADC4560783AC41050000004D9D6207000000B0.mp3"}],"mv":0,"slyric":"","title":"那天我在等风来(伴奏版)","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28117787,"medias":[{"bitrate":320,"p2purl":"5764E6B718016093FC050000004994BB580000008B.mp3"}],"mv":0,"slyric":"","title":"喊遍整个东三省(伴奏版)","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28119201,"medias":[{"bitrate":320,"p2purl":"E8B0B5FA3250CF2F3E0500000060658CBD000000A3.mp3"}],"mv":0,"slyric":"","title":"你连笑都那么勉强(伴奏版)","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28119207,"medias":[{"bitrate":320,"p2purl":"E4E42B3B1B93680C1A05000000361D0E6200000071.mp3"}],"mv":0,"slyric":"","title":"她说他没喝醉(伴奏版)","isdown":"1","isplay":"1"},{"album":{"cover":"/p1/16/19/72479008.jpg","id":2736401,"name":"热门伴奏"},"artists":[{"id":61800047,"name":"Mc王子辰","num_albums":18,"num_tracks":52,"portrait":"/p1/19/00/72484467.jpg","valid":true}],"availability":"1110","dlyric":"","id":28119214,"medias":[{"bitrate":320,"p2purl":"92B0224D01A93236AA050000006F3D8C05000000D3.mp3"}],"mv":0,"slyric":"","title":"我乃压声第一人(伴奏版)","isdown":"1","isplay":"1"}]
     */

    private int album_offset;
    private int artist_offset;
    private int dm_error;
    private String error_msg;
    private int recommend;
    private int total_albums;
    private int total_artists;
    private int total_tracks;
    private int track_offset;
    private List<AlbumsBean> albums;
    private List<ArtistsBeanX> artists;
    private List<TracksBean> tracks;

    public int getAlbum_offset() {
        return album_offset;
    }

    public void setAlbum_offset(int album_offset) {
        this.album_offset = album_offset;
    }

    public int getArtist_offset() {
        return artist_offset;
    }

    public void setArtist_offset(int artist_offset) {
        this.artist_offset = artist_offset;
    }

    public int getDm_error() {
        return dm_error;
    }

    public void setDm_error(int dm_error) {
        this.dm_error = dm_error;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getTotal_albums() {
        return total_albums;
    }

    public void setTotal_albums(int total_albums) {
        this.total_albums = total_albums;
    }

    public int getTotal_artists() {
        return total_artists;
    }

    public void setTotal_artists(int total_artists) {
        this.total_artists = total_artists;
    }

    public int getTotal_tracks() {
        return total_tracks;
    }

    public void setTotal_tracks(int total_tracks) {
        this.total_tracks = total_tracks;
    }

    public int getTrack_offset() {
        return track_offset;
    }

    public void setTrack_offset(int track_offset) {
        this.track_offset = track_offset;
    }

    public List<AlbumsBean> getAlbums() {
        return albums;
    }

    public void setAlbums(List<AlbumsBean> albums) {
        this.albums = albums;
    }

    public List<ArtistsBeanX> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistsBeanX> artists) {
        this.artists = artists;
    }

    public List<TracksBean> getTracks() {
        return tracks;
    }

    public void setTracks(List<TracksBean> tracks) {
        this.tracks = tracks;
    }

    public static class AlbumsBean {
        /**
         * artists : [{"id":61800047,"name":"Mc王子辰","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/19/00/72484467.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}]
         * available : true
         * company :
         * cover : http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/16/19/72479008.jpg&w=150&h=150&s=100&c=0&o=0&m=
         * id : 2736401
         * name : 热门伴奏
         * num_tracks : 59
         * release_date : 2017-03-28
         * type : 专辑
         */

        private boolean available;
        private String company;
        private String cover;
        private int id;
        private String name;
        private int num_tracks;
        private String release_date;
        private String type;
        private List<ArtistsBean> artists;

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum_tracks() {
            return num_tracks;
        }

        public void setNum_tracks(int num_tracks) {
            this.num_tracks = num_tracks;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<ArtistsBean> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBean> artists) {
            this.artists = artists;
        }

        public static class ArtistsBean {
            /**
             * id : 61800047
             * name : Mc王子辰
             * portrait : http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/19/00/72484467.jpg&w=150&h=150&s=100&c=0&o=0&m=
             * valid : true
             */

            private int id;
            private String name;
            private String portrait;
            private boolean valid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPortrait() {
                return portrait;
            }

            public void setPortrait(String portrait) {
                this.portrait = portrait;
            }

            public boolean isValid() {
                return valid;
            }

            public void setValid(boolean valid) {
                this.valid = valid;
            }
        }
    }

    public static class ArtistsBeanX {
        /**
         * id : 61800047
         * name : Mc王子辰
         * portrait : http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/19/00/72484467.jpg&w=150&h=150&s=100&c=0&o=0&m=
         * valid : true
         */

        private int id;
        private String name;
        private String portrait;
        private boolean valid;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPortrait() {
            return portrait;
        }

        public void setPortrait(String portrait) {
            this.portrait = portrait;
        }

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }
    }

    public static class TracksBean {
        /**
         * album : {"cover":"/p1/14/17/72490259.jpg","id":2738798,"name":"买回忆的人"}
         * artists : [{"id":61773082,"name":"任帅兵","num_albums":2,"num_tracks":8,"portrait":"","valid":false}]
         * availability : 1110
         * dlyric :
         * id : 28128527
         * medias : [{"bitrate":320,"p2purl":"D110153143D0599A7C050000008C7319530000009F.mp3"}]
         * mv : 0
         * slyric :
         * title : 热门
         * isdown : 1
         * isplay : 1
         */

        private AlbumBean album;
        private String availability;
        private String dlyric;
        private int id;
        private int mv;
        private String slyric;
        private String title;
        private String isdown;
        private String isplay;
        private List<ArtistsBeanXX> artists;
        private List<MediasBean> medias;

        public AlbumBean getAlbum() {
            return album;
        }

        public void setAlbum(AlbumBean album) {
            this.album = album;
        }

        public String getAvailability() {
            return availability;
        }

        public void setAvailability(String availability) {
            this.availability = availability;
        }

        public String getDlyric() {
            return dlyric;
        }

        public void setDlyric(String dlyric) {
            this.dlyric = dlyric;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getMv() {
            return mv;
        }

        public void setMv(int mv) {
            this.mv = mv;
        }

        public String getSlyric() {
            return slyric;
        }

        public void setSlyric(String slyric) {
            this.slyric = slyric;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIsdown() {
            return isdown;
        }

        public void setIsdown(String isdown) {
            this.isdown = isdown;
        }

        public String getIsplay() {
            return isplay;
        }

        public void setIsplay(String isplay) {
            this.isplay = isplay;
        }

        public List<ArtistsBeanXX> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBeanXX> artists) {
            this.artists = artists;
        }

        public List<MediasBean> getMedias() {
            return medias;
        }

        public void setMedias(List<MediasBean> medias) {
            this.medias = medias;
        }

        public static class AlbumBean {
            /**
             * cover : /p1/14/17/72490259.jpg
             * id : 2738798
             * name : 买回忆的人
             */

            private String cover;
            private int id;
            private String name;

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class ArtistsBeanXX {
            /**
             * id : 61773082
             * name : 任帅兵
             * num_albums : 2
             * num_tracks : 8
             * portrait :
             * valid : false
             */

            private int id;
            private String name;
            private int num_albums;
            private int num_tracks;
            private String portrait;
            private boolean valid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNum_albums() {
                return num_albums;
            }

            public void setNum_albums(int num_albums) {
                this.num_albums = num_albums;
            }

            public int getNum_tracks() {
                return num_tracks;
            }

            public void setNum_tracks(int num_tracks) {
                this.num_tracks = num_tracks;
            }

            public String getPortrait() {
                return portrait;
            }

            public void setPortrait(String portrait) {
                this.portrait = portrait;
            }

            public boolean isValid() {
                return valid;
            }

            public void setValid(boolean valid) {
                this.valid = valid;
            }
        }

        public static class MediasBean {
            /**
             * bitrate : 320
             * p2purl : D110153143D0599A7C050000008C7319530000009F.mp3
             */

            private int bitrate;
            private String p2purl;

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public String getP2purl() {
                return p2purl;
            }

            public void setP2purl(String p2purl) {
                this.p2purl = p2purl;
            }
        }
    }
}
