package Qarzdaftar.qarzdaftar.Registratsiya;

import Qarzdaftar.qarzdaftar.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registratsiya3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registratsiya3);
    }

    public void next2(View view) {
        Intent i = new Intent(Registratsiya3Activity.this, Registratsiya4Activity.class);
        startActivity(i);
    }
}
