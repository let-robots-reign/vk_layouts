package com.example.vk_layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DonationTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        CardView targetCard = findViewById(R.id.target_card);
        CardView regularCard = findViewById(R.id.regular_card);

        targetCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DonationTypeActivity.this, FillInfoActivity.class);
                intent.putExtra("type", "target");
                startActivity(intent);
            }
        });

        regularCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DonationTypeActivity.this, FillInfoActivity.class);
                intent.putExtra("type", "regular");
                startActivity(intent);
            }
        });
    }
}