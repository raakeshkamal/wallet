package com.example.walletofindia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class Chal2Page2 extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chal2_page2);
        final TextView time=(TextView)findViewById(R.id.secleft);

		 /*for(int i=0;i<9;i++)
		 {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 TextView ti = (TextView) findViewById(R.id.secleft);
			 ti.setText((Integer.parseInt(ti.getText().toString())-1)+"");
		 }*/
		
		/*long t1=System.currentTimeMillis(),t2;
		int x=1,c=0;
		
		while(true)
		{
			if(x==1){
				t1=System.currentTimeMillis();
				x=0;
			}
			t2=System.currentTimeMillis();
			if(t2-t1>1000)
			{
				TextView ti = (TextView) findViewById(R.id.secleft);
				ti.setText((Integer.parseInt(ti.getText().toString())-1)+"");
				Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
				x=1;
				c++;
			}
			if(c==9)	break;
		}
        final Runnable mMyRunnable = new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(getApplicationContext(),Chal3Page2.class);
                startActivity(intent);

            }
        };

        Handler myHandler = new Handler();
        myHandler.postDelayed(mMyRunnable, 1000);
        */

            new CountDownTimer(5000, 1000) {

                public void onTick(long millisUntilFinished) {
                    time.setText("" + (int) (millisUntilFinished / 1000));
                }

                public void onFinish() {
                    //text.setText("done!");
                    Intent intent = new Intent(getApplicationContext(), Chal2Page3.class);
                    startActivity(intent);
                }
            }.start();



    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chal2_page2, menu);
		return true;
	}

}
