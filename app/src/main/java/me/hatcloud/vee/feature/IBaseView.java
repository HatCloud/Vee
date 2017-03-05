package me.hatcloud.vee.feature;

import android.view.View;

/**
 * Created by Jeff on 2017/2/25.
 * <p>
 * It's a base view for MVP architecture.
 */

public interface IBaseView<T> {
    /**
     * set the presenter of mvp
     *
     * @param presenter
     */
    void setPresenter(T presenter);

    /**
     * init the views of fragment
     *
     * @param view
     */
    void initViews(View view);
}
