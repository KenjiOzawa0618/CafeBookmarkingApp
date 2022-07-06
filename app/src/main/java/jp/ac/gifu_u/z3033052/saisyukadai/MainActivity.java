package jp.ac.gifu_u.z3033052.saisyukadai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hidaButton = findViewById(R.id.hida_next); //https://akira-watson.com/android/activity-1.html 15~19行
        hidaButton.setOnClickListener(v -> {
                Intent intent = new Intent(getApplication(), HidaActivity.class);
                startActivity(intent);
        });

        Button gifuButton = findViewById(R.id.gifu_next); //https://akira-watson.com/android/activity-1.html 15~19行
        gifuButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), SubActivity1.class);
            startActivity(intent);
        });

        Button geroButton = findViewById(R.id.gero_next); //https://akira-watson.com/android/activity-1.html 15~19行
        geroButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), GeroActivity.class);
            startActivity(intent);
        });
    }
}
