package top.mj93.news.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * @author wbk_liumengjie
 */
public abstract class BaseFragment extends Fragment {

    protected Context mActivity;

    protected View mRootView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity=context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mRootView=inflater.inflate(getLayoutId(),container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     * 获取布局id
     * @return
     */
    protected abstract int getLayoutId();
}
