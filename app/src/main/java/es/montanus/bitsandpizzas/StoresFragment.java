package es.montanus.bitsandpizzas;

import android.support.annotation.ArrayRes;

public class StoresFragment extends CategoryFragment {
    @Override
    protected @ArrayRes int getStringArrayId() {
        return R.array.stores;
    }
}
