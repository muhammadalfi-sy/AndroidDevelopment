package com.example.androiddevelopment.retrofit

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

val BASE_URL = "https://newsapi.org/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {
    @GET("top-headlines?country=id&apiKey=1c0bed622df14993bab444ba3742f369")
    suspend fun getTopHeadline(): String

    @GET("everything?q=bitcoin&apiKey=1c0bed622df14993bab444ba3742f369")
    suspend fun getEverything(): String
}

object NewsApi {
    val retrofitService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}