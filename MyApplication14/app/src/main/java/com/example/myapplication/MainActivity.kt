package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {

                    LoginScreen()
                }
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