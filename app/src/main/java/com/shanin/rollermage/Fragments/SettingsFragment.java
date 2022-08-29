package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;


import com.shanin.rollermage.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
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

    /*
    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    } */

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