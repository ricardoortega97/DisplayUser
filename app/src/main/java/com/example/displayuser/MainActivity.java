package com.example.displayuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDisplayButton();//calls the method in the main
        intiClearButton();

    }
    private void initDisplayButton(){
        Button displayButton = findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editTextName);
                TextView textDisplay = findViewById(R.id.textViewDisplay);
                String nameToDisplay = editName.getText().toString();
                Resources res = getResources(); //Ask the system for access to the values files
                String displayString = res.getString(R.string.welcome_message, nameToDisplay); //Creates the string with a message and name
                textDisplay.setText(displayString);

            }
        } );}

    private void intiClearButton(){

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textDisplay = findViewById(R.id.textViewDisplay);
                Resources res = getResources();
                String displayString = res.getString(R.string.hello);//calls the string from the resources file
                textDisplay.setText(displayString);
            }
        });
    }
}

