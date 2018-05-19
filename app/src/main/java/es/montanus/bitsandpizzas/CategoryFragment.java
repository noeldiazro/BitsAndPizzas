package es.montanus.bitsandpizzas;

import android.os.Bundle;
import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public abstract class CategoryFragment extends ListFragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListAdapter adapter = new ArrayAdapter<String>(inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(getStringArrayId())
        );
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected abstract @ArrayRes int getStringArrayId();
}
