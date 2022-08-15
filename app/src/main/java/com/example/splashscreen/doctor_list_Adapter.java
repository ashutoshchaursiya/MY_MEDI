package com.example.splashscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class doctor_list_Adapter extends BaseAdapter {

    Context context;
    String listDoctor[];
    int listImages[];
    LayoutInflater inflater;

    public doctor_list_Adapter(Context context, String[] listDoctor, int[] listImages) {
        this.context = context;
        this.listDoctor = listDoctor;
        this.listImages = listImages;
    }
    @Override
    public int getCount() {
        return listDoctor.length;
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
        convertView = inflater.inflate(R.layout.doctor_listview_layout,null);
        TextView txtView = (TextView) convertView.findViewById(R.id.name_doctor);
        ImageView medicineImg = (ImageView) convertView.findViewById(R.id.image_doctor);
        txtView.setText(listDoctor[position]);
        medicineImg.setImageResource(listImages[position]);
        return convertView;
    }
}
