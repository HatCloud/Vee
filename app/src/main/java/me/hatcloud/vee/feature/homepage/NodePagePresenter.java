package me.hatcloud.vee.feature.homepage;

import android.support.annotation.NonNull;

import java.util.List;

import me.hatcloud.vee.data.entity.Topic;
import me.hatcloud.vee.data.source.ITopicDataSource;
import me.hatcloud.vee.data.source.remote.TopicRemoteDataSource;

/**
 * Created by Jeff on 2017/2/25.
 */

public class NodePagePresenter implements INodePageContract.Presenter {

    private INodePageContract.View mNodePageView;

    public NodePagePresenter(@NonNull INodePageContract.View nodePageView) {
        mNodePageView = nodePageView;
        mNodePageView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void loadNodeInfo(long nodeID) {

    }

    @Override
    public void loadNodeInfo(String nodeName) {

    }

    @Override
    public void loadTopics(long nodeID) {

    }

    @Override
    public void loadTopics(String nodeName) {

    }

    @Override
    public void loadLastTopics() {

    }

    @Override
    public void loadHotTopics() {
        TopicRemoteDataSource.getInstance().loadHotTopics(new ITopicDataSource.LoadTopicsCallback() {
            @Override
            public void onTopicsLoaded(List<Topic> topics) {
                mNodePageView.showResults(topics);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }
}
