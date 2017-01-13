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
public class PrimeNo extends Activity {
    TextView tv;
    TextView tv2;

    public PrimeNo()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.primeno);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText("class Prime\n{\npublic static void main(String args[])\n{\nint n, i, res;\nboolean flag=true;\nScanner scan= new Scanner(System.in);\nSystem.out.println(''Please Enter a No.'');\nn=scan.nextInt();\nfor(i=2;i<=n/2;i++)\n{\nres=n%i;\nif(res==0)\n{\nflag=false;\nbreak;\n}\n}\nif(flag)\nSystem.out.println(n + '' is Prime Number'');\nelse\nSystem.out.println(n + '' is not Prime Number'');\n}\n}\n}\n}\n");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Please Enter a No.: 7<br></br>7 is Prime Number<br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
