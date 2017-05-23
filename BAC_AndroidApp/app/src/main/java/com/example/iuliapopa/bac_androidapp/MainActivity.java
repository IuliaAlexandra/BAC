package com.example.iuliapopa.bac_androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    String[] planets = new String[] { "Apostol V. Mihai", "Baicu A. Ionut", "Cristescu C. Simina", "Diaconu R. Stefan",
            "Moise A. Flavia", "Nedelea G. Mihai", "Popescu B. Alexandra", "Tocitu S. Bianca", "Munteanu P. Denis", "Nedelea D. Anca",
            "Neagu F. Iulian", "Dobrin O. Cristiana"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.simplerow, planets);

        ListView listView = (ListView) findViewById(R.id.mainListView);
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
         int id = item.getItemId();

        if (id == R.id.action_getElevi){
            setContentView (R.layout.activity_main);
        }
        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }



}
