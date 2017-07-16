package com.example.saurav.customlist;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    String[] name = new String[]{"Abhi", "Ashwini", "Rahul", "Shweta", "Anmol", "Prithvi", "Saurav", "Aachal", "Neha"};
    String[] phone = new String[]{"9876545633", "987652323", "9873654682", "7111109981", "78797778901", "7652340981", "07554098789", "07514449089", "8989009090"};

    ArrayList<CustomHandler> model = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list);

        for(int i =0;i<name.length;i++)
        {
            CustomHandler handler = new CustomHandler();
            handler.setName(name[i]);
            handler.setDescription(phone[i]);
            model.add(handler);
        }

        CustomAdapter adapter = new CustomAdapter(this,model);
        list.setAdapter(adapter);
    }

}
