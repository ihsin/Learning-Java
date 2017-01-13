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
public class DoWhile extends Activity {
    TextView tv;
    TextView tv2;

    public DoWhile()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dowhile);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(Html.fromHtml((new StringBuilder("<b><font color='#FF0000'>Syntax:</font></b><br></br><br></br>")).append("do{<br></br>//Statements<br></br>}<br></br>while(Boolean_expression);<br></br><br></br><br></br>").append("<font color='#FF0000'><b>Example:</b></font><br></br><br></br>").append("public class Test<br></br>{<br></br>public static void main(String args[])<br></br>{<br></br>int x = 10;<br></br>do<br></br>{<br></br>System.out.print(''value of x : ''+ x );<br></br>x++;<br></br>System.out.print(''\\n'');<br></br>}<br></br>while( x < 20 );<br></br>}<br></br>}<br></br><br></br><br></br>").toString()));
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>value of x : 10<br></br>value of x : 11<br></br>value of x : 12<br></br>value of x : 13<br></br>value of x : 14<br></br>value of x : 15<br></br>value of x : 16<br></br>value of x : 17<br></br>value of x : 18<br></br>value of x : 19</font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
