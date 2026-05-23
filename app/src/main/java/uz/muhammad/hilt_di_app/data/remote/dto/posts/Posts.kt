package uz.muhammad.hilt_di_app.data.remote.dto.posts

data class Posts(
    val limit: Int,
    val posts: List<Post>,
    val skip: Int,
    val total: Int
)