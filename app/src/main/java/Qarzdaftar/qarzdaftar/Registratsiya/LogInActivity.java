package Qarzdaftar.qarzdaftar.Registratsiya;

import Qarzdaftar.qarzdaftar.Asosiy.AsosiyActivity;
import Qarzdaftar.qarzdaftar.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

    }





    public void next(View view) {
        Intent i = new Intent(LogInActivity.this, AsosiyActivity.class);
        startActivity(i);
    }

    public void parolni_unutish(View view) {
        Intent i = new Intent(LogInActivity.this, Parolni_tiklashActivity.class);
        startActivity(i);
    }
}
