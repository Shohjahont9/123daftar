package Qarzdaftar.qarzdaftar.Asosiy;

import Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash.narsa_olish_fragment;
import Qarzdaftar.qarzdaftar.Asosiy.Profilim.profilim_fragment;
import Qarzdaftar.qarzdaftar.Asosiy.Savdo_sotiqlar.sotib_olish;
import Qarzdaftar.qarzdaftar.Asosiy.Qarzlar.qarz_berish_fragment;
import Qarzdaftar.qarzdaftar.Asosiy.Suhbatlar.suhbatlar_fragment;
import Qarzdaftar.qarzdaftar.R;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class AsosiyActivity extends AppCompatActivity    implements NavigationView.OnNavigationItemSelectedListener  {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    ActionBarDrawerToggle mDrawerToggle;
    private NavigationView navigationView;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asosiy);



        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar123);

        setSupportActionBar(toolbar);




        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.qarzlar_menu);





        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavigationMethod);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new narsa_olish_fragment()).commit();

    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.qarzlar_menu: break;
            case R.id.ayiriboshlash_menu:
                break;
            case R.id.share:
                Toast.makeText(this,"Share", Toast.LENGTH_SHORT).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }



    private final BottomNavigationView.OnNavigationItemSelectedListener bottomNavigationMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;
            switch (menuItem.getItemId()) {
                case R.id.ayiriboshlash_bottom:
                    fragment = new narsa_olish_fragment();
                    break;
                case R.id.suhbatlar_bottom:
                    fragment = new suhbatlar_fragment();
                    break;
                case R.id.qarzlar_bottom:
                    fragment = new qarz_berish_fragment();
                    break;
                case R.id.savdo_sotiq_bottom:
                    fragment = new sotib_olish();
                    break;
                case R.id.profilim_bottom:
                    fragment = new profilim_fragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, fragment).commit();

            return true;
        }
    };

}
