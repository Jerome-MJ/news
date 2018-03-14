package top.mj93.news.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author wbk_liumengjie
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        onBeforeView();
        initView();
        onAfterView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    /**
     * 视图初始化之后
     */
    protected abstract void onAfterView();

    /**
     * 视图初始化之前
     */
    protected abstract void onBeforeView();

    /**
     * 初始化视图
     */
    protected abstract void initView();

    /**
     * 获取布局id
     *
     * @return 布局id
     */
    protected abstract int getLayoutId();
}
