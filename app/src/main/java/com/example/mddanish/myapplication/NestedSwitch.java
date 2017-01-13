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
public class NestedSwitch extends Activity {
    TextView tv;
    TextView tv2;

    public NestedSwitch()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.nestedswitch);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(Html.fromHtml((new StringBuilder("<b><font color='#FF0000'>Syntax:</font></b><br></br><br></br>")).append("switch (value){<br></br>case 1:<br></br> switch (value)<br></br>{<br></br>case 1:<br></br>statement(s)<br></br>break;<br></br>.<br></br>. <br></br>case n:<br></br>statement (n)<br></br>break;<br></br>default:<br></br>statement<br></br>}<br></br>case 2:<br></br>statement(s)<br></br>break;<br></br>.<br></br>.<br></br>case n:<br></br>statement (n)<br></br>break;<br></br>default:<br></br>statement<br></br>}<br></br><br></br><br></br>").append("<font color='#FF0000'><b>Example:</b></font><br></br><br></br>").append("public class NestedSwitchExample<br></br>{<br></br>public static void main(String[] args)<br></br>{<br></br>int i = 0;<br></br> int j = 1;<br></br>switch(i)<br></br>{<br></br>case 0:<br></br>switch(j)<br></br> {<br></br> case 0:<br></br> System.out.println(''i is 0, j is 0'');<br></br> break;<br></br>case 1:<br></br> System.out.println(''i is 0, j is 1'');<br></br> break;<br></br> default:<br></br>System.out.println(''nested default case!!'');<br></br>}<br></br>break;<br></br>default:<br></br>System.out.println(''No matching case found!!'');<br></br>}<br></br>}<br></br>}<br></br>").toString()));
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Output Would be,<br></br>i is 0, j is 1<br></br><br></br><br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }

}
