package com.e.servicesandwearables;

import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnDisplayOne;
    private Button btnDisplayTwo;
    NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplayOne = findViewById(R.id.btnDisplayOne);
        btnDisplayTwo = findViewById(R.id.btnDisplayTwo);
        notificationManagerCompat = NotificationManagerCompat.from(this);
        btnDisplayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        });
        btnDisplayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });

    }

    private void DisplayNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "channel1")
                .setSmallIcon(R.drawable.ic_child_care_black_24dp)
                .setContentTitle("first message")
                .setContentText("This is first M Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);
        notificationManagerCompat.notify(1, builder.build());
    }

    private void DisplayNotification2() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "channel2")
                .setSmallIcon(R.drawable.ic_child_care_black_24dp)
                .setContentTitle("Second message")
                .setContentText("This is second M Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);
        notificationManagerCompat.notify(2, builder.build());
    }
}
