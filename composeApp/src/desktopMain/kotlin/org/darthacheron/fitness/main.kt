package org.darthacheron.fitness

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.darthacheron.fitness.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "FitnessTracker",
        ) {
            App()
        }
    }
}