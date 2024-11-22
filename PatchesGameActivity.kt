package com.example.firebase.pages

import android.view.LayoutInflater
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.firebase.R

@Composable
fun PatchesGamePage(modifier: Modifier = Modifier) {
    // Inflate the XML layout within Compose using AndroidView
    AndroidView(
        factory = { context ->
            LayoutInflater.from(context).inflate(R.layout.activity_patches_game, null)
        },
        modifier = modifier
    )
}
