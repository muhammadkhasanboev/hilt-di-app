package uz.muhammad.hilt_di_app.data.repository.posts

import uz.muhammad.hilt_di_app.data.remote.dto.posts.Posts

interface PostsRepositoryInterface {
    suspend fun getPosts(): Result<Posts>
}