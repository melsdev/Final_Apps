package com.example.final_3ercorte;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private List<Hero> heroes;

    public HomeAdapter(List<Hero> heroes) {
        this.heroes = heroes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        holder.name.setText(hero.getName());
        holder.description.setText(hero.getDescription());
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
        }
    }
}
