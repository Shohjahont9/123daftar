package Qarzdaftar.qarzdaftar.Registratsiya;

import Qarzdaftar.qarzdaftar.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registratsiya2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registratsiya2);
    }

    public void next1(View view) {
        Intent i = new Intent(Registratsiya2Activity.this, Registratsiya3Activity.class);
        startActivity(i);
    }
}
