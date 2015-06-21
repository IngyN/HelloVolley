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


public class GetActivity extends ActionBarActivity implements View.OnClickListener {

    private EditText etParam1;
    private EditText etParam2;
    private Button btnSend;
    private TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        etParam1 = (EditText)findViewById(R.id.etGetParam1);
        etParam2 = (EditText)findViewById(R.id.etGetParam2);
        btnSend = (Button)findViewById(R.id.btnSendGet);
        tvResponse = (TextView)findViewById(R.id.tvGetResponse);

        btnSend.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_get, menu);
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
