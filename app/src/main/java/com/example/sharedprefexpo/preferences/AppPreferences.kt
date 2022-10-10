package com.example.sharedprefexpo.preferences

import android.content.Context
import android.content.SharedPreferences
import com.example.sharedprefexpo.common.utils.PreferenceHelper.get
import com.example.sharedprefexpo.common.utils.PreferenceHelper.set

class AppPreferences (context: Context){

    val pref: SharedPreferences =
        context.getSharedPreferences(PreferenceConstants.PREF_NAME, Context.MODE_PRIVATE)

    var name:String
        get() {
            return pref[PreferenceConstants.PREF_USER_NAME, ""]
        }
        set(name){
            pref[PreferenceConstants.PREF_USER_NAME] = name
    }

}