package com.daimac.easyswitcher.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.daimac.easyswitcher.R;
import com.daimac.easyswitcher.ui.base.BaseActivity;
import com.daimac.easyswitcher.ui.base.BasePresenter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.info)
    Button info;
    @Bind(R.id.environment)
    Button environment;
    @Bind(R.id.data)
    Button data;
    @Bind(R.id.button)
    Button button;

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.info, R.id.environment, R.id.data, R.id.button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.info:
                startActivity(new Intent(this,InfoActivity.class));
                break;
            case R.id.environment:
                break;
            case R.id.data:
                break;
            case R.id.button:
                break;
        }
    }
}
