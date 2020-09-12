package com.example.vk_layouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SnippetAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snippet);

        View snippet = findViewById(R.id.snippet);
        snippet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnippetAcitivity.this, ReviewAcitivity.class);
                startActivity(intent);
            }
        });
    }
}
