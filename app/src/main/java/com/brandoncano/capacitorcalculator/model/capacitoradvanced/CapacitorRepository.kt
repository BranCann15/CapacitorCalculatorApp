package com.brandoncano.capacitorcalculator.model.capacitoradvanced

import android.content.Context
import com.brandoncano.capacitorcalculator.data.SharedPreferences

class CapacitorRepository(context: Context) {

    private val application = context

    companion object {
        private var instance: CapacitorRepository? = null
        fun getInstance(context: Context): CapacitorRepository = instance
            ?: synchronized(this) {
                CapacitorRepository(context).also {
                    instance = it
                }
            }
    }

    fun clear() {
        SharedPreferences.CODE_INPUT_CAPACITOR.clearData(application)
        SharedPreferences.CAPACITANCE_INPUT_CAPACITOR.clearData(application)
        SharedPreferences.UNITS_DROPDOWN_CAPACITOR.clearData(application)
        SharedPreferences.TOLERANCE_DROPDOWN_CAPACITOR.clearData(application)
        SharedPreferences.VOLTAGE_DROPDOWN_CAPACITOR.clearData(application)
    }

    fun loadCapacitor(): CapacitorAdvanced {
        val code = SharedPreferences.CODE_INPUT_CAPACITOR.loadData(application)
        val capacitance = SharedPreferences.CAPACITANCE_INPUT_CAPACITOR.loadData(application)
        val units = SharedPreferences.UNITS_DROPDOWN_CAPACITOR.loadData(application)
        val tolerance = SharedPreferences.TOLERANCE_DROPDOWN_CAPACITOR.loadData(application)
        val voltageRating = SharedPreferences.VOLTAGE_DROPDOWN_CAPACITOR.loadData(application)
        return CapacitorAdvanced(code, capacitance, tolerance, units, voltageRating)
    }

    fun saveCapacitor(capacitorAdvanced: CapacitorAdvanced) {
        SharedPreferences.CODE_INPUT_CAPACITOR.saveData(application, capacitorAdvanced.code)
        SharedPreferences.CAPACITANCE_INPUT_CAPACITOR.saveData(application, capacitorAdvanced.capacitance)
        SharedPreferences.UNITS_DROPDOWN_CAPACITOR.saveData(application, capacitorAdvanced.units)
        SharedPreferences.TOLERANCE_DROPDOWN_CAPACITOR.saveData(application, capacitorAdvanced.tolerance)
        SharedPreferences.VOLTAGE_DROPDOWN_CAPACITOR.saveData(application, capacitorAdvanced.voltageRating)
    }
}
