package jp.ac.gifu_u.z3033052.saisyukadai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class GeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gero);

        Button returnButton = findViewById(R.id.returnButton);//https://akira-watson.com/android/activity-1.html　16~17
        returnButton.setOnClickListener(v -> finish());
    }
}