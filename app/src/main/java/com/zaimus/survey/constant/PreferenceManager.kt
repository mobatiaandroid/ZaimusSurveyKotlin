package com.zaimus.survey.constant

import android.content.Context
import android.content.SharedPreferences

class PreferenceManager {

    companion object{

        private val PREFSNAME = "ZAIMUS_SURVEY"

        /************************* LOGIN FLAG ************************/
        fun setLoginFlag(context: Context, flag: String?) {
            val prefs = context.getSharedPreferences(PREFSNAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString("login_flag", flag.toString())
            editor.apply()
        }
        fun getLoginFlag(context: Context): String? {
            val prefs = context.getSharedPreferences(PREFSNAME, Context.MODE_PRIVATE)
            return prefs.getString("login_flag", "0")
        }

        /************************* TOKEN ************************/
        fun setToken(context: Context, token: String?) {
            val prefs = context.getSharedPreferences(PREFSNAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString("token", token)
            editor.apply()
        }
        fun getToken(context: Context): String? {
            val prefs = context.getSharedPreferences(PREFSNAME, Context.MODE_PRIVATE)
            return prefs.getString("token", "")
        }


    }
}