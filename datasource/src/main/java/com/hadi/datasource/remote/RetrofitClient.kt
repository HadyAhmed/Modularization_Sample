package com.hadi.datasource.remote

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val client: BaseApi = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .addConverterFactory(GsonConverterFactory.create(Gson()))
        .build().create(BaseApi::class.java)
}