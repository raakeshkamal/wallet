package com.example.walletofindia;


 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.os.CountDownTimer;
 import android.os.Handler;
 import android.view.Menu;
 import android.widget.TextView;
 import android.widget.Toast;

public class chal2page2f extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chal2_page2f);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.chal2_page2f, menu);
        return true;
    }


}
