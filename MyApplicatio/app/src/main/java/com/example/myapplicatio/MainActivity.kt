package com.example.myapplicatio
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicatio.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}
@Composable
fun LoginScreen() {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // LOGIN TITLE
        Text(
            text = "Login",
            fontSize = 30.sp,
            color = PurpleGrey40,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(40.dp)
        )
        // USERNAME ROW
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Username:",
                fontSize = 18.sp,
                modifier = Modifier.width(100.dp)
            )
            OutlinedTextField(
                value = username,
                onValueChange = {
                    username = it
                },
                modifier = Modifier
                    .weight(1f),
                placeholder = {
                    Text("Enter username")
                }
            )
        }
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        // PASSWORD ROW
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Password:",
                fontSize = 18.sp,
                modifier = Modifier.width(100.dp)
            )
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                modifier = Modifier
                    .weight(1f),
                placeholder = {
                    Text("Enter password")
                },
                visualTransformation = PasswordVisualTransformation()
            )
        }
        Spacer(
            modifier = Modifier.height(40.dp)
        )
        // LOGIN BUTTON
        Button(
            onClick = {
                // Handle login here
            }
        ) {
            Text(
                text = "LOGIN"
            )
        }
    }
}