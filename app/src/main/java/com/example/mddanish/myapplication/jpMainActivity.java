package com.example.mddanish.myapplication;

/**
 * Created by MD DANISH on 31-12-2016.
 */
import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class jpMainActivity extends Activity{
    ListView lv;
    ArrayAdapter adapter;
    String Program[] = {
            "Hello World", "Addition", "If Else example", "For Loop Example", "While Loop Example", "Do While Example", "Switch Case Example", "Nested Switch Example", "Continue Example", "Even or Odd Number",
            "Prime Number", "Factorial", "Compare Two Number", "Swapping Two no", "Swapping Without 3rd Variable", "Leap Year", /*"Area Of Circle", "Palindrome Number", "Fibonacci Series", "Armstrong Number",
            "Harmonic Series", "Pyramid Of Stars", "Reversed Pyramid Of Stars", "Matrix Addition", "Matrix Multiplication", "Matrix Transpose", "Sparse Matrix", "Linear Search", "Binary Search", "Bubble Search",
            "Bubble Sort", "Selection Sort", "Insertion Sort", "Quick Sort", "Merge Sort", "LinkedList example", "Adding an element to LinkedList", "Add element at specific index in LinkedList", "Add element at the beginning and end of LinkedList", "Adding an element to the front of LinkedList",
            "Remove First and last elements from LinkedList", "Remove specified element from LinkedList", "Remove All elements from LinkedList", "Search element in LinkedList", "Number is Binary or Not", "Convert Decimal no. to Binary no.", "Convert Binary no. to Decimal no.", "Generate Random Numbers"*/
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jp_main);
        lv = new ListView(this);
        lv = (ListView) findViewById(R.id.listView1);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Program);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterview, View view , int i , long id)
            {
                switch (i)
                {
                    default:
                        return;

                    case 0: // '\0'
                       Intent I = new Intent(getApplicationContext(),HelloWorld.class);
                        startActivity(I);
                        return;
                    case 1: // '\0'
                        I = new Intent(getApplicationContext(),Addition.class);
                        startActivity(I);
                        return;
                    case 2: // '\0'
                        I = new Intent(getApplicationContext(),IfElse.class);
                        startActivity(I);
                        return;
                    case 3: // '\0'
                        I = new Intent(getApplicationContext(),ForLoop.class);
                        startActivity(I);
                        return;
                    case 4: // '\0'
                        I = new Intent(getApplicationContext(),WhileLoop.class);
                        startActivity(I);
                        return;
                    case 5: // '\0'
                        I = new Intent(getApplicationContext(),DoWhile.class);
                        startActivity(I);
                        return;
                    case 6: // '\0'
                        I = new Intent(getApplicationContext(),SwitchCase.class);
                        startActivity(I);
                        return;
                    case 7: // '\0'
                        I = new Intent(getApplicationContext(),NestedSwitch.class);
                        startActivity(I);
                        return;
                    case 8: // '\0'
                        I = new Intent(getApplicationContext(),Continue.class);
                        startActivity(I);
                        return;
                    case 9: // '\0'
                        I = new Intent(getApplicationContext(),EvenOdd.class);
                        startActivity(I);
                        return;
                    case 10: // '\0'
                        I = new Intent(getApplicationContext(),PrimeNo.class);
                        startActivity(I);
                        return;
                    case 11: // '\0'
                        Toast.makeText(getApplicationContext(),"Program Currently Not Availble\n\t\tWill Be Uploaded Soon...",Toast.LENGTH_SHORT).show();
                        return;
                    case 12: // '\0'
                        Toast.makeText(getApplicationContext(),"Program Currently Not Availble\n\t\tWill Be Uploaded Soon...",Toast.LENGTH_SHORT).show();
                        return;
                    case 13: // '\0'
                        Toast.makeText(getApplicationContext(),"Program Currently Not Availble\n\t\tWill Be Uploaded Soon...",Toast.LENGTH_SHORT).show();
                        return;
                    case 14: // '\0'
                        Toast.makeText(getApplicationContext(),"Program Currently Not Availble\n\t\tWill Be Uploaded Soon...",Toast.LENGTH_SHORT).show();
                        return;
                    case 15: // '\0'
                        Toast.makeText(getApplicationContext(),"Program Currently Not Availble\n\t\tWill Be Uploaded Soon......",Toast.LENGTH_SHORT).show();
                        return;
                   

                }

            }


        });



                }
}
