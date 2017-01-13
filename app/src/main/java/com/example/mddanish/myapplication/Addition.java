package com.example.mddanish.myapplication;

/**
 * Created by MD DANISH on 01-01-2017.
 */
import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
//import android.view.Menu;
//import android.view.MenuInflater;
//import android.view.MenuItem;
import android.widget.TextView;

public class Addition extends Activity {

    TextView tv;
    TextView tv2;

    public Addition() {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.addition);
        tv = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);
        tv.setText("class AddNumbers \n{\npublic static void main(String args[ ])\n{\nint x, y, z;\nSystem.out.println(''Enter two integers to calculate their sum'');\nScanner in = new Scanner(System.in);\n x = in.nextInt(); \ny = in.nextInt();\nz = x + y;\nSystem.out.println(''Sum of entered integers = ''+z);\n} \n} \n \n \n");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Enter two integers to calculate their sum:<br></br>13<br></br>45<br></br> Sum of entered integers =58</font>").append("<br></br><br></br><br></br><br><br></br><br></br><br></br><br></br><br></br><br></br></br><br></br><br></br>").toString()));
    }
}
