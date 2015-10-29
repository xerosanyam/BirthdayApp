package com.example.android.birthdayapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.img);
        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                shortclick();
            }
        });

        image.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                longclick();
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onSubmit(View view){
        ImageView imageView=(ImageView)findViewById(R.id.img);
        Button button=(Button)findViewById(R.id.btn);
        if (count==0){
            imageView.setImageResource(R.drawable.home);
            button.setText("Blow Candles");
            count++;
        }
        else if (count==1){
            imageView.setImageResource(R.drawable.cat);
            button.setText("Try harder !");
            count++;
        }
        else if (count>=2){
            imageView.setImageResource(R.drawable.blown);
            button.setText("Happy Birthday !!");
        }
    }
    public void shortclick()
    {
        Toast.makeText(this, "You seem very eager to have the cake :)", Toast.LENGTH_LONG).show();

    }

    public void longclick()
    {
        Toast.makeText(this, "Be careful, the cake is not real, but your screen is. :P", Toast.LENGTH_LONG).show();
    }
}
