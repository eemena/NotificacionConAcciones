package com.example.notificacionconacciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        NotificationManager nm =(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(getIntent().getExtras().getInt("NotificationID"));
    }
}
