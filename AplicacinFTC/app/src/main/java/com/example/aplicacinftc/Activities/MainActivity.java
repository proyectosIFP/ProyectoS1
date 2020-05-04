package com.example.aplicacinftc.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplicacinftc.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button botonLogout;

    //OBJETO PARA LA BASE DE DATOS
    private DatabaseReference mDataBase;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        mDataBase = FirebaseDatabase.getInstance().getReference();

        botonLogout = (Button) findViewById(R.id.buttonLogout);

        botonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDataBase.child("Users").child(mAuth.getCurrentUser().getUid()).child("recordar").setValue("false");
                mAuth.signOut();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
