package com.example.mddanish.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by MD DANISH on 02-01-2017.
 */
public class bojMainActivity extends Activity {
    String Program[] = {
            "Abstract Class Method", "Final keyword", "Encapsulation", "Inheritance", "PolyMorphism", "Overloading & Overriding", "Super Keyword", "Constructor", "Inner Class"
    };
    ListView lv;
    ArrayAdapter adapter;
    Intent I = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boj_main);
        lv = new ListView(this);
        lv = (ListView) findViewById(R.id.listView1);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Program);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterview, View view , int i , long id) {
                switch (i) {
                    default:
                        return;

                    case 0: // '\0'
                        I = new Intent(getApplicationContext(), Abst.class);
                        startActivity(I);
                        return;
                    case 1: // '\0'
                        I = new Intent(getApplicationContext(), Final.class);
                        startActivity(I);
                        return;
                    case 2: // '\0'
                        I = new Intent(getApplicationContext(), Encapsulation.class);
                        startActivity(I);
                        return;
                    case 3: // '\0'
                        I = new Intent(getApplicationContext(), Inheritance.class);
                        startActivity(I);
                        return;
                    case 4: // '\0'
                        I = new Intent(getApplicationContext(), Poly.class);
                        startActivity(I);
                        return;
                    case 5: // '\0'
                        I = new Intent(getApplicationContext(), Over.class);
                        startActivity(I);
                        return;
                    case 6: // '\0'
                        I = new Intent(getApplicationContext(), Super.class);
                        startActivity(I);
                        return;
                    case 7: // '\0'
                         I = new Intent(getApplicationContext(), Constructor.class);
                        startActivity(I);
                        return;
                    case 8: // '\0'
                         I = new Intent(getApplicationContext(), Innr.class);
                        startActivity(I);
                        return;


                }

            }

        });



    }
}


