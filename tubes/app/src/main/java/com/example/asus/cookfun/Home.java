package com.example.asus.cookfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView imgHome, imgLove, imgAdd, imgProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgHome = findViewById(R.id.imgHome);
        imgLove = findViewById(R.id.imgLove);
        imgAdd = findViewById(R.id.imgAdd);
        imgProfil = findViewById(R.id.imgProfil);

        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add = new Intent(Home.this, Add.class);
                startActivity(add);
            }
        });

    }
}
