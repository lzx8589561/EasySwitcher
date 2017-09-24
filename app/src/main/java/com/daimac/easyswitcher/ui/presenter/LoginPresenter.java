package com.daimac.easyswitcher.ui.presenter;

import com.daimac.easyswitcher.api.ApiRetrofit;
import com.daimac.easyswitcher.model.response.LoginResponse;
import com.daimac.easyswitcher.ui.base.BaseActivity;
import com.daimac.easyswitcher.ui.base.BasePresenter;
import com.daimac.easyswitcher.ui.view.LoginView;
import com.daimac.easyswitcher.utils.UIUtils;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by LiuZhenXing on 2017/9/24.
 */

public class LoginPresenter extends BasePresenter<LoginView>{
    public LoginPresenter(BaseActivity context) {
        super(context);
    }

    public void login(){
        String username = getView().getUsername().getText().toString().trim();
        String password = getView().getPassword().getText().toString().trim();

        ApiRetrofit.getInstance().getApi().login2(username,password).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(loginResponse -> {
                    if(loginResponse.getCode() == 200){
                        UIUtils.showToast(loginResponse.toString());
                    }
                }, throwable -> {
                    System.out.println(throwable);
                });

    }

}
