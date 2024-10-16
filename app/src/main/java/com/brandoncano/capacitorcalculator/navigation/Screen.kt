package com.brandoncano.capacitorcalculator.navigation

/**
 * Note: Keep screens in alphabetical order
 */
sealed class Screen(val route: String) {
    data object About : Screen("about_screen")
    data object CapacitorCodeValues : Screen("capacitor_code_values")

    data object CapacitorCalculator : Screen("capacitor_calculator_screen")
    data object CapacitorValues : Screen("capacitor_values_screen")
    data object CommonCodes : Screen("common_codes")
    data object Home : Screen("home_screen")
    data object Information : Screen("information_screen")
    data object InformationDetails : Screen("information_details_screen")
    data object Smd : Screen("smd_calculator_screen")
    data object ViewOurApps : Screen("view_our_apps")
}
