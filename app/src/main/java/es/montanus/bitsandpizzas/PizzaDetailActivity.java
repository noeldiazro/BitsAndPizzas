package es.montanus.bitsandpizzas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZA_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        Intent intent = getIntent();
        int position = intent.getIntExtra(PizzaDetailActivity.EXTRA_PIZZA_ID, -1);

        TextView nameView = findViewById(R.id.pizza_name);
        final Pizza pizza = Pizza.pizzas[position];
        nameView.setText(pizza.getName());
        ImageView imageView = findViewById(R.id.pizza_image);
        imageView.setImageResource(pizza.getImageResourceId());
        imageView.setContentDescription(pizza.getName());
    }
}
