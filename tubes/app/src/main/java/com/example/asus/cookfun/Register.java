package com.example.asus.cookfun;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.asus.cookfun.Model.DataHelper;
import com.example.asus.cookfun.Session.SessionManagement;

public class Register extends AppCompatActivity {

    Button button_signup;

    DataHelper dbHelper;
    EditText edtNama, edtEmail, edtPassword;
    Cursor cursor;
    SessionManagement sessionManagement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbHelper = new DataHelper(this);

        edtNama = findViewById(R.id.edtNama);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        button_signup = findViewById(R.id.button_signup);


        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("INSERT INTO user(nama, email, password) VALUES ('"+edtNama.getText().toString()+"','"+edtEmail.getText().toString()+"','"+edtPassword.getText().toString()+"')");
                Toast.makeText(getApplicationContext(), "Register Successful", Toast.LENGTH_SHORT).show();

                Intent a = new Intent(Register.this, Login.class);
                startActivity(a);
            }
        });

    }
}
