package com.enridev.spotlarm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform