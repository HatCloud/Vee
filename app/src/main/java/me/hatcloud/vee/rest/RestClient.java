package me.hatcloud.vee.rest;

import java.util.List;

import me.hatcloud.vee.data.entity.Topic;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * Created by Jeff on 05/03/2017.
 */

public class RestClient {
    private static RestClient INSTANCE;

    private V2Service v2Service;

    public static RestClient getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RestClient();
        }
        return INSTANCE;
    }

    private RestClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.v2ex.com")
                .build();

        v2Service = retrofit.create(V2Service.class);
    }

    public void getHotTopics(Callback<List<Topic>> callback) {
        v2Service.getHotTopics().enqueue(callback);
    }
}
