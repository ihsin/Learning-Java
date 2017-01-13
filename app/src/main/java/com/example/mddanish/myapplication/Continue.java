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
public class Continue extends Activity{
    TextView tv;
    TextView tv2;

    public Continue()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.continue_activity);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(Html.fromHtml((new StringBuilder("<b><font color='#FF0000'>Syntax:</font></b><br></br><br></br>")).append("continue;").append("<font color='#FF0000'><b><br></br><br></br><br></br><br></br>Example:</b></font><br></br><br></br>").append("public class Test<br></br>{<br></br>public static void main(String args[])<br></br>{<br></br>int [] numbers = {10, 20, 30, 40, 50};<br></br>for(int x : numbers ) <br></br>{<br></br>if( x == 30 )<br></br>{<br></br>continue;<br></br>}<br></br>System.out.print( x );<br></br>System.out.print(''\\n'');<br></br>}<br></br>}<br></br>}<br></br>").toString()));
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>10<br></br>10<br></br>20<br></br>40<br></br>50<br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
