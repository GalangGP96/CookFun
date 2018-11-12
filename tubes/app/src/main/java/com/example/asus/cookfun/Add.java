package com.example.asus.cookfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Add extends AppCompatActivity {

    ImageView imgHome1, imgLove1, imgAdd1, imgProfil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        imgHome1 = findViewById(R.id.imgHome1);
        imgLove1 = findViewById(R.id.imgLove1);
        imgAdd1 = findViewById(R.id.imgAdd1);
        imgProfil1 = findViewById(R.id.imgProfil1);

        imgHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(Add.this, Home.class);
                startActivity(home);
            }
        });
    }
}
