package com.example.homework4;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ImageFragment extends Fragment implements Adapter.Callback {

    private RecyclerView recyclerView;
    private Adapter adapter;
    List<Model> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_image, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.REC_rc);

        list = new ArrayList<>();
        list.add(new Model("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Model("2", "Watch Me", "Silento", "5:36"));
        list.add(new Model("3", "Earned It", "The Weekend", "4:51"));
        list.add(new Model("4", "The Hills", "The Weekend", "3:41"));
        list.add(new Model("5", "Writing's On The Wall", "The Wall", "5:33"));

        adapter = new Adapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void itemClick(Model model) {
        Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show();
        getFragmentManager().beginTransaction().replace(R.id.container_fr, new Fragment3()).commit();
    }
}