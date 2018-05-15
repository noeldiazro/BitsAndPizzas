package es.montanus.bitsandpizzas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private static final String SHARE_TEXT = "Want to join me for pizza?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem shareMenuItem = menu.findItem(R.id.action_share);
        final ShareActionProvider shareActionProvider =
                (ShareActionProvider) MenuItemCompat.getActionProvider(shareMenuItem);
        shareActionProvider.setShareIntent(getIntent(SHARE_TEXT));

        return super.onCreateOptionsMenu(menu);
    }

    private Intent getIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        return intent;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_create_order) {
            startActivity(new Intent(this, OrderActivity.class));
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
