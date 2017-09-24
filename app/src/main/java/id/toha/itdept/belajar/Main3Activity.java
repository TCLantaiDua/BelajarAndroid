package id.toha.itdept.belajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<String> words = new ArrayList<String>();

        words.add("satu");
        words.add("dua");
        words.add("tiga");
        words.add("empat");
        words.add("lima");
        words.add("enam");
        words.add("tujuh");
        words.add("delapan");


        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index = 0;
        while (index<words.size()){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index++;
        }



    }
}
