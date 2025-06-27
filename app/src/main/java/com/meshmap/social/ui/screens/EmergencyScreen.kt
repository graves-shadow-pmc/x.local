package com.meshmap.social.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun EmergencyScreen(
    onSendHelp: () -> Unit,
    onReportFoundItem: () -> Unit
) {
    Column {
        Text("Emergency or Lost Item")
        Button(onClick = onSendHelp) { Text("Send Help Request") }
        Button(onClick = onReportFoundItem) { Text("Report Found Item") }
    }
}