package jp.ac.gifu_u.z3033052.saisyukadai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //https://akira-watson.com/android/activity-1.html 15~54行
        Button hidaButton = findViewById(R.id.hida_next);//buttunの宣言
        hidaButton.setOnClickListener(v -> {
                Intent intent = new Intent(getApplication(), HidaActivity.class);//アクティビティを起動する
                startActivity(intent);//アクティビティを開始する
        });
        Button gifuButton = findViewById(R.id.gifu_next);//buttunの宣言
        gifuButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), SubActivity1.class);//アクティビティを起動する
            startActivity(intent);//アクティビティを開始する
        });
        Button geroButton = findViewById(R.id.gero_next);//buttunの宣言
        geroButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), GeroActivity.class);//アクティビティを起動する
            startActivity(intent);//アクティビティを開始する
        });
        Button ogakiButton = findViewById(R.id.ogaki_next);//buttunの宣言
        ogakiButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),OgakiActvity.class);//アクティビティを起動する
            startActivity(intent);//アクティビティを開始する
        });
        Button minokamoButton = findViewById(R.id.minokamo_next);//buttunの宣言
        minokamoButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), MinokamoActivity.class);//アクティビティを起動する
            startActivity(intent);//アクティビティを開始する
        });
        Button guzyoButton = findViewById(R.id.guzyo_next);//buttunの宣言
        guzyoButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), guzyoActivity.class);//アクティビティを起動する
            startActivity(intent);//アクティビティを開始する
        });
        Button nakatugawaButton = findViewById(R.id.nakatugawa_next);//buttunの宣言
        nakatugawaButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), Nakatugawa_activity.class);//アクティビティを起動する
            startActivity(intent);//アクティビティを開始する
        });
        Button takayamaButton = findViewById(R.id.takayama_next);//buttunの宣言
        takayamaButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), TakayamaActivity.class);//アクティビティを起動する
            startActivity(intent);//アクティビティを開始する
        });
    }
}
