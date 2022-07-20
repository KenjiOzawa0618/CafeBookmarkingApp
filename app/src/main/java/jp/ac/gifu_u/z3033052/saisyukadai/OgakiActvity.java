package jp.ac.gifu_u.z3033052.saisyukadai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class OgakiActvity extends AppCompatActivity {

    String[] cafe_list= { "cafe_list0","cafe_list1","cafe_list2","cafe_list3","cafe_list4","cafe_list5","cafe_list6","cafe_list7","cafe_list8","cafe_list9" };
    //String cafe_list0,cafe_list1,cafe_list2,cafe_list3,cafe_list4,cafe_list5,cafe_list6,cafe_list7,cafe_list8,cafe_list9;
    String list2 = "";
    String list3 = "";
    String list4 = "";
    String[] cafe_memo = {"cafe_memo0","cafe_memo1","cafe_memo2","cafe_memo3","cafe_memo4","cafe_memo5","cafe_memo6","cafe_memo7","cafe_memo8","cafe_memo9"};
    //String cafe_memo0,cafe_memo1,cafe_memo2,cafe_memo3,cafe_memo4,cafe_memo5,cafe_memo6,cafe_memo7,cafe_memo8,cafe_memo9;
    String memo2 = "";
    String memo3 = "";
    String memo4 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtvity_ogaki);

        int[] cafe_id = {R.id.cafename0,R.id.cafename1,R.id.cafename2,R.id.cafename3,R.id.cafename4,R.id.cafename5,R.id.cafename6,R.id.cafename7,R.id.cafename8,R.id.cafename9};
        //EditText[] cafe_editText = {"cafe_editText1","editText2","editText3","editText4","editText5","editText6","editText7","editText8","editText9"};
        ArrayList<EditText> cafe_edit_list = new ArrayList<EditText>();
        for(int i=0;i<10;i++) {
            cafe_edit_list.add(findViewById(cafe_id[i]));
        }
        final EditText editText2 = findViewById(R.id.price);
        final EditText editText3 = findViewById(R.id.recommend);
        final EditText editText4 = findViewById(R.id.check);

        // データの読込
        SharedPreferences preferences = getSharedPreferences("ogaki_data",MODE_PRIVATE);
        for(int i=0;i<10;i++) {
            cafe_list[i] = preferences.getString("cafe_list[i]", "");
        }
        list2 = preferences.getString("list2","");
        list3= preferences.getString("list3","");
        list4= preferences.getString("list4","");
        for(int i=0;i<10;i++) {
            ((TextView) findViewById(R.id.cafename)).setText(cafe_list[i]);
        }
        ((TextView)findViewById(R.id.price)).setText(list2);
        ((TextView)findViewById(R.id.recommend)).setText(list3);
        ((TextView)findViewById(R.id.check)).setText(list4);


        Button returnButton = findViewById(R.id.returnButton);//https://akira-watson.com/android/activity-1.html　16~17
        returnButton.setOnClickListener(v ->{
            for(int i=0;i<10;i++) {
                cafe_memo[i] = cafe_edit_list.get(i).getText().toString();
            }
            memo2 = editText2.getText().toString();
            memo3 = editText3.getText().toString();
            memo4 = editText4.getText().toString();
            // データの保存
            SharedPreferences.Editor editor = preferences.edit();
            for(int i=0;i<10;i++) {
                editor.putString("cafe_list0", cafe_memo[i]);
            }
            editor.putString("list2",memo2);
            editor.putString("list3",memo3);
            editor.putString("list4",memo4);
            editor.commit();
            finish();
        });

    }
}