package com.scujcc.dada.helper

import com.scujcc.dada.content.ContentItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by  范朝波 on 2018/1/6.
 * 微信    ：family997722
 * QQ号    ：1136836811
 */

interface GetRequest {

    @GET("dada/content/{id}")
    fun getContent(@Path("id") id: String): Call<Content>

    @GET("dada/user/{id}")
    fun getUser(@Path("id") id: String): Call<User>
}