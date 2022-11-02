package com.example.a11222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list2);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Бразилия", "Бразилиа", R.drawable.brazilia, "218 007 040 чел."));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.argentina, "44 938 712 чел."));
        states.add(new State ("Колумбия", "Богота", R.drawable.kolumbiya, "49 258 494 чел."));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.urugvaj, "3 415 866 чел."));
        states.add(new State ("Чили", "Сантьяго", R.drawable.chili, "20 639 315 чел."));

        states.add(new State ("Албания", "Тирана", R.drawable.albaniya, "2 845 955 чел."));
        states.add(new State ("Дания", "Копенгаген", R.drawable.danija, "5 762 082 чел."));
        states.add(new State ("Греция", "Афины", R.drawable.gretsija, "10 741 165 чел."));
        states.add(new State ("Великобритания", "Лондон", R.drawable.velikobritanija, "67 647 112 чел."));
        states.add(new State ("Грузия", "Тбилиси", R.drawable.gruzija, "3 723 500 чел."));
    }

    public void click(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        //finish();
    }
}