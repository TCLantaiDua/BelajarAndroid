package id.toha.itdept.belajar;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static id.toha.itdept.belajar.R.*;

public class MainActivity extends AppCompatActivity
{
    //Declare Object
    Button Btn1;
    TextView LblHasil;
    EditText TxtInput;

    public static final String EXTRA_MESSAGE = "MessageDariAktivityPertama";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //Set Object
        Btn1     = (Button) findViewById(id.Btn1);
        TxtInput = (EditText) findViewById(id.TxtInput);
        LblHasil = (TextView) findViewById(id.LblHasil);

        /*
        //Add Action To Btn1
        //TODO: Melakukan aksi ketika Btn1 di Klik
        Btn1.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View view)
           {
               LblHasil.setText(TxtInput.getText().toString());
           }
        });*/
    }

    public void postData(View view)
    {
        //LblHasil.setText(TxtInput.getText().toString());

        Intent activity_kedua = new Intent(this, Main2Activity.class);
        String message = TxtInput.getText().toString();

        activity_kedua.putExtra(EXTRA_MESSAGE, message);
        startActivity(activity_kedua);
    }

    public void openListViewActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
    }

    public void openArrayListActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
}
