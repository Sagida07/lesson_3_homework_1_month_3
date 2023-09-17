package com.example.lesson_3_homework_month_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClassAdapter extends RecyclerView.Adapter<ClassViewHolder> {

    private ArrayList<String> classList;

    public ClassAdapter(ArrayList<String> classList) {
        this.classList = classList;
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClassViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_class, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
        holder.bind(classList.get(position));
    }

    @Override
    public int getItemCount() {
        return classList.size();
    }
}
