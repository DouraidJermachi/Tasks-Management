package com.douraid.tasksmanagement.model

sealed interface MainEvent {
    data object OnButtonClicked : MainEvent
}
