package com.meshmap.social.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun LoadingIndicator(modifier: Modifier = Modifier) {
    CircularProgressIndicator(modifier = modifier)
}

@Composable
fun ErrorMessage(message: String, onRetry: (() -> Unit)? = null) {
    Text(message, color = MaterialTheme.colorScheme.error)
    if (onRetry != null) {
        Button(onClick = onRetry) { Text("Retry") }
    }
}