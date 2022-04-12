package com.example.mynavigationpart2

import android.graphics.drawable.AdaptiveIconDrawable
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int=0
)
