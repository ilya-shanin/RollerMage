package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shanin.rollermage.Adapters.RVTutorialAdapter;
import com.shanin.rollermage.Models.Paragraph;
import com.shanin.rollermage.Models.Tutorial;
import com.shanin.rollermage.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MagicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MagicFragment extends Fragment {
    private List<Tutorial> tutorials;
    private List<Integer> images;
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
        View v = inflater.inflate(R.layout.fragment_magic, container, false);

        initData();
        RecyclerView recyclerView = v.findViewById(R.id.magic_tutorial_rv);
        LinearLayoutManager llManager = new LinearLayoutManager(getActivity());
        RVTutorialAdapter adapter = new RVTutorialAdapter(tutorials);

        recyclerView.setLayoutManager(llManager);
        recyclerView.setAdapter(adapter);

        return v;
    }

    private void initData() {

        images = new ArrayList<>();
        images.add(R.drawable.baseline_bug_report_24);

        Paragraph p1 = new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum mollis malesuada vehicula. " +
                "Integer at ipsum sollicitudin, vulputate dolor eu, tempus enim. Morbi eget euismod nisl, quis tempor velit. " +
                "Phasellus et nulla a felis volutpat placerat. Mauris mattis, nibh congue efficitur hendrerit, " +
                "sem dolor finibus augue, ac lacinia urna arcu vitae purus. " +
                "Curabitur posuere posuere lorem in interdum. Donec quis iaculis nibh. " +
                "Nam rhoncus nisl id dui finibus, ac lobortis leo iaculis.");
        Paragraph p2 = new Paragraph("In hac habitasse platea dictumst. Aliquam erat volutpat. Morbi vel purus non tortor dignissim tincidunt. " +
                "Nulla sit amet tristique mi. Morbi eleifend erat quam, in malesuada dolor volutpat et. " +
                "Cras commodo leo arcu. Integer id tellus cursus, tincidunt dui sed, consectetur urna.",
                images);

        List<Paragraph> tcontent1 = new ArrayList<>();
        List<Paragraph> tcontent2 = new ArrayList<>();
        tcontent1.add(p1);
        tcontent2.add(p2);

        Tutorial tutorial1 = new Tutorial("Fifth", 9, R.drawable.ic_circle_zero, 3, tcontent1);
        Tutorial tutorial2 = new Tutorial("Sixth", 9, R.drawable.ic_circle_zero, 3, tcontent2);

        tutorials = new ArrayList<>();
        tutorials.add(tutorial1);
        tutorials.add(tutorial2);
    }
}