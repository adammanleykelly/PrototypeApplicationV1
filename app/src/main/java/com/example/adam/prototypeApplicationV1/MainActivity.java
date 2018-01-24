package com.example.adam.prototypeApplicationV1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;
import android.nfc.NfcAdapter;

import com.google.firebase.auth.*;


public class MainActivity extends AppCompatActivity
{

    Button button, button1;
    NfcAdapter mNfcAdapter;
    TextView mTextView, status;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textView2);
        status = (TextView) findViewById(R.id.status_textView);

       //Test if Device has NFC and if it is enabled
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);

        if (mNfcAdapter == null) {
            // Stop here, we definitely need NFC
            Toast.makeText(this, "This device doesn't support NFC.", Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        if (!mNfcAdapter.isEnabled())
        {
            mTextView.setText("NFC is disabled.");
        }
        else
        {
            mTextView.setText("NFC is Enabled");
        }


        button = (Button) findViewById(R.id.buttonScan);
        button1 = (Button) findViewById(R.id.buttonEmulate);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                           ScanActivity1();}
                });
        button1.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                       EmulateActivity1();}
                });
    }

    public void ScanActivity1()
    {
        Intent act1 = new Intent(this,ScanActivity.class);
        startActivity(act1);
    }

    public void EmulateActivity1()
    {
        Intent act2 = new Intent(this,EmulateActivity.class);
        startActivity(act2);
    }
}
