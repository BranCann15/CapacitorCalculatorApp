package com.brandoncano.capacitorcalculator.util

import com.brandoncano.capacitorcalculator.constants.Units

/**
 * Job: Take a code and format the capacitance based on unit
 */
object CapacitanceFormatter {

    fun execute(code: String, units: String): String {
        if (code.isEmpty()) return ""
        val number = if (code.length == 3) {
            code.dropLast(1).toIntOrNull() ?: return ""
        } else { // Note: toIntOrNull() was added from a crash, though I was unable to reproduce it
            code.toIntOrNull() ?: return ""
        }
        val multiplier = if (code.length == 3) code.takeLast(1) else "0"
        val pico = number * MultiplierFromDigit.execute(multiplier)
        return when (units) {
            Units.PF -> "$pico pF"
            Units.NF -> "${pico.toDouble() / 1000} nF"
            Units.UF -> "${pico.toDouble() / 1000000} µF"
            else -> "$pico pF"
        }
    }
}
