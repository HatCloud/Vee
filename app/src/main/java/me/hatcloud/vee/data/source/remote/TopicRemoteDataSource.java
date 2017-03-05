package me.hatcloud.vee.data.source.remote;

import android.support.annotation.NonNull;

import java.util.List;

import me.hatcloud.vee.data.entity.Topic;
import me.hatcloud.vee.data.source.ITopicDataSource;
import me.hatcloud.vee.rest.RestClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jeff on 05/03/2017.
 */

public class TopicRemoteDataSource implements ITopicDataSource {

    public static TopicRemoteDataSource INSTANCE;

    public static TopicRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TopicRemoteDataSource();
        }
        return INSTANCE;
    }

    private TopicRemoteDataSource(){}

    @Override
    public void loadHotTopics(@NonNull final LoadTopicsCallback callback) {
        RestClient.getInstance().getHotTopics(new Callback<List<Topic>>() {
            @Override
            public void onResponse(Call<List<Topic>> call, Response<List<Topic>> response) {
                if (response == null || response.body() == null) {
                    callback.onDataNotAvailable();
                    return;
                }
                callback.onTopicsLoaded(response.body());
            }

            @Override
            public void onFailure(Call<List<Topic>> call, Throwable t) {
                callback.onDataNotAvailable();
            }
        });
    }

    @Override
    public void loadTopic(long topicId, @NonNull LoadTaskCallback callback) {

    }
}
