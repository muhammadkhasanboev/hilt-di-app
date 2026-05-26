package uz.muhammad.hilt_di_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import jakarta.inject.Inject
import uz.muhammad.hilt_di_app.data.repository.posts.PostsRepository
import uz.muhammad.hilt_di_app.ui.posts.ui.PostsScreen
import uz.muhammad.hilt_di_app.ui.theme.HiltDIappTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var postsRepository: PostsRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HiltDIappTheme {
                PostsScreen()
            }
        }
    }
}

