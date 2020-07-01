package Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import Qarzdaftar.qarzdaftar.R;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

public class ayiriboshlash extends Fragment {
    TabLayout   tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem tabnarsa_berish, tabnarsa_olish, tabayir_tarixi;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       return inflater.inflate(R.layout.ayiriboshlash, container, false);
//        tabLayout =v.findViewById(R.id.tab_layout);
//        tabnarsa_olish = v.findViewById(R.id.narsa_olish_tabLayout);
//        tabnarsa_berish = v.findViewById(R.id.narsa_berish_tabLayout);
//        tabayir_tarixi = v.findViewById(R.id.ayiriboshlash_tarixi_tabLayout);
//        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(pageAdapter);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        return  v;
//
//
//    }
    }
}