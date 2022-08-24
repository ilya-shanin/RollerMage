package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shanin.rollermage.Adapters.RVTutorialAdapter;
import com.shanin.rollermage.Models.Content;
import com.shanin.rollermage.Models.Tutorial;
import com.shanin.rollermage.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BasicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BasicFragment extends Fragment {

    private List<Tutorial> tutorials;
    private List<Integer> images;
    public BasicFragment() {
        // Required empty public constructor
    }

    public static BasicFragment newInstance() {
        BasicFragment fragment = new BasicFragment();
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

        View v = inflater.inflate(R.layout.fragment_basic, container, false);

        initData();
        RecyclerView recyclerView = v.findViewById(R.id.tutorial_rv);
        LinearLayoutManager llManager = new LinearLayoutManager(getContext());
        RVTutorialAdapter adapter = new RVTutorialAdapter(tutorials);

        recyclerView.setLayoutManager(llManager);
        recyclerView.setAdapter(adapter);

        return v;
    }

    private void initData() {
        images = new ArrayList<>();
        images.add(R.drawable.baseline_bug_report_24);
        tutorials = new ArrayList<>();
        tutorials.add(new Tutorial(
                "First",
                1,
                R.drawable.ic_circle_zero,
                1,
                new Content("Lorem ipsum", "my url", images),
                "В этом уроке вы научитесь правильно стоять на коньках"
        ));
        tutorials.add(new Tutorial(
                "Second",
                2,
                R.drawable.ic_circle_zero,
                1,
                new Content("Lorem ipsum", "my url2", images),
                "Вы узнаете как удерживать равновесие"
        ));
    }
}