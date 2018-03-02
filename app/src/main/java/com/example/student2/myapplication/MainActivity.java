package com.example.student2.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.listView);
        CountryAdapter adapter = new CountryAdapter(this, getResources().getStringArray(R.array.countries_array));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


           // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                 //  getResources().getStringArray(R.array.countries_array));
           //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             String country = (String)adapterView.getItemAtPosition(i);
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/" + country.replace(" ", "_")));
               startActivity(myIntent);
               }});



        listView.setAdapter(adapter);
    }
}
