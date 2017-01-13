package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by MD DANISH on 01-01-2017.
 */
public class Abst extends Activity {
    TextView tv;

    public Abst()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inheritance);
        tv = (TextView) findViewById(R.id.textView1);
        tv.setText(Html.fromHtml("<h1><font color=#ff0000>Abstract Classes and Methods in Java</font></h1>A class that is declared using \u201Cabstract\u201D keyword is known as abstract class. It may or may not include abstract methods which means in abstract class you can have concrete methods (methods with body) as well along with abstract methods ( without an implementation, without braces, and followed by a semicolon). An abstract class can not be instantiated (you are not allowed to create object of Abstract class).<b><br></br><br></br><font color=#82E0AA ><big>Abstract class declaration</big></b></font></font><br></br><br></br>Specifying abstract keyword before the class during declaration, makes it abstract. Have a look at below code: Since abstract class allows concrete methods as well, it does not provide 100% abstraction. You can say that it provides partial abstraction. Interfaces are used for 100% abstraction (full abstraction) <br></br><br></br> <b><font color=#5DADE2>Remember two rules:</b></font>  <br></br>1)If the class is having few abstract methods and few concrete methods: declare it as abstract class. <br></br> 2)If the class is having only abstract methods: declare it as interface. <br></br><br></br><b><br></br><br></br><font color=#82E0AA  ><big>Error!! \u2013 Object creation of abstract class is not allowed</big> </b></font><br></br><br></br>As discussed above, we cannot instantiate an abstract class. The following code throws an error. <br></br><br></br><b><font color=#F1C40F>Note:</b></font> <i>The class that extends the abstract class, have to implement all the abstract methods of abstract class, else they can be declared abstract in the class as well. </i><h2><font color=#ff0000>Why we need an abstract class?</font></h2> Let me explain this with an example. Suppose there is a class Animaland there are few other classes like Cat, Dog and Horse. These classes extends Animal class so basically they are having few common habits(methods in technically) which they are inheriting from Animal class. Now, if you have understood the above example then you would have been able to figure out that creating object of Animal class has no significance as you can\u2019t judge that the new object of Animal class will represent which animal. Hence for such kind of scenarios we generally creates an abstract class and later concrete classes extends these classes and overrides their methods accordingly and can have their own methods as well. <b><br></br><br></br><font color=#82E0AA  ><big>Abstract vs Concrete </big></b></font><br></br><br></br>A class which is not abstract is referred as Concrete class. In the above example which I explained \u2013 Animal is a abstract class and Cat,Dog and Horse are concrete classes. <br></br><b><font color=#5DADE2>Key Points:</b></font> \t<br></br>1.An abstract class has no use until unless it is extended by some other class. <br></br>  2.If you declare an abstract method (discussed below) in a class then you must declare the class abstract as well. you can\u2019t have abstract method in a non-abstract class. It\u2019s vice versa is not always true: If a class is not having any abstract method then also it can be marked as abstract. <br></br>3.\tAbstract class can have non-abstract method (concrete) as well. \n<h3><font color=#ff0000>Abstract methods </font></h3>Well, we already discussed about abstract methods in the above section. Lets take few examples to understand it better. syntax: public abstract void display(); <br></br><b><font color=#5DADE2>Points to remember about abstract method: </font></b><br></br>1) Abstract method has no body. <br></br>2) Always end the declaration with a semicolon(;). <br></br>3) It must be overridden. An abstract class must be extended and in a same way abstract method must be overridden. <br></br>4) Abstract method must be in a abstract class. <br></br><br></br><b><font color=#F1C40F>Note:</font></b> <i>The class which is extending abstract class must override (or implement) all the abstract methods. </i>"));
    }
}
