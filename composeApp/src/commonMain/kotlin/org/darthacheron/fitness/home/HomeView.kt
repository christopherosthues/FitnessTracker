package org.darthacheron.fitness.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.serialization.Serializable
import org.darthacheron.fitness.dependencies.MyViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Serializable
object Home

@Composable
@Preview
fun HomeView() {
    val viewModel = koinViewModel<MyViewModel>()
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = viewModel.getHelloWorldString())
    }
}