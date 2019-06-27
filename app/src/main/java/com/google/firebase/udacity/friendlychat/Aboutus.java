package com.google.firebase.udacity.friendlychat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        textView=(TextView)findViewById(R.id.aboutUs);

        String about="This is a Friendly Chat App for Communicating with Group of Friends safely and Secretly\n\n" +
                "This App help people to making connected with each other\n\n" +
                "This app Built with java and FireBase DataBase";

        textView.setText(about);
    }
}
