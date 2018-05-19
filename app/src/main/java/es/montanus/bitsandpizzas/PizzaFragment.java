package es.montanus.bitsandpizzas;

import android.support.annotation.ArrayRes;

public class PizzaFragment extends CategoryFragment {
    @Override
    protected @ArrayRes int getStringArrayId() {
        return R.array.pizzas;
    }
}
