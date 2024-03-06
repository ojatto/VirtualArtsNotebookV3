package com.example.thevisualartsnotebookv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    //These will hold the username and password the user enters
    private EditText enteredUsername;

    /**
     * This variable holds the password the user enters.
     */
    private EditText enteredPassword;
    /**
     * This will print error messages.
     */
    private AlertDialog inputError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}