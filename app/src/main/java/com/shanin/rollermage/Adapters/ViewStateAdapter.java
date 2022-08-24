package com.shanin.rollermage.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.shanin.rollermage.Fragments.AdvancedFragment;
import com.shanin.rollermage.Fragments.BasicFragment;
import com.shanin.rollermage.Fragments.MagicFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ViewStateAdapter extends FragmentStateAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();

    public ViewStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, Map<Integer, Fragment> pageMap) {
        super(fragmentManager, lifecycle);
        /*fragmentList.add(BasicFragment.newInstance());
        fragmentList.add(AdvancedFragment.newInstance());
        fragmentList.add(MagicFragment.newInstance());*/
        for (Map.Entry<Integer, Fragment> entry: pageMap.entrySet()) {
            fragmentList.add(entry.getValue());
        }
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return getItem(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }

    @NonNull
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }
}
