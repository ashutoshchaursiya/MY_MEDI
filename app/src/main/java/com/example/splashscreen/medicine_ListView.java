package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class medicine_ListView extends AppCompatActivity {

    String medicineList[] = {"medicine_1", "medicine_2", "medicine_3", "medicine_4", "medicine_6",
            "medicine_7","medicine_8","medicine_9","medicine_10"};
    int medicineImages[] ={R.drawable.antibiotico, R.drawable.antibiotico, R.drawable.antibiotico, R.drawable.antibiotico, R.drawable.antibiotico,
            R.drawable.antibiotico, R.drawable.antibiotico, R.drawable.antibiotico, R.drawable.antibiotico, R.drawable.antibiotico};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_list_view);
        listView =(ListView) findViewById(R.id.medicine_list_view);
        medicine_list_Adapter medicineListAdapter = new medicine_list_Adapter(getApplicationContext(),medicineList,medicineImages);
        listView.setAdapter(medicineListAdapter);
//        listView.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//                Log.i("medicine_ListView","Item is clicked @ Position ::  "+position);
//            }
//        });
    }
}