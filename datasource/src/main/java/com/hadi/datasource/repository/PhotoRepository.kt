package com.hadi.datasource.repository

import android.util.Log
import com.hadi.datasource.model.Photo
import com.hadi.datasource.remote.RetrofitClient
import retrofit2.await

object PhotoRepository {
    private const val TAG = "ToysRepository"

    suspend fun allToys(): List<Photo> {
        return try {
            RetrofitClient.client.getAllPhotosAsync().await()
        } catch (e: Exception) {
            Log.e(TAG, "allToys: ", e)
            emptyList()
        }
    }
}