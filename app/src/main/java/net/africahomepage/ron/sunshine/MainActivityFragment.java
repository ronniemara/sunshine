package net.africahomepage.ron.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public ArrayAdapter<String> adapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main,container);
        String[] data = new String[]{
                "Monday-Sunny-23/18",
                "Monday-Sunny-23/18",
                "Monday-Sunny-23/18",
                "Monday-Sunny-23/18",
                "Monday-Sunny-23/18"
        };

        List<String> dataArray = new ArrayList<>(
                Arrays.asList(data)
        );

        adapter = new ArrayAdapter<>(getActivity(),R.layout.list_item_forecast, R.id.list_item_forecast_textview, dataArray);
        ListView list = (ListView)root.findViewById(R.id.listview_forecast);
        list.setAdapter(adapter);
        return root;
    }
}