package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;


import com.shanin.rollermage.R;

import java.util.Objects;

public class SettingsFragment extends PreferenceFragmentCompat {

    public SettingsFragment() {
        // Required empty public constructor
    }

    public static SettingsFragment newInstance() {
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // not used
        }
    }

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.preference_screen, rootKey);

        Preference prefAbout = findPreference("about");
        Preference prefLicense = findPreference("license");

        prefAbout.setOnPreferenceClickListener(listener);
        prefLicense.setOnPreferenceClickListener(listener);
    }

    Preference.OnPreferenceClickListener listener = preference -> {
        if (Objects.equals(preference.getKey(), "about")) {
            Navigation.findNavController(getView()).navigate(R.id.action_sidebar_settings_to_dest_about);
            return true;
        } else if (Objects.equals(preference.getKey(), "license")) {
            Navigation.findNavController(getView()).navigate(R.id.action_sidebar_settings_to_dest_license);
            return true;
        }
        return false;
    };
}