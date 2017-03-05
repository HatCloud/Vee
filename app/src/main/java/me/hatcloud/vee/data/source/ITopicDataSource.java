package me.hatcloud.vee.data.source;

import android.support.annotation.NonNull;

import java.util.List;

import me.hatcloud.vee.data.entity.Topic;

/**
 * Created by Jeff on 05/03/2017.
 */

public interface ITopicDataSource {
    interface LoadTopicsCallback {

        void onTopicsLoaded(List<Topic> topics);

        void onDataNotAvailable();
    }

    interface LoadTaskCallback {

        void onTopicLoaded(Topic topic);

        void onDataNotAvailable();
    }

    void loadHotTopics(@NonNull LoadTopicsCallback callback);

    void loadTopic(long topicId, @NonNull LoadTaskCallback callback);

}
