package xyz.glorin.queuedworkhack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import xyz.glorin.queuedworkhacklib.QueuedWorkHack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QueuedWorkHack.hack();
    }
}