package com.example.deepseekassistant;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView title = findViewById(R.id.title);
        Button btn = findViewById(R.id.btn);
        
        btn.setOnClickListener(v -> {
            title.setText("Голосовой ассистент активирован! 🎤");
            btn.setText("Готово!");
        });
    }
}
