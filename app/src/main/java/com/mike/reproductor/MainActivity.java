package com.mike.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.borutsky.neumorphism.NeumorphicFrameLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /*private NeumorphicFrameLayout btn;
    private NeumorphicFrameLayout btn2;
    private NeumorphicFrameLayout btn3;
    private ImageButton btnlike ;
    private ImageButton btnadd ;
    private ImageButton btnshufle ; */
    ListView listSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album);

        listSong = findViewById(R.id.listView_canciones);

        ArrayList<Song> lista = new ArrayList<>();
        lista.add(new Song(R.drawable.item1, "Imperium", "Ghost"));
        lista.add(new Song(R.drawable.item1, "Kaisarion", "Ghost"));
        lista.add(new Song(R.drawable.item1, "Spillways", "Ghost"));
        lista.add(new Song(R.drawable.item1, "Call Me Little Sunshine", "Ghost"));
        lista.add(new Song(R.drawable.item1, "Hunter's Moon", "Ghost"));
        lista.add(new Song(R.drawable.item1, "Watcher in the Sky", "Ghost"));
        lista.add(new Song(R.drawable.item1, "Dominion", "Ghost"));
        lista.add(new Song(R.drawable.item1, "Twenties", "Ghost"));


        SongAdapter songAdapter = new SongAdapter(this, R.layout.song_list, lista);
        listSong.setAdapter(songAdapter);



        /*FragmentoMiniReproductor f = new FragmentoMiniReproductor();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame, f, "");
        ft.commit();*/



        /*  Music Player

        ImageButton btnpress = findViewById(R.id.imageBtn_play);
        ImageButton btnnext = findViewById(R.id.imageBtn_next);
        ImageButton btnprev = findViewById(R.id.imageBtn_prev);



        btn = findViewById(R.id.flat_play);
        btn2 = findViewById(R.id.flat_prev);
        btn3 = findViewById(R.id.flat_next);
        btnlike = findViewById(R.id.imageBtnLike);
        btnadd = findViewById(R.id.imageBtnAdd);
        btnshufle = findViewById(R.id.imageBtnShuffle);




        ButtonHandler blistener = new ButtonHandler();

        btnpress.setOnClickListener(blistener);
        btnnext.setOnClickListener(blistener);
        btnprev.setOnClickListener(blistener);

        btnlike.setOnClickListener(blistener);
        btnadd.setOnClickListener(blistener);
        btnshufle.setOnClickListener(blistener);

    }
    private class  ButtonHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.imageBtn_play:
                    btnPresionado("play", btn);
                    break;
                case R.id.imageBtn_next:
                    btnPresionado("next", btn3);
                    break;
                case R.id.imageBtn_prev:
                    btnPresionado("prev", btn2);
                    break;
                case R.id.imageBtnAdd:
                    iconoPresionado("add", btnadd);
                    break;
                case R.id.imageBtnShuffle:
                    iconoPresionado("shuffle",btnshufle);
                    break;
                case R.id.imageBtnLike:
                    iconoPresionado("like",btnlike);
                    break;
                default:
                    btnPresionado("Error",btn);
            }
        }
    }

    void iconoPresionado(String s, ImageButton btn) {

        btn.setImageTintList(ColorStateList.valueOf(Color.argb(100,78, 125, 237)));
        Toast.makeText(MainActivity.this, "Boton " + s + " pulsado", Toast.LENGTH_SHORT).show();

    }





    void btnPresionado(String s,NeumorphicFrameLayout btn) {

        btn.setState( NeumorphicFrameLayout.State.PRESSED);
        Toast.makeText(MainActivity.this, "Boton " + s + " pulsado", Toast.LENGTH_SHORT).show();

        final long changeTime = 100L;
        btn.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn.setState( NeumorphicFrameLayout.State.FLAT);
            }
        }, changeTime);

    } */
    }
}