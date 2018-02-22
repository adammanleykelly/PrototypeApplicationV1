package com.example.adam.prototypeApplicationV1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
public class ViewActivity extends AppCompatActivity {

    Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
    }
}
