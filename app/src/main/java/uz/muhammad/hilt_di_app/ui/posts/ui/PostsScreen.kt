package uz.muhammad.hilt_di_app.ui.posts.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import uz.muhammad.hilt_di_app.ui.posts.viewmodel.PostsViewModel

@Composable
fun PostsScreen(
    viewModel: PostsViewModel = hiltViewModel()
){
    val post by viewModel.post.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Button(
            onClick = {
                viewModel.getPosts()
            }
        ){
            Text("Get post")
        }

        Text(post)
    }
}