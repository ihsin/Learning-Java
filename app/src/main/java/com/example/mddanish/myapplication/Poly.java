package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by MD DANISH on 02-01-2017.
 */
public class Poly extends Activity {
    TextView tv;

    public Poly()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.poly);
        tv = (TextView)findViewById(R.id.textView1);
        tv.setText(Html.fromHtml("<h1><font color=#ff0000>What is polymorphism in programming</font></h1>Polymorphism is the capability of a method to do different things based on the object that it is acting upon. In other words, polymorphism allows you define one interface and have multiple implementations. I know it sounds confusing. Don\u2019t worry we will discuss this in detail.<br></br><b><font color=#D2B4DE>1</font></b>.It is a  feature that allows one interface to be used for a general class of  actions.<br></br><br></br><b><font color=#D2B4DE>2.</font></b>An operation may exhibit different behavior in different instances.<br></br><br></br><b><font color=#D2B4DE>3.</font></b>The behavior depends on the types of data used in the operation.<br></br><br></br><b><font color=#D2B4DE>4.</font></b>It plays an important role in allowing objects having different internal structures to share the same external interface.<br></br><br></br><b><font color=#D2B4DE>5.</font></b>Polymorphism is extensively used in implementing inheritance.<br></br><br></br>Following concepts demonstrate different types of polymorphism in java.<br></br><br></br><b><font color=#F7DC6F>1)<u>  Method Overloading</b></u></font><br></br><b><font color=#F7DC6F>2)<u>  Method Overriding<br></br></b></u></font>"));
    }
}
