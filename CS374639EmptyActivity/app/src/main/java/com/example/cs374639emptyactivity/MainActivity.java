package com.example.cs374639emptyactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Transition;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_click = (Button)findViewById(R.id.button);
        // Code completion - hint
        // Anonymous class
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAINACTIVITY", "You are here!");
                Log.d("MAINACTIVITY", "In onClick for btn_click");
                btn_click.setText("CLICKED :-(");
                Log.i("test", getApplicationContext().toString());
                Toast t = Toast.makeText(getApplicationContext(), "Bravo", Toast.LENGTH_LONG);
                t.show();
            }
        });

        // Casting
        TextView tv_msg = (TextView)findViewById(R.id.tv_message);

    }
}