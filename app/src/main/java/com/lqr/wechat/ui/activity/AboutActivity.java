package com.lqr.wechat.ui.activity;

import com.lqr.wechat.R;
import com.lqr.wechat.ui.base.BaseActivity;
import com.lqr.wechat.ui.base.BasePresenter;

/**
 * @author Chris
 *  关于界面
 */
public class AboutActivity extends BaseActivity {

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_about;
    }
}
