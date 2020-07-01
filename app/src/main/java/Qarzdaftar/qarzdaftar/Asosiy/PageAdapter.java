package Qarzdaftar.qarzdaftar.Asosiy;

import Qarzdaftar.qarzdaftar.Asosiy.Savdo_sotiqlar.savdo_tarixi;
import Qarzdaftar.qarzdaftar.Asosiy.Savdo_sotiqlar.sotib_olish;
import Qarzdaftar.qarzdaftar.Asosiy.Savdo_sotiqlar.sotish;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public PageAdapter( FragmentManager fm, int numofTabs) {
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
                return new savdo_tarixi();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
