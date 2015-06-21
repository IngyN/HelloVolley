package com.ahmedagiza.hellovolley.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.ahmedagiza.hellovolley.R;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    public final static String SERVER_URL = "http://csce485.byethost5.com";
    public final static String CUSTOMER_URL = SERVER_URL + "/customer.php";
    public final static String JSON_URL = SERVER_URL + "/customer.json";
    public final static String API_URL = SERVER_URL + "/api.php";
    public final static String IMAGE_URL = SERVER_URL + "/android.jpg";

    public final static String LOG_TAG = "HelloVolley";

    private Button btnGet;
    private Button btnPost;
    private Button btnImage;
    private Button btnJson;
    private Button btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGet = (Button)findViewById(R.id.btnOpenGet);
        btnPost = (Button)findViewById(R.id.btnOpenPost);
        btnImage = (Button)findViewById(R.id.btnOpenImage);
        btnJson = (Button)findViewById(R.id.btnOpenJson);
        btnCustom = (Button)findViewById(R.id.btnOpenCustom);

        btnGet.setOnClickListener(this);
        btnPost.setOnClickListener(this);
        btnImage.setOnClickListener(this);
        btnJson.setOnClickListener(this);
        btnCustom.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        switch(v.getId()){
            case R.id.btnOpenGet:
                startActivity(new Intent(this, GetActivity.class));
                break;
            case R.id.btnOpenPost:
                startActivity(new Intent(this, PostActivity.class));
                break;
            case R.id.btnOpenImage:
                startActivity(new Intent(this, ImageActivity.class));
                break;
            case R.id.btnOpenJson:
                startActivity(new Intent(this, JsonActivity.class));
                break;
            case R.id.btnOpenCustom:
                startActivity(new Intent(this, CustomActivity.class));
                break;
        }
    }
}
