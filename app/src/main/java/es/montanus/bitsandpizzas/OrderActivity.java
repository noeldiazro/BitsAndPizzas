package es.montanus.bitsandpizzas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        enableUpButton();
    }

    private void enableUpButton() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClickDone(View view) {
        Toast.makeText(this, "Done!", Toast.LENGTH_SHORT).show();
    }
}
