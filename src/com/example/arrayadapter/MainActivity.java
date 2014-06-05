package com.example.arrayadapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView list1 = (ListView)findViewById(R.id.list1);
        
        String[] arr1 = {"Apple", "Banana", "Orange" };
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.activity_main, arr1);
        list1.setAdapter(adapter1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
