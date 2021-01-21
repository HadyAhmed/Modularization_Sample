package com.hadi.datasource.remote

import com.hadi.datasource.model.Photo
import retrofit2.Call
import retrofit2.http.GET

interface BaseApi {
    @GET("photos")
    fun getAllPhotosAsync(): Call<List<Photo>>
}