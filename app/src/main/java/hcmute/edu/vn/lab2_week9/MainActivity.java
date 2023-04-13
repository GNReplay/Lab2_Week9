package hcmute.edu.vn.lab2_week9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void openRegister(View v){
//        Intent i = new Intent(this,RegisterActivity.class);
//        startActivity(i);
//    }
//
//    public void openLogin(View v){
//        Intent i = new Intent(this,LoginActivity.class);
//        startActivity(i);
//    }

    public void play_Song(View v){
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/lab1-week9.appspot.com/o/y2mate.com%20-%20T%C3%93C%20TI%C3%8AN%20x%20TLINH%20%20LIKE%20THIS%20LIKE%20THAT%20%20OFFICIAL%20MV.mp3?alt=media&token=11b6b6fa-0fe3-435e-a1a0-73af2fe36e87");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}