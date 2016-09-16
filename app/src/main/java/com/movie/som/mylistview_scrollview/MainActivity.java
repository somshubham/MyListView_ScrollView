package com.movie.som.mylistview_scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private String listview_array[] = { "ONE", "TWO", "THREE", "FOUR", "FIVE",
            "SIX", "SEVEN", "EIGHT", "NINE", "TEN" };
    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,android.
                R.layout.simple_list_item_1, listview_array);
        myList.setAdapter(adapter);
        //myList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listview_array));
        Helper.getListViewSize(myList);



        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String s=""+adapter.getItem(position);
                Log.v("youtube",""+s);
            }
        });



    }
}
