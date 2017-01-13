package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by MD DANISH on 01-01-2017.
 */
public class Innr extends Activity {
    TextView tv;

    public Innr()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.innr);
        tv = (TextView) findViewById(R.id.textView1);
        tv.setText(Html.fromHtml("<h1><font color=#ff0000>What is an inner class?</font></h1>Inner class are defined inside the body of another class (known as outer class). These classes can have access modifier or even can be marked as abstract and final. Inner classes have special relationship with outer class instances. This relationship allows them to have access to outer class members including private members too.<b><br></br><br></br><font color=#82E0AA >Inner classes can be defined in four different following ways as mentioned below:</big></b></font></font><br></br><br></br><br></br><b><font color=#D2B4DE>1).</font></b>Inner class<br></br><b><font color=#D2B4DE>2).</font></b>Method \u2013 local inner class<br></br><b><font color=#D2B4DE>3).</font></b>Anonymous inner class<br></br><b><font color=#D2B4DE>4).</font></b>Static nested class<br></br><br></br><big><font color=#82E0AA><b>1). Inner class</b></font></big><br></br><br></br>Java inner class or nested class is a class i.e. declared inside the class or interface.We use inner classes to logically group classes and interfaces in one place so that it can be more readable and maintainable.Additionally, it can access all the members of outer class including private data members and methods.<br></br><br></br><big><font color=#82E0AA><b>2). Method\u2013Local inner classes</b></font></big><br></br><br></br>A method local inner class is defined within a method of the enclosing class. If you want to use inner class , you must instantiate the inner class in the same method, but after the class definition code. Only two modifiers are allowed for method-local inner class which are abstract and final.The inner class can use the local variables of the method (in which it is present), only if they are marked final.<br></br><br></br><big><font color=#82E0AA><b>3). Anonymous Inner Classes</b></font></big><br></br><br></br>It is a type of inner class which<br></br><br></br><b><font color=#D2B4DE>1.</font></b>has no name<br></br><br></br><b><font color=#D2B4DE>2.</font></b>can be instantiated only once<br></br><br></br><b><font color=#D2B4DE>3.</font></b>is usually declared inside a     method or a code block ,a curly   braces ending with semicolon<br></br><br></br><b><font color=#D2B4DE>4.</font></b>is accessible only at the point     where it is defined.<br></br><br></br><b><font color=#D2B4DE>5.</font></b>does not have a constructor     simply because it does not have a     name<br></br><br></br><b><font color=#D2B4DE>6.</font></b>cannot be static<br></br><br></br><big><font color=#82E0AA><b>4). Static Nested Classes</b></font></big><br></br><br></br>A static nested classes are the inner classes marked with static modifier.Because this is static in nature so this type of inner class doesn\u2019t share any special kind of relationship with an instance of outer class.A static nested class cannot access non static members of outer class."));
    }
}
