package com.example.sharedprefexpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedprefexpo.common.utils.PreferenceHelper.get
import com.example.sharedprefexpo.common.utils.PreferenceHelper.set
import com.example.sharedprefexpo.databinding.ActivityMainBinding
import com.example.sharedprefexpo.preferences.AppPreferences
import com.example.sharedprefexpo.preferences.PreferenceConstants
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appPreferences: AppPreferences

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appPreferences.pref[PreferenceConstants.PREF_USER_NAME] = "Pramod kumar"
        val str = appPreferences.pref[PreferenceConstants.PREF_USER_NAME, ""]

        binding.tv.text = str
    }
}