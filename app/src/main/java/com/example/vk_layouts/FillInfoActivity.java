package com.example.vk_layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FillInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic);
        TextView heading = findViewById(R.id.heading);
        TextView sumTitle = findViewById(R.id.sum_title);
        TextView authorTitle = findViewById(R.id.author_title);
        Spinner authorSpinner = findViewById(R.id.author_spinner);

        if (getIntent().getStringExtra("type").equals("regular")) {
            heading.setText("Регулярный сбор");
            sumTitle.setText("Сумма в месяц");
            authorTitle.setVisibility(View.VISIBLE);
            authorSpinner.setVisibility(View.VISIBLE);
        }
    }
}
