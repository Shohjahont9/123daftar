package Qarzdaftar.qarzdaftar.Registratsiya;

import Qarzdaftar.qarzdaftar.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parolni_tiklashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parolni_tiklash);
    }

    public void next2(View view) {
        Intent i = new Intent(Parolni_tiklashActivity.this, Parolni_tiklash2Activity.class);
        startActivity(i);
    }
}
