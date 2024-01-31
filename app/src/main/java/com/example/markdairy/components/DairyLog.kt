package com.example.markdairy.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.markdairy.model.DairyRecord
import com.example.markdairy.ui.theme.MarkDairyTheme

@Composable
fun DairyLog(records: List<DairyRecord>) {
    LazyColumn {
        items(records) {
            record -> DairyRecordCart(record = record)
        }
    }
}

@Preview
@Composable
fun PreviewDairyLog() {
    MarkDairyTheme {
        Surface {
            DairyLog(records = listOf(
                DairyRecord("my first record"),
                DairyRecord("second record")
            ))
        }
    }
}
