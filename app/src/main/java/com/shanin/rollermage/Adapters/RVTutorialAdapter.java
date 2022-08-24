package com.shanin.rollermage.Adapters;
import com.shanin.rollermage.Models.Tutorial;
import com.shanin.rollermage.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVTutorialAdapter extends RecyclerView.Adapter<RVTutorialAdapter.TutorialViewHolder> {

    private List<Tutorial> tutorials;

    public static class TutorialViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView name;
        TextView diff;
        ImageView image;

        TutorialViewHolder(View v) {
            super(v);
            cardView = v.findViewById(R.id.tutorial_cv);
            name = v.findViewById(R.id.tutorial_cv_name);
            diff = v.findViewById(R.id.tutorial_cv_diff);
            image = v.findViewById(R.id.tutorial_cv_img);
        }
    }

    public RVTutorialAdapter (List<Tutorial> tutorials) {
        this.tutorials = tutorials;
    }

    @Override
    public int getItemCount() {
        return tutorials.size();
    }

    @NonNull
    @Override
    public TutorialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tutorial_item_layout, parent, false);
        TutorialViewHolder viewHolder = new TutorialViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TutorialViewHolder holder, int position) {
        holder.name.setText(tutorials.get(position).getName());
        holder.diff.setText(Integer.toString(tutorials.get(position).getDifficulty()));
        holder.image.setImageResource(tutorials.get(position).getTitleImage());
    }
}
