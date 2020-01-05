package com.example.smartclass.util;


/**
 * Created by YangFan
 * On 2019/3/4
 * GitHub: https://github.com/TIYangFan
 * Email: yangfan_98@163.com
 */
public abstract class OnMultiClickListener {
    // 两次点击按钮之间的点击间隔不能少于1000毫秒
    private static final int MIN_CLICK_DELAY_TIME = 1000;
    private static long lastClickTime;

    public static boolean isFastClick() {
        boolean flag = false;
        long curClickTime = System.currentTimeMillis();
        if ((curClickTime - lastClickTime) <= MIN_CLICK_DELAY_TIME) {
            flag = true;
        }
        lastClickTime = curClickTime;
        return flag;
    }
}