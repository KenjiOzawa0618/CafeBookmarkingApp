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

        Button nextButton = findViewById(R.id.bt_next); //https://akira-watson.com/android/activity-1.html 15~19行
        nextButton.setOnClickListener(v -> {
                Intent intent = new Intent(getApplication(), SubActivity.class);
                startActivity(intent);
        });
    }
}
