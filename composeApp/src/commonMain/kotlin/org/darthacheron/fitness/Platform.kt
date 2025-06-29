package org.darthacheron.fitness

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform