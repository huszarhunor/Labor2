package com.example.bejelentkezes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextFistName,editTextLastName;
    Button sendButton;
    TextView textViewCountProfile;

    Intent intent;
    int countProfile=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFistName = (EditText)findViewById(R.id.editText);
        editTextLastName = (EditText)findViewById(R.id.editText2);

        sendButton = (Button)findViewById(R.id.button);

        textViewCountProfile = (TextView)findViewById(R.id.textView3);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editTextFistName.getText().toString();
                String lastName = editTextLastName.getText().toString();

                intent = new Intent(MainActivity.this, Profile.class);
                intent.putExtra("editFirstName",firstName);
                intent.putExtra("editLastName",lastName);

                Log.i("k",firstName);
                startActivity(intent);

                countProfile++;

                String stringCountProfile = Integer.toString(countProfile);
                textViewCountProfile.setText("Number of calls Profile: "+stringCountProfile);
            }
        });


    }
}
