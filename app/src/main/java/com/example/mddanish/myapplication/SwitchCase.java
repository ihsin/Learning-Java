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
public class SwitchCase extends Activity {
    TextView tv;
    TextView tv2;

    public SwitchCase()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.switchcase);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(Html.fromHtml((new StringBuilder("<b><font color='#FF0000'>Syntax:</font></b><br></br><br></br>")).append("switch(expression){<br></br>case value :<br></br> //Statements<br></br>break; //optional<br></br>case value :<br></br>//Statements<br></br>break; //optional<br></br>//You can have any number of case statements.<br></br>default : //Optional<br></br>//Statements<br></br>}<br></br><br></br><br></br>").append("<font color='#FF0000'><b>Example:</b></font><br></br><br></br>").append("public class Test<br></br>public static void main(String args[])<br></br>char grade = 'C';<br></br>switch(grade)<br></br>{<br></br>case 'A' :<br></br>System.out.println(''Excellent!'');<br></br>break;<br></br>case 'B' :<br></br>System.out.println(''Very Good'');<br></br>case 'C' :<br></br>System.out.println(''Well done'');<br></br>break;<br></br>case 'D' :<br></br>System.out.println(''You passed'');<br></br>case 'F' :<br></br>System.out.println(''Failed'');<br></br>break;<br></br>default :<br></br>System.out.println(''Invalid grade'');<br></br>}<br></br>System.out.println(''Your grade is '' + grade);}<br></br>}<br></br><br></br><br></br><br></br>").toString()));
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Well done </br>Your grade is C</br><br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
