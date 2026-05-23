package uz.muhammad.hilt_di_app.data.repository.posts

import uz.muhammad.hilt_di_app.data.remote.api.ApiService
import uz.muhammad.hilt_di_app.data.remote.dto.posts.Posts

class PostsRepository(private val api: ApiService): PostsRepositoryInterface {
    override suspend fun getPosts(): Result<Posts> {
        return try {
            val response = api.getPosts()
            val body = response.body()
            if(body!=null){
                Result.success(body)
            }else{
                Result.failure(Exception("Empty response body"))
            }
        } catch (e: Exception){
            Result.failure(e)
        }
    }
}