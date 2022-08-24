package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shanin.rollermage.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MagicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MagicFragment extends Fragment {

    public MagicFragment() {
        // Required empty public constructor
    }

    public static MagicFragment newInstance() {
        MagicFragment fragment = new MagicFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_magic, container, false);
    }
}