package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class doctor_ListView extends AppCompatActivity {
    String doctorList[] = {"Doctor_1", "Doctor_2", "Doctor_3", "Doctor_4", "Doctor_5","Doctor_6",
            "Doctor_7","Doctor_8","Doctor_9","Doctor_10"};
    int doctorImages[] ={R.drawable.doctor, R.drawable.doctor, R.drawable.doctor, R.drawable.doctor,
            R.drawable.doctor, R.drawable.doctor, R.drawable.doctor, R.drawable.doctor, R.drawable.doctor,
            R.drawable.doctor, };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list_view);
        listView =(ListView) findViewById(R.id.doctor_list_view);
        medicine_list_Adapter medicineListAdapter = new medicine_list_Adapter(getApplicationContext(),doctorList,doctorImages);
        listView.setAdapter(medicineListAdapter);
//        listView.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//                Log.i("medicine_ListView","Item is clicked @ Position ::  "+position);
//            }
//        });
    }
}