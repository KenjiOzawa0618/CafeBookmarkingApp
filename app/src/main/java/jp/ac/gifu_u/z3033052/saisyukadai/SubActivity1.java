package jp.ac.gifu_u.z3033052.saisyukadai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ArrayAdapter;

public class SubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifu);

        Button returnButton = findViewById(R.id.returnButton);//https://akira-watson.com/android/activity-1.html　16~17
        returnButton.setOnClickListener(v -> finish());

        final EditText editText1 = (EditText)findViewById(R.id.cafename);
        final EditText editText2 = (EditText)findViewById(R.id.price);
        final EditText editText3 = (EditText)findViewById(R.id.recommend);
        final EditText editText4 = (EditText)findViewById(R.id.check);
        Button saveButton = (Button)findViewById(R.id.save_button);
        ListView listView1 = (ListView)findViewById(R.id.memo_list1);
        ListView listView2 = (ListView)findViewById(R.id.memo_list2);
        ListView listView3 = (ListView)findViewById(R.id.memo_list3);
        ListView listView4 = (ListView)findViewById(R.id.memo_list4);


        // ListViewに対してアイテムを動的に追加していく場合はadapterを利用します
        // simple_list_item_1 はデフォルトで提供されているTextViewのみ持つレイアウトです。
        // 自作したLayoutを指定して複雑なリストも作成可能です。
        ArrayAdapter<Object> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        ListAdapter adapter1;
        listView1.setAdapter(adapter);
        //listView2.setAdapter(adapter);
        //listView3.setAdapter(adapter);
       // listView4.setAdapter(adapter);

        // 保存ボタンをタップ時の処理
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // エディタの内容を取得します
                String memo1 = editText1.getText().toString();
                String memo2 = editText2.getText().toString();
                String memo3 = editText3.getText().toString();
                String memo4 = editText4.getText().toString();

                // メモ内容が入力されていない場合は保存しないようにします
                if (memo1.isEmpty()) {
                    // Toastを使ってメッセージを表示します
                    Toast.makeText(getApplicationContext(), "メモ内容が入力されていません", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (memo2.isEmpty()) {
                    // Toastを使ってメッセージを表示します
                    Toast.makeText(getApplicationContext(), "メモ内容が入力されていません", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (memo3.isEmpty()) {
                    // Toastを使ってメッセージを表示します
                    Toast.makeText(getApplicationContext(), "メモ内容が入力されていません", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (memo4.isEmpty()) {
                    // Toastを使ってメッセージを表示します
                    Toast.makeText(getApplicationContext(), "メモ内容が入力されていません", Toast.LENGTH_SHORT).show();
                    return;
                }

                // リストにメモ内容を反映します
                MenuBuilder adapter1;
                adapter.add(memo1);
                adapter.add(memo2);
                adapter.add(memo3);
                adapter.add(memo4);

                // エディタはクリアします
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
            }
        });
    }
}