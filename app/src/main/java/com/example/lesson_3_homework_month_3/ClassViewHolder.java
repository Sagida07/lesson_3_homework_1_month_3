package com.example.lesson_3_homework_month_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClassViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNames;

    public ClassViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNames = itemView.findViewById(R.id.tv_names);
    }

    public void bind(String classNames) {
        tvNames.setText(classNames);
    }
}
