package com.androidemu.leo.server

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path


interface  HttpService {
    @GET("group/{id}/users")
   suspend fun getBaiduData(@Path("id") groupId: Int): ResponseBody
}