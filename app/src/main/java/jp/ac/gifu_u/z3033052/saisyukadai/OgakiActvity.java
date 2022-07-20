package jp.ac.gifu_u.z3033052.saisyukadai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OgakiActvity extends AppCompatActivity {
    String[] cafe_list = { "cafe_list0","cafe_list1","cafe_list2","cafe_list3","cafe_list4","cafe_list5","cafe_list6","cafe_list7","cafe_list8","cafe_list9" };
    String[] cafe_save = { "cafe_save0","cafe_save1","cafe_save2","cafe_save3","cafe_save4","cafe_save5","cafe_save6","cafe_save7","cafe_save8","cafe_save9" };
    String[] price_list = {"cafe_list0","cafe_list1","cafe_list2","cafe_list3","cafe_list4","cafe_list5","cafe_list6","cafe_list7","cafe_list8","cafe_list9"};
    String[] price_save ={"price_save0","price_save1","price_save2","price_save3","price_save4","price_save5","price_save6","price_save7","price_save8","price_save9"};
    String[] recommend_list = {"recommend_list0","recommend_list1","recommend_list2","recommend_list3","recommend_list4","recommend_list5","recommend_list6","recommend_list7","recommend_list8","recommend_list9"};
    String[] recommend_save = {"recommend_save0","recommend_save1","recommend_save2","recommend_save3","recommend_save4","recommend_save5","recommend_save6","recommend_save7","recommend_save8","recommend_save9"};
    String[] check_list = {"check_list0","check_list1","check_list2","check_list3","check_list4","check_list5","check_list6","check_list7","check_list8","check_list9"};
    String[] check_save = {"check_save0","check_save1","check_save2","check_save3","check_save4","check_save5","check_save6","check_save7","check_save8","check_save9"};
    String[] cafe_memo = {"cafe_memo0","cafe_memo1","cafe_memo2","cafe_memo3","cafe_memo4","cafe_memo5","cafe_memo6","cafe_memo7","cafe_memo8","cafe_memo9"};
    String[] price_memo = {"price_memo0","price_memo1","price_memo2","price_memo3","price_memo4","price_memo5","price_memo6","price_memo7","price_memo8","price_memo9"};
    String[] recommend_memo = {"recommend_memo0","recommend_memo1","recommend_memo2","recommend_memo3","recommend_memo4","recommend_memo5","recommend_memo6","recommend_memo7","recommend_memo8","recommend_memo9"};
    String[] check_memo = {"check_memo0","check_memo1","check_memo2","check_memo3","check_memo4","check_memo5","check_memo6","check_memo7","check_memo8","check_memo9"};
    int[] cafe_id = {R.id.cafename0,R.id.cafename1,R.id.cafename2,R.id.cafename3,R.id.cafename4,R.id.cafename5,R.id.cafename6,R.id.cafename7,R.id.cafename8,R.id.cafename9};
    int[] price_id = {R.id.price0,R.id.price1,R.id.price2,R.id.price3,R.id.price4,R.id.price5,R.id.price6,R.id.price7,R.id.price8,R.id.price9};
    int[] recommend_id = {R.id.recommend0,R.id.recommend1,R.id.recommend2,R.id.recommend3,R.id.recommend4,R.id.recommend5,R.id.recommend6,R.id.recommend7,R.id.recommend8,R.id.recommend9};
    int[] check_id = {R.id.check0,R.id.check1,R.id.check2,R.id.check3,R.id.check4,R.id.check5,R.id.check6,R.id.check7,R.id.check8,R.id.check9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtvity_ogaki);

        final EditText cafe_editText0 = findViewById(cafe_id[0]);
        final EditText cafe_editText1 = findViewById(cafe_id[1]);
        final EditText cafe_editText2 = findViewById(cafe_id[2]);
        final EditText cafe_editText3 = findViewById(cafe_id[3]);
        final EditText cafe_editText4 = findViewById(cafe_id[4]);
        final EditText cafe_editText5 = findViewById(cafe_id[5]);
        final EditText cafe_editText6 = findViewById(cafe_id[6]);
        final EditText cafe_editText7 = findViewById(cafe_id[7]);
        final EditText cafe_editText8 = findViewById(cafe_id[8]);
        final EditText cafe_editText9 = findViewById(cafe_id[9]);

        final EditText price_editText0 = findViewById(price_id[0]);
        final EditText price_editText1 = findViewById(price_id[1]);
        final EditText price_editText2 = findViewById(price_id[2]);
        final EditText price_editText3 = findViewById(price_id[3]);
        final EditText price_editText4 = findViewById(price_id[4]);
        final EditText price_editText5 = findViewById(price_id[5]);
        final EditText price_editText6 = findViewById(price_id[6]);
        final EditText price_editText7 = findViewById(price_id[7]);
        final EditText price_editText8 = findViewById(price_id[8]);
        final EditText price_editText9 = findViewById(price_id[9]);

        final EditText recommend_editText0 = findViewById(recommend_id[0]);
        final EditText recommend_editText1 = findViewById(recommend_id[1]);
        final EditText recommend_editText2 = findViewById(recommend_id[2]);
        final EditText recommend_editText3 = findViewById(recommend_id[3]);
        final EditText recommend_editText4 = findViewById(recommend_id[4]);
        final EditText recommend_editText5 = findViewById(recommend_id[5]);
        final EditText recommend_editText6 = findViewById(recommend_id[6]);
        final EditText recommend_editText7 = findViewById(recommend_id[7]);
        final EditText recommend_editText8 = findViewById(recommend_id[8]);
        final EditText recommend_editText9 = findViewById(recommend_id[9]);

        final EditText check_editText0 = findViewById(check_id[0]);
        final EditText check_editText1 = findViewById(check_id[1]);
        final EditText check_editText2 = findViewById(check_id[2]);
        final EditText check_editText3 = findViewById(check_id[3]);
        final EditText check_editText4 = findViewById(check_id[4]);
        final EditText check_editText5 = findViewById(check_id[5]);
        final EditText check_editText6 = findViewById(check_id[6]);
        final EditText check_editText7 = findViewById(check_id[7]);
        final EditText check_editText8 = findViewById(check_id[8]);
        final EditText check_editText9 = findViewById(check_id[9]);

        // データの読込
        SharedPreferences preferences = getSharedPreferences("ogaki_data",MODE_PRIVATE);
        for(int i=0;i<10;i++) {
            cafe_list[i] = preferences.getString(cafe_save[i], "");
        }
        for(int i=0;i<10;i++) {
            price_list[i] = preferences.getString(price_save[i], "");
        }
        for(int i=0;i<10;i++) {
            recommend_list[i] = preferences.getString(recommend_save[i], "");
        }
        for(int i=0;i<10;i++) {
            check_list[i] = preferences.getString(check_save[i], "");
        }

        for(int i=0;i<10;i++) {
            ((TextView) findViewById(cafe_id[i])).setText(cafe_list[i]);
        }
        for(int i=0;i<10;i++) {
            ((TextView) findViewById(price_id[i])).setText(price_list[i]);
        }
        for(int i=0;i<10;i++) {
            ((TextView) findViewById(recommend_id[i])).setText(recommend_list[i]);
        }
        for(int i=0;i<10;i++) {
            ((TextView) findViewById(check_id[i])).setText(check_list[i]);
        }

        Button returnButton = findViewById(R.id.returnButton);//https://akira-watson.com/android/activity-1.html　16~17
        returnButton.setOnClickListener(v ->{
            cafe_memo[0] = cafe_editText0.getText().toString();
            cafe_memo[1] = cafe_editText1.getText().toString();
            cafe_memo[2] = cafe_editText2.getText().toString();
            cafe_memo[3] = cafe_editText3.getText().toString();
            cafe_memo[4] = cafe_editText4.getText().toString();
            cafe_memo[5] = cafe_editText5.getText().toString();
            cafe_memo[6] = cafe_editText6.getText().toString();
            cafe_memo[7] = cafe_editText7.getText().toString();
            cafe_memo[8] = cafe_editText8.getText().toString();
            cafe_memo[9] = cafe_editText9.getText().toString();

            price_memo[0] = price_editText0.getText().toString();
            price_memo[1] = price_editText1.getText().toString();
            price_memo[2] = price_editText2.getText().toString();
            price_memo[3] = price_editText3.getText().toString();
            price_memo[4] = price_editText4.getText().toString();
            price_memo[5] = price_editText5.getText().toString();
            price_memo[6] = price_editText6.getText().toString();
            price_memo[7] = price_editText7.getText().toString();
            price_memo[8] = price_editText8.getText().toString();
            price_memo[9] = price_editText9.getText().toString();

            recommend_memo[0] = recommend_editText0.getText().toString();
            recommend_memo[1] = recommend_editText1.getText().toString();
            recommend_memo[2] = recommend_editText2.getText().toString();
            recommend_memo[3] = recommend_editText3.getText().toString();
            recommend_memo[4] = recommend_editText4.getText().toString();
            recommend_memo[5] = recommend_editText5.getText().toString();
            recommend_memo[6] = recommend_editText6.getText().toString();
            recommend_memo[7] = recommend_editText7.getText().toString();
            recommend_memo[8] = recommend_editText8.getText().toString();
            recommend_memo[9] = recommend_editText9.getText().toString();

            check_memo[0] = check_editText0.getText().toString();
            check_memo[1] = check_editText1.getText().toString();
            check_memo[2] = check_editText2.getText().toString();
            check_memo[3] = check_editText3.getText().toString();
            check_memo[4] = check_editText4.getText().toString();
            check_memo[5] = check_editText5.getText().toString();
            check_memo[6] = check_editText6.getText().toString();
            check_memo[7] = check_editText7.getText().toString();
            check_memo[8] = check_editText8.getText().toString();
            check_memo[9] = check_editText9.getText().toString();

            // データの保存
            SharedPreferences.Editor editor = preferences.edit();
            for(int i=0;i<10;i++) {
                editor.putString( cafe_save[i], cafe_memo[i]);
            }
            for(int i=0;i<10;i++) {
                editor.putString( price_save[i], price_memo[i]);
            }
            for(int i=0;i<10;i++) {
                editor.putString( recommend_save[i], recommend_memo[i]);
            }
            for(int i=0;i<10;i++) {
                editor.putString( check_save[i],check_memo[i]);
            }
            editor.commit();
            finish();
        });
    }
}