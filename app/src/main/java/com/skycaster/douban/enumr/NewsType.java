package com.skycaster.douban.enumr;

/**
 * Created by 廖华凯 on 2018/4/10.
 * 新闻类型，向聚合数据请求新闻数据时用。
 */

public enum NewsType {
//    类型,,top(头条，默认),shehui(社会),guonei(国内),guoji(国际),yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
    top,shehui,guonei,guoji,yule,tiyu,junshi,keji,caijing,shishang;

    @Override
    public String toString() {
        switch (this){
            case top:
                return "top";
            case shehui:
                return "shehui";
            case guoji:
                return "guoji";
            case guonei:
                return "guonei";
            case yule:
                return "yule";
            case tiyu:
                return "tiyu";
            case junshi:
                return "junshi";
            case keji:
                return "keji";
            case caijing:
                return "caijing";
            case shishang:
                return "shishang";
        }
        return super.toString();
    }
}
