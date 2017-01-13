package com.example.mddanish.myapplication;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
//import android.view.Menu;
//import android.view.MenuInflater;
//import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld extends Activity {

    TextView tv;
    TextView tv2;

    public HelloWorld() {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hello_world);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText("public class HelloWorld \n{\npublic static void main(String[] args)\n {\nSystem.out.println(''Hello World'');\n}\n}\n\n\n");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Hello World</font>").toString()));
    }/**
     * Created by MD DANISH on 01-01-2017.
     */
}