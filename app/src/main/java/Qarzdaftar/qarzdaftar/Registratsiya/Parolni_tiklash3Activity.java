package Qarzdaftar.qarzdaftar.Registratsiya;

import Qarzdaftar.qarzdaftar.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parolni_tiklash3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parolni_tiklash3);

    }









    public void next1(View view) {
        Intent i = new Intent(Parolni_tiklash3Activity.this, LogInActivity.class);
        startActivity(i);
    }
}
