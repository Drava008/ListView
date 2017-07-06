package com.example.user.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> ar = new ArrayList<String>();


        for(int i=1;i<=500;i++){
        ar.add("選項" + i);

        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ar);

        list = (ListView)findViewById(R.id.list);

        list.setAdapter(adapter);

        list.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {

                String s = list.getItemAtPosition(position).toString();

                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


