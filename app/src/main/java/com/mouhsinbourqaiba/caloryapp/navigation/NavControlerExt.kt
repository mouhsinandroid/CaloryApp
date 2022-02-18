package com.mouhsinbourqaiba.caloryapp.navigation

import androidx.navigation.NavController
import com.mouhsinbourqaiba.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}