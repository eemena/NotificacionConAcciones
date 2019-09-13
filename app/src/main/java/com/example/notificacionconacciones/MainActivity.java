package com.example.notificacionconacciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
int ID =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notificar(View view){

        Intent i = new Intent(MainActivity.this,Activity2.class);
        i.putExtra("NotificationID", ID);

        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,i,0);
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Uri sonido = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Notification n = new NotificationCompat.Builder(MainActivity.this)
                .setContentIntent(pendingIntent)
                .setTicker("Click Aqui")
                .setContentTitle("Notificacion nueva")
                .setContentText("Contenido que presentara la notificacion creada")
                .setSubText("Subtexxxxxxxxxxxxxxxxxxxxxxxxto")
                .setSmallIcon(R.mipmap.ic_launcher)
                .addAction(R.mipmap.ic_launcher,"Click aca", pendingIntent)
                .addAction(android.R.drawable.ic_menu_share,"Compartir", pendingIntent)
                .setVibrate(new long [] {1000,500,1000,1000})
                .setPriority(Notification.PRIORITY_MAX)
                .setSound(sonido)
                .setLights(Color.BLUE,1,0)
                .build();

        nm.notify(ID,n);


    }
}
