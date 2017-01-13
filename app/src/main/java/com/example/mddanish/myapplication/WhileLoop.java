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

public class WhileLoop extends Activity {
    TextView tv;
    TextView tv2;

    public WhileLoop()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.whileloop);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(Html.fromHtml((new StringBuilder("<b><font color='#FF0000'>Syntax:</font></b><br></br><br></br>")).append("while(Boolean_expression)<br></br>{<br></br>//Statements<br></br>}<br></br><br></br><br></br>").append("<font color='#FF0000'><b>Example:</b></font><br></br><br></br>").append("class WhileLoopExample<br></br> {<br></br>public static void main(String args[])<br></br>{<br></br>int i=10<br></br>while(i>1)<br></br>{<br></br>System.out.println(''The Value of i is:''+i''+''\\n'');<br></br>i--;<br></br>}<br></br>}<br></br>}<br></br><br></br><br></br>").toString()));
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>The value of i is:10<br></br>The value of i is: 9<br></br>The value of i is: 8<br></br>The value of i is: 7<br></br>The value of i is:6 <br></br>The value of i is:5<br></br>The value of i is:4 <br></br>The value of i is:3<br></br>The value of i is:2<br></br</font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
