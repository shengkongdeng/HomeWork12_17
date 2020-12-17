package com.example.Bean;

import java.util.List;

/**
 * 创建者: 走廊里の声控灯
 * 项目名: Round_One
 * 包名: com.example.Bean
 * 创建时间: 2020/12/17 19:25
 */
public class BannerBean {

    /**
     * message : 请求i成功
     * code : 200
     * bannerlist : [{"imageurl":"https://yanxuan.nosdn.127.net/14939496197300723.jpg","htmlurl":"http://www.baidu.com"},{"imageurl":"https://yanxuan.nosdn.127.net/14931121822100127.jpg","htmlurl":"http://www.baidu.com"},{"imageurl":"https://yanxuan.nosdn.127.net/14931970965550315.jpg","htmlurl":"http://www.baidu.com"},{"imageurl":"https://yanxuan.nosdn.127.net/14932840600970609.jpg","htmlurl":"http://www.baidu.com"},{"imageurl":"https://yanxuan.nosdn.127.net/14937214454750141.jpg","htmlurl":"http://www.baidu.com"}]
     */

    private String message;
    private String code;
    private List<BannerlistBean> bannerlist;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<BannerlistBean> getBannerlist() {
        return bannerlist;
    }

    public void setBannerlist(List<BannerlistBean> bannerlist) {
        this.bannerlist = bannerlist;
    }

    public static class BannerlistBean {
        /**
         * imageurl : https://yanxuan.nosdn.127.net/14939496197300723.jpg
         * htmlurl : http://www.baidu.com
         */

        private String imageurl;
        private String htmlurl;

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public String getHtmlurl() {
            return htmlurl;
        }

        public void setHtmlurl(String htmlurl) {
            this.htmlurl = htmlurl;
        }
    }
}
