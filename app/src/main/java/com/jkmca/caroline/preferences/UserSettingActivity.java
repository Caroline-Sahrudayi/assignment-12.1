package com.jkmca.caroline.preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
// Create a Class which extends PreferenceActivity class
public class UserSettingActivity extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // add the xml resource
        addPreferencesFromResource(R.xml.user_settings);

    }
}
