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
public class IfElse extends Activity {
    TextView tv;
    TextView tv2;

    public IfElse()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ifelse);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(Html.fromHtml((new StringBuilder("<b><font color='#FF0000'>Syntax:</font></b><br></br><br></br>")).append("if(Boolean_expression)<br></br>{<br></br>//Executes when the Boolean expression is true\n<br></br>}\n<br></br>else\n<br></br>{\n<br></br>//Executes when the Boolean expression is false\n<br></br>}<br></br><br></br><br></br><br></br><br></br>").append("<font color='#FF0000'><b>Example:</b></font><br></br><br></br>").append("public class Test<br></br>{<br></br>public static void main(String args[]){<br></br> int x = 30;<br></br>if( x < 20 )<br></br>{<br></br> System.out.print(''This is if statement'');<br></br>}<br></br>else<br></br>{<br></br> System.out.print(''This is else statement'');<br></br>}<br></br>}<br></br>}<br></br><br></br><br></br><br></br>\n\n\n\n\n").toString()));
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>This is else statement<br></br><br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}

