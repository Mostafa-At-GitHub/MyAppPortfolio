package com.sarahehabm.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        String message = "This button will launch ";
        switch (view.getId()) {
            case R.id.button_project1:
                message += getString(R.string.project1);
                break;

            case R.id.button_project2:
                message += getString(R.string.project2);
                break;

            case R.id.button_project3:
                message += getString(R.string.project3);
                break;

            case R.id.button_project4:
                message += getString(R.string.project4);
                break;

            case R.id.button_project5:
                message += getString(R.string.project5);
                break;

            case R.id.button_project6:
                message += getString(R.string.project6);
                break;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
