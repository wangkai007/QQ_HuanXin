package com.heima.huanxin10.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.heima.huanxin10.R;
import com.heima.huanxin10.presenter.ISplashPresenter;
import com.heima.huanxin10.presenter.impl.ISplashPresenterimpl;
import com.heima.huanxin10.view.callback.SplashView;

public class SplashActivity extends BaseActivity implements SplashView {

    private ISplashPresenter mPresenter;
    private final String Tag = "SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashactivity_main);
        //判断用户是否登陆，如果登陆就调到主页面；否则调到登陆页面
        mPresenter = new ISplashPresenterimpl(this);
        mPresenter.checkLogin();

    }

    @Override
    public void isLogin(boolean isLogin) {
        Log.e(Tag,"闪屏页面登陆"+isLogin);
        if (isLogin) {
            //已登陆
            mhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(MainActivity.class,true);
                }
            },2000);

        } else {
            //未登陆
            mhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(LoginActivity.class,true);
                }
            },2000);
        }
    }
}
