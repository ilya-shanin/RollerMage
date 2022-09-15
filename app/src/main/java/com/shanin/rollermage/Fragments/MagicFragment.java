package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.shanin.rollermage.Models.Entities.Tutorial;
import com.shanin.rollermage.R;
import java.util.List;

public class MagicFragment extends BaseTabbedFragment {

    private static final int level = 3;

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
    }

    @Override
    public View provideFragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_magic, container,false);
    }

    @Override
    public RecyclerView provideRecyclerView(View v) {
        return v.findViewById(R.id.magic_tutorial_rv);
    }

    @Override
    public List<Tutorial> loadData(int level) {
        return null;
    }
}