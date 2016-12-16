package com.heima.huanxin10.presenter.impl;

import android.util.Log;

import com.heima.huanxin10.presenter.ISplashPresenter;
import com.heima.huanxin10.view.callback.SplashView;
import com.hyphenate.chat.EMClient;

/**
 * Created by Administrator on 2016/12/16.
 */

public class ISplashPresenterimpl implements ISplashPresenter {
    private final String Tag = "ISplashPresenterimpl";
    private SplashView view;

    public ISplashPresenterimpl (SplashView view) {
        this.view = view;
    }

    @Override
    public void checkLogin() {
        if (EMClient.getInstance().isLoggedInBefore() && EMClient.getInstance().isConnected()) {
            //已登录&&已连接
            Log.e(Tag,"已连接");
            view.isLogin(true);
        }else{
            Log.e(Tag,"未连接");
            view.isLogin(false);
        }
    }
}
