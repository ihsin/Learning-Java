package com.example.mddanish.myapplication;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class About_us extends Activity {

    Button b1, b2, b3, b4, b5;
    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        t1 = (TextView) findViewById(R.id.textView13);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String num = t1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+num));
                startActivity(intent);
            }
        });

        t2 = (TextView)findViewById(R.id.textView14);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String num = t2.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+num));
                startActivity(intent);
            }
        });

        t3 = (TextView)findViewById(R.id.textView15);
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = t3.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+num));
                startActivity(intent);
            }
        });

        t4 = (TextView)findViewById(R.id.textView16);
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = t4.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+num));
                startActivity(intent);
            }
        });

        t5 = (TextView)findViewById(R.id.textView17);
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = t5.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+num));
                startActivity(intent);
            }
        });
    }
}
