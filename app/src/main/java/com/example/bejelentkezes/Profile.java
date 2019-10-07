package com.example.bejelentkezes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView textViewFirstName,textViewLastName,textViewCountProfile,textViewDepartment;
    Button backButton;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textViewFirstName = (TextView)findViewById(R.id.textView);
        textViewLastName = (TextView)findViewById(R.id.textView2);
        textViewDepartment = (TextView)findViewById(R.id.textView5);

        textViewCountProfile = (TextView)findViewById(R.id.textView6);

        backButton = (Button)findViewById(R.id.button3);

        textViewFirstName.setText(getIntent().getStringExtra("editFirstName"));
        textViewLastName.setText(getIntent().getStringExtra("editLastName"));
        textViewDepartment.setText("-");

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Profile.this, MainActivity.class);
            }
        });

        //String stringCountProfile = Integer.toString(countProfile);
        //textViewCountProfile.setText("Number of calls Profile: "+stringCountProfile);


    }


}
