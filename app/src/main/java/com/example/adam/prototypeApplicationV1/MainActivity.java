package com.example.adam.prototypeApplicationV1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.nfc.NfcAdapter;
import com.google.firebase.auth.*;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.AsyncTask;
import android.util.Log;



public class MainActivity extends AppCompatActivity
{
    Button button, button1, button2;
    NfcAdapter mNfcAdapter;
    TextView mTextView,sTextView;

    public static final String MIME_TEXT_PLAIN = "text/plain";
    public static final String TAG = "NfcDemo";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sTextView = (TextView) findViewById(R.id.textView2);

       //Test if Device has NFC and if it is enabled
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
        if (mNfcAdapter == null) {
            Toast.makeText(this, "This device doesn't support NFC.", Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        //Status update if NFC is enabled
        if (!mNfcAdapter.isEnabled())
        {
            sTextView.setText("NFC is disabled.");
        }
        else
        {
            sTextView.setText("NFC is Enabled");
        }

        button = (Button) findViewById(R.id.buttonScan);
        button1 = (Button) findViewById(R.id.buttonEmulate);
        button2 = (Button) findViewById(R.id.fireButton);

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

        //Firebase Button
        /*button2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        FireActivity();}
                });*/
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

    //FirebaseActivity
    /*
    public void FireActivity()
    {
        Intent act3 = new Intent(this,FirebaseActivity.class);
        startActivity(act3);
    }*/


}
