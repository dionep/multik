package com.airatlovesmusic.network

import com.airatlovesmusic.model.Article
import retrofit2.http.GET

interface ApiClient {
    @GET("multik/master/articles.json")
    suspend fun getArticles(): List<Article>
}