


package com.example.lesson_3_homework_month_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentA extends Fragment {

    private RecyclerView rvClass;
    private ArrayList<String> classList = new ArrayList<>();

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvClass = requireActivity().findViewById(R.id.rv_class);
        loadData();
        ClassAdapter adapter = new ClassAdapter(classList);
        rvClass.setAdapter(adapter);
    }

    private void loadData(){
        classList.add("Эрланова Сагида");
        classList.add("Ногойбаева Сезим");
        classList.add("Эрматова Адия");
        classList.add("Ырыскелдиева Каныкей");
        classList.add("Джолдошбаева Азиза");
        classList.add("Жуманазарова Анжелика");
        classList.add("Арстанбеков Тариэл");
        classList.add("Фиц Александра");
        classList.add("Алиев Бакберген");
        classList.add("Жусупов Мирланбек");
        classList.add("Иманалиев Эмир");
        classList.add("Ли Дарья");
        classList.add("Туруспеков Алмаз");
        classList.add("Сафиулин Анвар");
        classList.add("Сео Самуэль");
    }
}