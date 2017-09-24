package com.daimac.easyswitcher.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.daimac.easyswitcher.R;
import com.daimac.easyswitcher.ui.base.BaseActivity;
import com.daimac.easyswitcher.ui.presenter.LoginPresenter;
import com.daimac.easyswitcher.ui.view.LoginView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * activity 基类
 * Created by LiuZhenXing on 2017/9/24.
 */

public class LoginActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {
    @Bind(R.id.etPhone)
    EditText etPhone;
    @Bind(R.id.etPwd)
    EditText etPwd;
    @Bind(R.id.btnLogin)
    Button btnLogin;

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_login;
    }

    @OnClick({R.id.btnLogin})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnLogin:
                mPresenter.login();
                break;
        }
    }

    @Override
    public EditText getUsername() {
        return etPhone;
    }

    @Override
    public EditText getPassword() {
        return etPwd;
    }
}
