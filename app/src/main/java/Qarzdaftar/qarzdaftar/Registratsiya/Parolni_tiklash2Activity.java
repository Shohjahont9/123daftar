package Qarzdaftar.qarzdaftar.Registratsiya;

import Qarzdaftar.qarzdaftar.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parolni_tiklash2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parolni_tiklash2);
    }

    public void next3(View view) {
        Intent i = new Intent(Parolni_tiklash2Activity.this, Parolni_tiklash3Activity.class);
        startActivity(i);
    }
}
