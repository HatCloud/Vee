package me.hatcloud.vee.feature.homepage;

import java.util.List;

import me.hatcloud.vee.data.entity.Topic;
import me.hatcloud.vee.feature.IBasePresenter;
import me.hatcloud.vee.feature.IBaseView;

/**
 * Created by Jeff on 2017/2/25.
 *
 */

interface INodePageContract {
    interface View extends IBaseView<Presenter> {
        void showError();

        void showLoading();

        void stopLoading();

        void showResults(List<Topic> resultList);
    }

    interface Presenter extends IBasePresenter {

        void loadNodeInfo(long nodeID);

        void loadNodeInfo(String nodeName);

        void loadTopics(long nodeID);

        void loadTopics(String nodeName);

        void loadLastTopics();

        void loadHotTopics();
    }
}
