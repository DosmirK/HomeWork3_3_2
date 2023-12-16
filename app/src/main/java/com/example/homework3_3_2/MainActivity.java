package com.example.homework3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFilms;
    private ArrayList<String> filmsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        loadData();
        FilmsAdapter adapter = new FilmsAdapter(filmsList);
        rvFilms.setAdapter(adapter);
    }

    private void loadData() {
        filmsList.add("Властелин колец");
        filmsList.add("Тёмный рыцарь");
        filmsList.add("Бойцовский клуб");
        filmsList.add("Звёздные войны");
        filmsList.add("Мстители: Финал");
        filmsList.add("1+1");
        filmsList.add("Король лев");
        filmsList.add("Валл-и");
        filmsList.add("Люди в чёрном");
        filmsList.add("Чужие");
        filmsList.add("Тайна Коко");
        filmsList.add("Волк с Уволл-стрит");
        filmsList.add("История игрушек");
        filmsList.add("Фарсаж");
        filmsList.add("Кунг-фу панда");
        filmsList.add("Дэдпул");
        filmsList.add("Воин");
        filmsList.add("Гарри Поттер");
        filmsList.add("Рокки");
        filmsList.add("Три богатыря");
        filmsList.add("Крид");
    }

    private void initView() {
        rvFilms = findViewById(R.id.rv_films);
    }
}