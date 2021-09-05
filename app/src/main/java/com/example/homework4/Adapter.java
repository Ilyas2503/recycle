package com.example.homework4;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<Model> list;
    private Callback callback;


    public Adapter(List<Model> list, Callback callback) {
        this.list = list;
        this.callback = callback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view, callback);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.noBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView num1, textblank, texttaylor, secondnum2;
        private Callback callback;

        public ViewHolder(View itemView, Callback callback) {
            super(itemView);
            this.callback = callback;
            num1 = itemView.findViewById(R.id.num_tv);
            secondnum2 = itemView.findViewById(R.id.num2_tv);
            textblank = itemView.findViewById(R.id.Blank_tv);
            texttaylor = itemView.findViewById(R.id.name_tv);
        }

        public void noBind(Model model) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    callback.itemClick(model);
                }
            });
        }
    }

    public interface Callback {
        void itemClick(Model model);
    }
}