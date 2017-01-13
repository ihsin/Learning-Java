package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by MD DANISH on 02-01-2017.
 */
public class Super extends Activity {
    TextView tv;

    public Super()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.super_keyword);
        tv = (TextView)findViewById(R.id.textView1);
        tv.setText(Html.fromHtml("<h1><font color=#000000>Super Keyword</font></h1>The super keyword in java is a reference variable that is used to refer immediate parent class object.Whenever you create the instance of subclass, an instance of parent class is created implicitly i.e. referred by super reference variable.<b><br></br><br></br><font color=#82E0AA ><big>Usage of java super Keyword</big></b></font></font><br></br><br></br><b><font color=#D2B4DE>1.</font></b>super is used to refer immediate parent class instance variable.<br></br><br></br<b><font color=#D2B4DE>2.</font></b>super() is used to invoke immediate parent class constructor.<br></br><br></br<b><font color=#D2B4DE>3.</font></b>super is used to invoke immediate parent class method."));
    }

}
