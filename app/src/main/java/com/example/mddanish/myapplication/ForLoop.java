package com.example.mddanish.myapplication;

/**
 * Created by MD DANISH on 01-01-2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
public class ForLoop extends Activity{
    TextView tv;
    TextView tv2;

    public ForLoop()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.forloop);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(Html.fromHtml((new StringBuilder("<b><font color='#FF0000'>Syntax:</font></b><br></br><br></br>")).append("for(declaration : expression)<br></br>{<br></br>//Statements<br></br>}<br></br><br></br><br></br><br></br><br></br>").append("<font color='#FF0000'><b>Example:</b></font><br></br><br></br>").append("class ForLoopExample<br></br>{<br></br>public static void main(String args[])<br></br>{<br></br>for(int i=10; i>1; i--)<br></br>{<br></br>System.out.println(''The value of i is: ''+i);<br></br> System.out.print(''\n'')<br></br>;}<br></br>}<br></br>}<br></br><br></br><br></br><br></br><br></br>").toString()));
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>The value of i is: 10<br></br>The value of i is: 9<br></br>The value of i is: 8<br></br>The value of i is: 7<br></br>The value of i is: 6<br></br>The value of i is: 5<br></br>The value of i is: 4<br></br>The value of i is: 3<br></br>The value of i is: 2</font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
