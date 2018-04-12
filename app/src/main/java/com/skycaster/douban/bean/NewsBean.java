package com.skycaster.douban.bean;

import com.skycaster.douban.base.BaseBean;

import java.util.List;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public class NewsBean extends BaseBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"857fcc6f9101b910719f03d1444aceee","title":"检姐姐带你重读哈利波特丨未成年人驾驶机动车","date":"2018-04-10 15:53","category":"社会","author_name":"法律读库","url":"http://mini.eastday.com/mobile/180410155335467.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_4_mwpm_03200403.jpg"}...]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"857fcc6f9101b910719f03d1444aceee","title":"检姐姐带你重读哈利波特丨未成年人驾驶机动车","date":"2018-04-10 15:53","category":"社会","author_name":"法律读库","url":"http://mini.eastday.com/mobile/180410155335467.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_4_mwpm_03200403.jpg"},...]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean extends BaseBean {
            /**
             * uniquekey : 857fcc6f9101b910719f03d1444aceee
             * title : 检姐姐带你重读哈利波特丨未成年人驾驶机动车
             * date : 2018-04-10 15:53
             * category : 社会
             * author_name : 法律读库
             * url : http://mini.eastday.com/mobile/180410155335467.html
             * thumbnail_pic_s : http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_5_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_3_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://03.imgmini.eastday.com/mobile/20180410/20180410155335_c100929d37e4c9d20bd902582654171a_4_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }
    }
}
