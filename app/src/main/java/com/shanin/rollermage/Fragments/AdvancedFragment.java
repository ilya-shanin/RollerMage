package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.shanin.rollermage.Models.Entities.Tutorial;
import com.shanin.rollermage.R;
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

        return inflater.inflate(R.layout.fragment_advanced, container,false);
    }

    @Override
    public RecyclerView provideRecyclerView(View v) {
        return v.findViewById(R.id.advanced_tutorial_rv);
    }

    @Override
    public List<Tutorial> loadData(int level) {
        return null;
    }


}