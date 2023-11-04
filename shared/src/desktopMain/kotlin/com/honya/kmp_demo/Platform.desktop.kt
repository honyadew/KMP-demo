package com.honya.kmp_demo

class DesktopPlatform : Platform {
    override val name: String = "Desktop ${123}"
}

actual fun getPlatform(): Platform = DesktopPlatform()