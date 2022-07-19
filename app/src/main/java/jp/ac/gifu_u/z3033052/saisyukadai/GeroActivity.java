package jp.ac.gifu_u.z3033052.saisyukadai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class GeroActivity extends AppCompatActivity {

    String list1 = "";
    String list2 = "";
    String list3 = "";
    String list4 = "";
    String memo1 = "";
    String memo2 = "";
    String memo3 = "";
    String memo4 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gero);

        final EditText editText1 = findViewById(R.id.cafename);
        final EditText editText2 = findViewById(R.id.price);
        final EditText editText3 = findViewById(R.id.recommend);
        final EditText editText4 = findViewById(R.id.check);

        // データの読込
          SharedPreferences preferences = getSharedPreferences("cafe_data",MODE_PRIVATE);
          list1 = preferences.getString("list1","");
          list2 = preferences.getString("list2","");
          list3= preferences.getString("list3","");
          list4= preferences.getString("list4","");
          ((TextView)findViewById(R.id.cafename)).setText(list1);
          ((TextView)findViewById(R.id.price)).setText(list2);
          ((TextView)findViewById(R.id.recommend)).setText(list3);
          ((TextView)findViewById(R.id.check)).setText(list4);

        Button returnButton = findViewById(R.id.returnButton);//https://akira-watson.com/android/activity-1.html　16~17
        returnButton.setOnClickListener(v ->{
            memo1 = editText1.getText().toString();
            memo2 = editText2.getText().toString();
            memo3 = editText3.getText().toString();
            memo4 = editText4.getText().toString();
            // データの保存
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("list1",memo1);
            editor.putString("list2",memo2);
            editor.putString("list3",memo3);
            editor.putString("list4",memo4);
            editor.commit();
            finish();
        });

    }
}