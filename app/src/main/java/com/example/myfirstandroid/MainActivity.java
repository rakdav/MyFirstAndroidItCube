package com.example.myfirstandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    private EditText first,second;
    private Button add;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        add=findViewById(R.id.add);
        result=findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(first.getText().toString());
                int b=Integer.parseInt(second.getText().toString());
                int s=a+b;
                result.setText(Integer.toString(s));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }
}