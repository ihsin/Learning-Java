package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by MD DANISH on 02-01-2017.
 */
public class Encapsulation extends Activity {
    TextView tv;

    public Encapsulation()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.encapsulation);
        tv = (TextView)findViewById(R.id.textView1);
        tv.setText(Html.fromHtml("<h1><font color=#ff0000>Abstract Classes and Methods in Java</font></h1>I have already discussed a brief about encapsulation while discussing OOPs concepts. I have also covered polymorphism and inheritance in separate articles. In this post we will discuss encapsulation in java with examples.<b><br></br><br></br><font color=#82E0AA ><big>What is encapsulation?</big></b></font></font><br></br><br></br>The whole idea behind encapsulation is to hide the implementation details from users. If a data member is private it means it can only be accessed within the same class. No outside class can access private data member (variable) of other class. However if we setup public getter and setter methods to update (for e.g. void setSSN(int ssn))and read (for e.g.  int getSSN()) the private data fields then the outside class can access those private data fields via public methods. This way data can only be accessed by public methods thus making the private fields and their implementation hidden for outside classes. That\u2019s why encapsulation is known as data hiding.<b><br></br><br></br><font color=#82E0AA ><big>Advantages of encapsulation:</big></b></font></font><br></br><br></br><br></br><b><font color=#D2B4DE>1.</font></b>It improves maintainability and flexibility and re-usability: for e.g. In the above code the implementation code of void setEmpName(String name) and String getEmpName() can be changed at any point of time. Since the implementation is purely hidden for outside classes they would still be accessing the private field empName using the same methods (setEmpName(String name) and getEmpName()). Hence the code can be maintained at any point of time without breaking the classes that uses the code. This improves the re-usability of the underlying class.<br></br><br></br><b><font color=#D2B4DE>2.</font></b>The fields can be made read-only (If we don\u2019t define setter methods in the class) or write-only (If we don\u2019t define the getter methods in the class). For e.g. If we have a field(or variable) which doesn\u2019t need to change at any cost then we simply define the variable as private and instead of set and get both we just need to define the get method for that variable. Since the set method is not present there is no way an outside class can modify the value of that field.<br></br><br></br><b><font color=#D2B4DE>3.</font></b>User would not be knowing what is going on behind the scene. They would only be knowing that to update a field call set method and to read a field call get method but what these set and get methods are doing is purely hidden from them.<br></br><br></br><b>Encapsulation is also known as \u201Cdata Hiding\u201D.</b><br></br><br></br><br></br><b><font color=#D2B4DE>1.</font></b>Objects encapsulate data and implementation details. To the outside world, an object is a black box that exhibits a certain behavior.<br></br><br></br><b><font color=#D2B4DE>2.</font></b>The behavior of this object is what which is useful for the external world or other objects.<br></br><br></br><b><font color=#D2B4DE>3.</font></b>An object exposes its behavior by means of public methods or functions.<br></br><br></br><b><font color=#D2B4DE>4.</font></b>The set of functions an object exposes to other objects or external world acts as the interface of the object."));
    }
}
