package com.douraid.details.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen(backNavigation: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Details screen",
            style = MaterialTheme.typography.titleMedium,
        )

        Spacer(
            modifier = Modifier.weight(1f),
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp),
            onClick = backNavigation,
        ) {
            Text(text = "Go back")
        }
    }
}
