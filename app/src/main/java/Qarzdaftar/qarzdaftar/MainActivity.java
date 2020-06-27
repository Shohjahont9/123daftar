package Qarzdaftar.qarzdaftar;

import Qarzdaftar.qarzdaftar.Registratsiya.LogInActivity;
import Qarzdaftar.qarzdaftar.Registratsiya.Registratsiya1Activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Royhatdan_otish(View view) {
        Intent i = new Intent(MainActivity.this, Registratsiya1Activity.class);
        startActivity(i);
    }

    public void logIn(View view) {
        Intent i = new Intent(MainActivity.this, LogInActivity.class);
        startActivity(i);
    }
}
