package com.undencem.realestatesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import sqliteopenhelper.DatabaseAccess;

public class MainActivity extends AppCompatActivity {

    public EditText mEditText;
    public Button mButton;
    public TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText)findViewById(R.id.editText);
        mButton = (Button)findViewById(R.id.button);
        mTextView = (TextView)findViewById(R.id.textView);

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // create the instance of DatabaseAccess
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();

                String n = mEditText.getText().toString();

                mTextView.setText(databaseAccess.getIl(Integer.parseInt(n)));

                databaseAccess.close();
            }
        });

    }
}