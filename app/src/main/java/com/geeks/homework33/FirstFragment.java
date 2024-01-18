package com.geeks.homework33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    private RecyclerView rvFlower;
    private ArrayList<String> flowerList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFlower = requireActivity().findViewById(R.id.flowers);
        loadData();
        FlowersAdapter adapter = new FlowersAdapter(flowerList);
        rvFlower.setAdapter(adapter);
    }
    private void loadData(){
        flowerList.add("Роза");
        flowerList.add("Пионы");
        flowerList.add("Гипсофила");
        flowerList.add("Тюльпан");
        flowerList.add("Ромашка");
        flowerList.add("Лилии");
        flowerList.add("Орхидеи");
        flowerList.add("Гвоздика");
        flowerList.add("Сирень");
        flowerList.add("Герберы");
        flowerList.add("Гортензии");
        flowerList.add("Фиалка");
        flowerList.add("Ранункулюс");
    }
}