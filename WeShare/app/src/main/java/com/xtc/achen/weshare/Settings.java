package com.xtc.achen.weshare;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.util.Log;

public class Settings extends PreferenceActivity {
    private static final String TAG = "Settings";
    SwitchPreference swp;
    CheckBoxPreference cbp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);

        swp = (SwitchPreference) findPreference("key");
        cbp = (CheckBoxPreference) findPreference("check");


    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {

        if (preference instanceof SwitchPreference) {

            if (swp.isChecked()) {
                Log.d(Contans.TAG, "SwitchPreference is checked");
            }
        }

        if (preference instanceof CheckBoxPreference) {

            if (cbp.isChecked()) {
                Log.d(Contans.TAG, "CheckBoxPreference is checked");
            }
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }
}
