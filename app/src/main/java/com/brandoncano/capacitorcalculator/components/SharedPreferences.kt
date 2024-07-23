package com.brandoncano.capacitorcalculator.components

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

/**
 * Job: Holds the names, keys, and methods for all shared_prefs data.
 *
 * Notes:
 *   Data is saved as xml files with mapping, where name_ -> file name; key_ -> key in map.
 *   Device File Explorer -> data -> data -> com.brandoncano.capacitorcalculator -> shared_prefs
 */
enum class SharedPreferences(private val _name: String, private val _key: String) {

    CODE_INPUT_CERAMIC("ceramic_calculator", "code_input"),
    CAPACITANCE_INPUT_CERAMIC("ceramic_calculator", "capacitance_input"),
    UNITS_DROPDOWN_CERAMIC("ceramic_calculator", "units_dropdown"),
    TOLERANCE_DROPDOWN_CERAMIC("ceramic_calculator", "tolerance_dropdown"),

    NAVBAR_SELECTION_SMD("smd_calculator", "navbar_selection"),
    CODE_INPUT_SMD("smd_calculator", "code_input"),
    UNITS_DROPDOWN_SMD("smd_calculator", "units_dropdown"),

    ; // methods to save, load, or clear the data as strings

    fun saveData(context: Context, input: String) {
        val sharedPreferences = context.getSharedPreferences(_name, AppCompatActivity.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val gson = Gson()
        val json: String = gson.toJson(input)
        editor.putString(_key, json)
        editor.apply()
    }

    fun loadData(context: Context): String {
        val sharedPreferences = context.getSharedPreferences(_name, AppCompatActivity.MODE_PRIVATE)
        val gson = Gson()
        val json = sharedPreferences.getString(_key, null)
        val type: Type = object : TypeToken<String?>() {}.type
        return gson.fromJson<String?>(json, type) ?: return ""
    }

    fun clearData(context: Context) {
        val sharedPreferences = context.getSharedPreferences(_name, AppCompatActivity.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear().apply()
    }
}