package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by MD DANISH on 02-01-2017.
 */
public class Over extends Activity {
    TextView tv;

    public Over()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.over);
        tv = (TextView)findViewById(R.id.textView1);
        tv.setText(Html.fromHtml("<h1><font color=#ff0000>1)Method Overloading:</font></h1><br></br>In Java, it is possible to define two or more methods of same name in a class, provided that there argument list or parameters are different. This concept is known as Method Overloading.I have covered method overloading and Overriding below.<br></br><b><font color=#D2B4DE>1.</font></b>To call an overloaded method in Java, it is must to use the type and/or number of arguments to determine which version of the overloaded method to actually call.<br></br><br></br><b><font color=#D2B4DE>2.</font></b>Overloaded methods may have different return types; the return type alone is insufficient to distinguish two versions of a method. .<br></br><br></br><b><font color=#D2B4DE>3.</font></b>When Java encounters a call to an overloaded method, it simply executes the version of the method whose parameters match the arguments used in the call.<br></br><br></br><b><font color=#D2B4DE>4.</font></b>It allows the user to achieve compile time polymorphism.<br></br><br></br><b><font color=#D2B4DE>5.</font></b>An overloaded method can throw different exceptions.<br></br><br></br><b><font color=#D2B4DE>6.</font></b>It can have different access modifiers.<h2><font color=#ff0000>2)Method Overriding:</font></h2>Child class has the same method as of base class. In such cases child class overrides the parent class method without even touching the source code of the base class. This feature is known as method overriding.<br></br><br></br><b><font color=#5DADE2>Rules for Method Overriding:</b></font><br></br><br></br>In Java, it is possible to define two or more methods of same name in a class, provided that there argument list or parameters are different. This concept is known as Method Overloading.<br></br><br></br><b><font color=#D2B4DE>1.</font></b>applies only to inherited methods<br></br><br></br><b><font color=#D2B4DE>2.</font></b>object type (NOT reference variable type) determines which overridden method will be used at runtime<br></br><br></br><b><font color=#D2B4DE>3.</font></b>Overriding method can have different return type (refer this)<br></br><br></br><b><font color=#D2B4DE>4.</font></b>Overriding method must not have more restrictive access modifier<br></br><br></br><b><font color=#D2B4DE>5.</font></b>Abstract methods must be overridden<br></br><br></br><b><font color=#D2B4DE>6.</font></b>Static and final methods cannot be overridden<br></br><br></br><b><font color=#D2B4DE>7.</font></b>Constructors cannot be overridden<br></br><br></br><b><font color=#D2B4DE>8.</font></b>It is also known as Runtime polymorphism.<br></br><br></br><big><b><font color=#82E0AA>super keyword in Overriding:</font></big></b><br></br><br></br>When invoking a superclass version of an overridden method the super keyword is used."));
    }

}
