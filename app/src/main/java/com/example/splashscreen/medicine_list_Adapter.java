package com.example.splashscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class medicine_list_Adapter extends BaseAdapter {

     Context context;
     String listMedicine[];
     int listImages[];
    LayoutInflater inflater;


    public medicine_list_Adapter(Context ctx, String[] medicineList, int[] images) {
        this.context = ctx;
        this.listMedicine = medicineList;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listMedicine.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.medicine_listview_layout,null);
        TextView txtView = (TextView) convertView.findViewById(R.id.name_madicine);
        ImageView medicineImg = (ImageView) convertView.findViewById(R.id.image_medicine);
        txtView.setText(listMedicine[position]);
        medicineImg.setImageResource(listImages[position]);

        return convertView;
    }
}
