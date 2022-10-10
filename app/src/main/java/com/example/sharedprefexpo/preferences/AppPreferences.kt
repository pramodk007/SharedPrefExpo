package com.example.sharedprefexpo.preferences

import android.content.Context
import android.content.SharedPreferences

class AppPreferences (context: Context){

    val pref: SharedPreferences =
        context.getSharedPreferences(PreferenceConstants.PREF_NAME, Context.MODE_PRIVATE)

}