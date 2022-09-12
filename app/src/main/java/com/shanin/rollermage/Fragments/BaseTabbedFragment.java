package com.shanin.rollermage.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shanin.rollermage.Adapters.RVTutorialAdapter;
import com.shanin.rollermage.Models.Entities.Tutorial;
import com.shanin.rollermage.R;

import java.util.List;

public abstract class BaseTabbedFragment extends Fragment implements RVTutorialAdapter.ItemClickListener {

    private List<Tutorial> data;
    RVTutorialAdapter adapter;
    private int level;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
        data = loadData(level);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = provideFragmentView(inflater, container, savedInstanceState);
        setupRecyclerView(v, data);

        return v;
    }

    @Override
    public void onItemClick(View v, int position) {
        Toast.makeText(getContext(), "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }

    public void setupRecyclerView(View v, List<Tutorial> data){
        RecyclerView recyclerView = provideRecyclerView(v);
        LinearLayoutManager llManager = new LinearLayoutManager(getContext());
        adapter = new RVTutorialAdapter(data);

        recyclerView.setLayoutManager(llManager);
        recyclerView.setAdapter(adapter);
    }

    public abstract View provideFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState);
    public abstract RecyclerView provideRecyclerView(View v);
    public abstract List<Tutorial> loadData(int level);
}
