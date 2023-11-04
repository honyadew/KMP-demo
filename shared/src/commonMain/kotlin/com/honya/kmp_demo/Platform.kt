package com.honya.kmp_demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform