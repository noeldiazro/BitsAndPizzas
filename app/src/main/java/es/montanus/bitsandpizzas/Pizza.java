package es.montanus.bitsandpizzas;

import android.support.annotation.DrawableRes;

public class Pizza {
    private final String name;
    private final int imageResourceId;

    public static final Pizza[] pizzas = {
        new Pizza("Diavolo", R.drawable.diavolo),
        new Pizza("Funghi", R.drawable.funghi)
    };

    private Pizza(String name, @DrawableRes int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
