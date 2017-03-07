package fr.vjblind.www.lonely;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.app.Activity;
public class third_activity extends AppCompatActivity {


   // String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void s(View v){

        Intent myntebnt= new Intent (third_activity.this,MainActivity_lon.class);
        startActivity ( myntebnt);
    }
}
