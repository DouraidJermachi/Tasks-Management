package com.douraid.tasksmanagement

sealed class MainRoute(
    val route: String,
) {
    data object Home : MainRoute("home")

    data object TaskDetails : MainRoute("task_details")
}
