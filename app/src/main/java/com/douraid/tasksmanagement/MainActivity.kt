package com.douraid.tasksmanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.douraid.tasksmanagement.theme.TasksManagementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            enableEdgeToEdge()

            val navController = rememberNavController()

            TasksManagementTheme {
                MainNavHost(
                    navController = navController,
                )
            }
        }
    }
}
