package com.jrg.pisang.timesapp.Api;

import com.jrg.pisang.timesapp.Model.Headline;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("all_news/")
    Call<Headline> getNewsHeadline(
            @Query("key") String key,
            @Query("news_type") String news_type,
            @Query("offset") int offset,
            @Query("limit") int limit
    );

}