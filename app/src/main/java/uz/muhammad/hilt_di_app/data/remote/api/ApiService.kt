package uz.muhammad.hilt_di_app.data.remote.api

import retrofit2.Response
import retrofit2.http.GET
import uz.muhammad.hilt_di_app.data.remote.dto.posts.Posts

interface ApiService {
    @GET("/posts")
    suspend fun getPosts(): Response<Posts>
}