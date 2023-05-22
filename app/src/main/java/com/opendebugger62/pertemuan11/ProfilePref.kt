package com.opendebugger62.pertemuan11

import android.content.Context
import android.content.SharedPreferences
import android.icu.lang.UProperty.AGE

class ProfilePref(context : Context) {
    companion object {
        const val SP_Name = "profile_pref"
        const val Name = "name"
        const val Gender = "Gender"
    }

    val preference : SharedPreferences = context.getSharedPreferences(SP_Name, Context.MODE_PRIVATE)
    fun setProfile(profile : Profile) {
        val prefEditor : SharedPreferences.Editor = preference.edit()
        prefEditor.putString(Name, profile.name)
        profile.age?.let { prefEditor.putInt(AGE.toString(), it) }
        prefEditor.putString(Gender, profile.gender)
        prefEditor.apply()
    }
    fun getProfile(): Profile {
        val profile = Profile()
        profile.name = preference.getString(Name, "")
        profile.age = preference.getInt(AGE.toString(), 0)
        profile.gender = preference.getString(Gender, "")
        return profile
    }
}