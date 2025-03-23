package com.douraid.tasksmanagement

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.douraid.details.presentation.DetailsScreen
import com.douraid.home.presentation.HomeScreen

@Composable
internal fun MainNavHost(navController: NavHostController) {
    NavHost(
        modifier =
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .windowInsetsPadding(WindowInsets.safeDrawing),
        navController = navController,
        startDestination = MainRoute.Home.route,
    ) {
        composable(route = MainRoute.Home.route) {
            HomeScreen(
                onButtonClicked = {
                    navController.navigate(MainRoute.TaskDetails.route)
                },
            )
        }

        composable(route = MainRoute.TaskDetails.route) {
            DetailsScreen(
                backNavigation = { navController.navigateUp() },
            )
        }
    }
}
