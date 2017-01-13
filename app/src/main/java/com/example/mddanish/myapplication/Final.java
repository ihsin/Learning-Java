package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by MD DANISH on 02-01-2017.
 */
public class Final extends Activity {
    TextView tv;

    public Final()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.final_main);
        tv = (TextView) findViewById(R.id.textView1);
        tv.setText(Html.fromHtml("<h1><font color=#ff0000>Final Keyword</font></h1>The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:<br></br><br></br><b><font color=#D2B4DE>1.</font></b>Final Variable<br></br><b><font color=#D2B4DE>2.</font></b>Final Method<br></br><b><font color=#D2B4DE>3.</font></b>Final Class<br></br><br></br>The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. <h2><font color=#82E0AA>Final Variable<br></br></font></h2>Any variable either member variable or local variable (declared inside method or block) modified by final keyword is called final variable. Final variables are often declare with static keyword in java and treated as constant.<h2><font color=#82E0AA>Final Method<br></br></font></h2>Final keyword in java can also be applied to methods. A java method with final keyword is called final method and it can not be overridden in sub-class. You should make a method final in java if you think it\u2019s complete and its behavior should remain constant in sub-classes. Final methods are faster than non-final methods because they are not required to be resolved during run-time and they are bonded on compile time.<h2><font color=#82E0AA>Final Class<br></br></font></h2>Java class with final modifier is called final class in Java. Final class is complete in nature and can not be sub-classed or inherited. Several classes in Java are final e.g. String, Integer and other wrapper classes."));
    }
}
