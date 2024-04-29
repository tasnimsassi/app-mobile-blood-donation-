package com.example.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    private Button btnLogout;
    private Button btnDonateNow;
    private Button btnFindDonors;
    private Button btnLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnLogout = findViewById(R.id.btnMyProf);
        btnDonateNow = findViewById(R.id.btnDonateNow);
        btnFindDonors = findViewById(R.id.btnFindDonors);
        btnLocation = findViewById(R.id.btnLocation);

        // click listeners
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Home.this, "Logout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this, UserProfile.class);
                startActivity(intent);

            }
        });

        btnDonateNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Home.this, "Donate Now clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this, group.class);
                startActivity(intent);
            }
        });

        btnFindDonors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Find Donors clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this, donors.class);
                startActivity(intent);
            }
        });

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Location clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Home.this, Locations.class);
                startActivity(intent);
            }
        });

    }
}
