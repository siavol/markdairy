package com.example.markdairy.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.markdairy.model.DairyRecord
import com.example.markdairy.ui.theme.MarkDairyTheme

@Composable
fun DairyRecordCart(record: DairyRecord, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(all = 8.dp)) {
        Text(
            text = record.title,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview
@Composable
fun PreviewDairyRecordCart() {
    MarkDairyTheme {
        Surface {
            DairyRecordCart(record = DairyRecord("My test record"))
        }
    }
}
