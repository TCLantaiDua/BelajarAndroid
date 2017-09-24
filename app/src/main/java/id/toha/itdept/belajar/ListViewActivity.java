package id.toha.itdept.belajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity
{

    //Deklarasi object Listview dan String Array
    private ListView ListViewData;
    private String[] Data = new String[]{"Pisang","Anggur","Pepaya","Mangga","Mangga 1","Mangga 2","Mangga 3","Mangga 4","Mangga 5","Mangga 6","Mangga 1","Mangga 2","Mangga 3","Mangga 4","Mangga 5","Mangga 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListViewData = (ListView) findViewById(R.id.ListViewData);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ListViewActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                Data
                );

        ListViewData.setAdapter(adapter);

        ListViewData.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(), Data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
