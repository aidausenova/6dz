package com.example.homework6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Holder> {
    private List<MainModel> list;
    private TExtFragment tExtFragment;
    private View v;

    public ListAdapter(List<MainModel> list, TExtFragment tExtFragment) {
        this.list = list;
        this.tExtFragment = tExtFragment;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onB(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView textView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtView);
        }

        public void onB(MainModel mainModel) {
            textView.setText(mainModel.getTxt());
        }
    }
}
