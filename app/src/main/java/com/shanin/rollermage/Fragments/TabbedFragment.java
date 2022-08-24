package com.shanin.rollermage.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.shanin.rollermage.Adapters.ViewStateAdapter;
import com.shanin.rollermage.R;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabbedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabbedFragment extends Fragment {

    public TabbedFragment() {
        // Required empty public constructor
    }

    public static TabbedFragment newInstance() {
        TabbedFragment fragment = new TabbedFragment();
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
        View v = inflater.inflate(R.layout.fragment_tabbed, container, false);

        Map<Integer, Fragment> pageMap = new LinkedHashMap<>();

        pageMap.put(R.string.basic, BasicFragment.newInstance());
        pageMap.put(R.string.advanced, AdvancedFragment.newInstance());
        pageMap.put(R.string.magic, MagicFragment.newInstance());

        setupTabs(v, pageMap);

        return v;
    }

    public void setupTabs(View v, Map<Integer, Fragment> pageMap){
        FragmentManager fragmentManager = getChildFragmentManager();
        ViewStateAdapter stateAdapter = new ViewStateAdapter(fragmentManager, getLifecycle(), pageMap);
        final ViewPager2 viewPager2 = v.findViewById(R.id.tabs_bar_viewpager2);
        viewPager2.setAdapter(stateAdapter);

        final TabLayout tabLayout = v.findViewById(R.id.tab_layout);
        /*tabLayout.addTab(tabLayout.newTab().setText(R.string.basic));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.advanced));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.magic));*/

        for (Map.Entry<Integer, Fragment> entry: pageMap.entrySet()) {
            tabLayout.addTab(tabLayout.newTab().setText(entry.getKey()));
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}