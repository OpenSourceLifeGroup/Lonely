package fr.vjblind.www.lonely;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.content.Intent;
import android.app.Activity;
public class Second_Activity extends AppCompatActivity {


    public final static  String Message_key = "keykeykeykey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_    );
      Intent intent=getIntent();

        TextView textV= (TextView)findViewById(R.id.textView3);
        textV.setText(intent.getStringExtra(Message_key));

    }

    public void s(View v){
Intent myntebnt= new Intent (Second_Activity.this,third_activity.class);
       startActivity ( myntebnt);
    }




}
