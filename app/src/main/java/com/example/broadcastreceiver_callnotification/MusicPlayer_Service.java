package com.example.broadcastreceiver_callnotification;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MusicPlayer_Service extends Service
{
    //Creating the Object of MediaPlayer
    MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand(Intent intent, int flags, int startId) {

        player = MediaPlayer.create(MusicPlayer_Service.this, Settings.System.DEFAULT_RINGTONE_URI);

        player.setLooping(true);

        player.start();

        return START_STICKY;//Service will be recreated when it has killed by OS due to Insufficient Memory
    }
    public void onDestroy() {
        //Stop player
        player.stop();
    }
}
