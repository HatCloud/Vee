package me.hatcloud.vee.rest;

import java.util.List;

import me.hatcloud.vee.data.entity.Topic;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Jeff on 05/03/2017.
 */

public interface V2Service {

    @GET("/api/topics/latest.json")
    Call<List<Topic>> getLastTopics();

    @GET("/api/topics/hot.json")
    Call<List<Topic>> getHotTopics();

    @GET("/api/topics/show.json")
    Call<List<Topic>> getTopicsByNodeId(@Query("node_id") long node_id);

    @GET("/api/topics/show.json")
    Call<List<Topic>> getTopicsByNodeName(@Query("node_name") String node_name);

    @GET("/api/topics/show.json")
    Call<List<Topic>> getTopicsByUsername(@Query("username") String username);

    @GET("/api/topics/show.json")
    Call<Topic> getTopic(@Query("id") long topicId);

}
