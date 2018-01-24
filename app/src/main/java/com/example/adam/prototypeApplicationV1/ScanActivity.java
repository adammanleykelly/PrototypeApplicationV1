package com.example.adam.prototypeApplicationV1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;

public class ScanActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        button = (Button) findViewById(R.id.buttonCancel);
        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        CancelActivity1();}
                });
    }

    public void CancelActivity1()
    {
        Intent act1 = new Intent(this,MainActivity.class);
        startActivity(act1);
    }


}
