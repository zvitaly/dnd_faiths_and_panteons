package com.dnd.faithsandpantheons.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dnd.faithsandpantheons.R;
import com.dnd.faithsandpantheons.items.FaithsAndPantheonsItem;

import java.util.List;

public class FaithsAndPantheonsAdapter extends RecyclerView.Adapter<FaithsAndPantheonsAdapter.FaithsAndPantheonsViewHolder> {

    private List<FaithsAndPantheonsItem> items;

    public FaithsAndPantheonsAdapter(List<FaithsAndPantheonsItem> items) {
        this.items = items;
    }

    public void updateList(List<FaithsAndPantheonsItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public FaithsAndPantheonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_faiths_and_pantheons, parent, false);

        return new FaithsAndPantheonsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaithsAndPantheonsViewHolder holder, int position) {
        holder.bind(this.items.get(position));
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    class FaithsAndPantheonsViewHolder extends RecyclerView.ViewHolder {

        TextView nameItemView;
        TextView worldviewItemView;

        FaithsAndPantheonsViewHolder(@NonNull View itemView) {
            super(itemView);

            nameItemView = itemView.findViewById(R.id.list_item_faiths_and_pantheons_name);
            worldviewItemView = itemView.findViewById(R.id.list_item_faiths_and_pantheons_worldview);
        }

        void bind(FaithsAndPantheonsItem item) {
            nameItemView.setText(item.getName());
            worldviewItemView.setText("Мировоззрение: " + item.getWorldview());
        }
    }
}
