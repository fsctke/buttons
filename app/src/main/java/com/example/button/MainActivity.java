package com.example.button;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    int x;
    Button flatButton;
    FloatingActionButton myFloatingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button) findViewById(R.id.raisedButton);
        x = 1;

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button was clicked!!!", Toast.LENGTH_SHORT).show();
                myButton.setText("this is cool!!");
                if (x == 1) {
                    myButton.animate().translationXBy(40f).setDuration(1000);
                    x = 2;
                } else if (x == 2) {

                    myButton.animate().translationXBy(-40f).setDuration(1000);
                }
            }
        });

        flatButton = (Button) findViewById(R.id.flat_button);
        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "flat button was clicked!!", Toast.LENGTH_SHORT).show();
                flatButton.setText("text has been changed");
            }
        });

        myFloatingButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        myFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMethod();
            }
        });


    }

    public void myMethod() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("title").setMessage("this is a message").setPositiveButton("click me", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).show();
    }
}
