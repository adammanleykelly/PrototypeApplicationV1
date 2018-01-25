package com.example.adam.prototypeApplicationV1;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirebaseActivity extends AppCompatActivity {

    Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);

        buttonBack = (Button) findViewById(R.id.fireButton);

        buttonBack.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        CancelActivity();}
                });
    }

    public void CancelActivity()
    {
        Intent act1 = new Intent(this,MainActivity.class);
        startActivity(act1);
    }

}
