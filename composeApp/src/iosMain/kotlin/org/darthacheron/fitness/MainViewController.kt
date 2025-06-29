package org.darthacheron.fitness

import androidx.compose.ui.window.ComposeUIViewController
import org.darthacheron.fitness.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }