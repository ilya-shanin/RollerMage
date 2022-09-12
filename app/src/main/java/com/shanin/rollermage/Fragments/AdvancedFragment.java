package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shanin.rollermage.Adapters.RVTutorialAdapter;
import com.shanin.rollermage.Models.Entities.Paragraph;
import com.shanin.rollermage.Models.Entities.Tutorial;
import com.shanin.rollermage.R;

import java.util.ArrayList;
import java.util.List;

public class AdvancedFragment extends BaseTabbedFragment {

    private static final int level = 2;

    public AdvancedFragment() {
        // Required empty public constructor
    }

    public static AdvancedFragment newInstance() {
        AdvancedFragment fragment = new AdvancedFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View provideFragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_advanced, container,false);
        return view;
    }

    @Override
    public RecyclerView provideRecyclerView(View v) {
        RecyclerView recyclerView = v.findViewById(R.id.advanced_tutorial_rv);
        return recyclerView;
    }

    @Override
    public List<Tutorial> loadData(int level) {
        return null;
    }


}