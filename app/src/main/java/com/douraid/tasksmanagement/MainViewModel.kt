package com.douraid.tasksmanagement

import androidx.lifecycle.ViewModel
import com.douraid.tasksmanagement.model.MainEvent
import com.douraid.tasksmanagement.model.MainState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {
    private val privateState = MutableStateFlow(
        MainState(),
    )

    internal val state: StateFlow<MainState>
        get() = privateState.asStateFlow()

    internal fun onEvent(event: MainEvent) {
        when (event) {
            MainEvent.OnButtonClicked -> {
                privateState.update {
                    it.copy(clickedCount = it.clickedCount + 1)
                }
            }
        }
    }
}
