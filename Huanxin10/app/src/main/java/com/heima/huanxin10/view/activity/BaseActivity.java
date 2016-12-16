package com.heima.huanxin10.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/12/16.
 */

public class BaseActivity extends AppCompatActivity {

    public Handler mhandler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void startActivity(Class clazz,boolean isFinish) {
        startActivity(new Intent(this,clazz));

        if (isFinish) {
            finish();
        }

    }
}
