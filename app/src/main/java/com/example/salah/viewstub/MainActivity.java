package com.example.salah.viewstub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ShowButton, HideButton;
    ViewStub viewStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        viewStub = (ViewStub)findViewById( R.id.viewStub );
        viewStub.inflate();
        ShowButton = (Button)findViewById( R.id.ShowButton );
        HideButton = (Button)findViewById( R.id.HideButton );

        ShowButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewStub.setVisibility( view.VISIBLE );
                Toast.makeText( getApplication(), "Salah Visible", Toast.LENGTH_LONG ).show();
            }
        } );
        HideButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewStub.setVisibility( view.GONE );
                Toast.makeText( getApplication(), "Salah invisible", Toast.LENGTH_LONG ).show();
            }
        } );
    }
}
