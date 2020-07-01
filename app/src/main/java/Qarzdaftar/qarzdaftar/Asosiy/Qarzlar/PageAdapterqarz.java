package Qarzdaftar.qarzdaftar.Asosiy.Qarzlar;

import Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash.ayiriboshlash_tarixi_fragment;
import Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash.narsa_berish_fragment;
import Qarzdaftar.qarzdaftar.Asosiy.Ayiriboshlash.narsa_olish_fragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapterqarz extends FragmentPagerAdapter {

    private int numoftabs;

    public PageAdapterqarz(FragmentManager fm, int numofTabs) {
        super(fm);
        this.numoftabs = numofTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new qarz_berish_fragment();
            case 1:
                return new qarz_olish_fragment();
            case 2:
                return new qarzlar_tarixi_fragment();

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
