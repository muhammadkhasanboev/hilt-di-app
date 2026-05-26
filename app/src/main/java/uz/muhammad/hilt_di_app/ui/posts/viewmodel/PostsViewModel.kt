package uz.muhammad.hilt_di_app.ui.posts.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import uz.muhammad.hilt_di_app.data.repository.posts.PostsRepository
import javax.inject.Inject

@HiltViewModel
class PostsViewModel @Inject constructor(
    private val repository: PostsRepository
): ViewModel() {
    private val _post = MutableStateFlow<String>(value = "")
    val post: StateFlow<String> = _post

    fun getPosts() = viewModelScope.launch {
        val result = repository.getPosts()

        result.onSuccess {
            _post.value = it.posts[0].body
        }
    }
}