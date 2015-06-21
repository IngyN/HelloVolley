package com.ahmedagiza.hellovolley.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ahmedagiza.hellovolley.R;


public class CustomActivity extends ActionBarActivity implements View.OnClickListener{

    private EditText etFirst;
    private EditText etLast;
    private EditText etAge;
    private Button btnSend;
    private TextView tvFirst;
    private TextView tvLast;
    private TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        etFirst = (EditText) findViewById(R.id.etCustomFirst);
        etLast = (EditText) findViewById(R.id.etCustomLast);
        etAge = (EditText) findViewById(R.id.etCustomAge);
        btnSend = (Button) findViewById(R.id.btnSendCustom);
        tvFirst = (TextView) findViewById(R.id.tvCustomFirstResponse);
        tvLast = (TextView) findViewById(R.id.tvCustomLastResponse);
        tvAge = (TextView) findViewById(R.id.tvCustomAgeResponse);

        btnSend.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_acitvity, menu);
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

    @Override
    public void onClick(View v) {

    }
}
