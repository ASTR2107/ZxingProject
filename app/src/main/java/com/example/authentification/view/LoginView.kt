import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import com.example.authentification.model.data.Retroift.AuthApi
import com.example.authentification.viewmodel.BaseActivity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope


@Composable
fun LogIn(navController: NavController, viewModel: BaseActivity) {

    val message = remember {
        mutableStateOf("")
    }

    val coroutineScope: CoroutineScope =
        rememberCoroutineScope()

    lateinit var authApi: AuthApi




    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                imageVector = Icons.Filled.Person,
                contentDescription = ""
            )

            TextField(value = message.value,
                onValueChange = {},
                singleLine = false,
                trailingIcon = { Icons.Filled.ArrowForward },
                placeholder = { Text(text = "Login") })

            TextField(value = message.value,
                onValueChange = {},
                singleLine = false,
                trailingIcon = { Icons.Filled.Lock },
                placeholder = { Text(text = "Password") })

            Button(onClick = {
                viewModel.login(
                    username = (""),
                    password = ("")
                )
            })
            {
                Text(text = "дальше")

            }
        }


    }
}

