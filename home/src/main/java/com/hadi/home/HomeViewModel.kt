package com.hadi.home

import com.hadi.datasource.repository.PhotoRepository

class HomeViewModel(private val photoRepository: PhotoRepository) {
    suspend fun fetchAllToys() = photoRepository.allToys()
}