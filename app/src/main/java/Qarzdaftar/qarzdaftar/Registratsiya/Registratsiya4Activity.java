package Qarzdaftar.qarzdaftar.Registratsiya;

import Qarzdaftar.qarzdaftar.Asosiy.AsosiyActivity;
import Qarzdaftar.qarzdaftar.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registratsiya4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registratsiya4);
    }

    public void next3(View view) {
        Intent i = new Intent(Registratsiya4Activity.this, AsosiyActivity.class);
        startActivity(i);
    }
}
