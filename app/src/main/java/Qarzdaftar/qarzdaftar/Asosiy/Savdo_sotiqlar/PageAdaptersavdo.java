package Qarzdaftar.qarzdaftar.Asosiy.Savdo_sotiqlar;

import Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash.ayiriboshlash_tarixi_fragment;
import Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash.narsa_berish_fragment;
import Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash.narsa_olish_fragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdaptersavdo extends FragmentPagerAdapter {

    private int numoftabs;

    public PageAdaptersavdo(FragmentManager fm, int numofTabs) {
        super(fm);
        this.numoftabs = numofTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new sotib_olish();
            case 1:
                return new sotish();
            case 2:
                return new savdo_sotiq_tarixi();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

//    @Override
//    public int getItemPosition(@NonNull Object object) {
//        return POSITION_NONE;
//    }
}
