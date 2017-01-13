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
public class EvenOdd extends Activity{
    TextView tv;
    TextView tv2;

    public EvenOdd()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.evenodd);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText("class OddOrEven\n{\n public static void main(String args[])\n{\n int x;\n System.out.println(''Enter an integer to check if it is odd or even '');\n Scanner in = new Scanner(System.in);\n x = in.nextInt();\nif ( x % 2 == 0 )\nSystem.out.println(''You entered an even number.'');\nelse\nSystem.out.println(''You entered an odd number.'');\n}\n}\n\n");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Enter an integer to check if it is odd or even<br></br>6<br></br>You entered an even number.<br></br>Enter an integer to check if it is odd or even<br></br>5<br></br>You entered an odd number.</font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
