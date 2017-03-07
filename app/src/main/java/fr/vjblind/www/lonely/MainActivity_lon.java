package fr.vjblind.www.lonely;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;

public class MainActivity_lon extends AppCompatActivity {
    EditText editTextw;
    public final static  String Message_key = "keykeykeykey";
    Intent myntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lon);

Button ActButton= (Button)findViewById(R.id.ActButton);
TextView textView= (TextView)findViewById(R.id.textView);


        ActButton.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        editTextw= (EditText) findViewById(R.id.editText);

                     String  uu=   editTextw.getText().toString();

                        myntent= new Intent (MainActivity_lon.this ,Second_Activity.class);
                        myntent.putExtra(Message_key, uu);

                         startActivity ( myntent);
                    }


                });
    }
}
