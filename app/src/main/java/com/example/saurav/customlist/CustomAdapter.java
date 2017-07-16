package com.example.saurav.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Saurav on 11/07/17.
 */

class CustomAdapter extends BaseAdapter{

    Context context;
    ArrayList<CustomHandler> data;
    LayoutInflater inflator;

    public CustomAdapter(Context context, ArrayList<CustomHandler> data){

        this.context = context;
        this.data = data;
        this.inflator = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public class Holder{

        TextView text1, text2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;

        rowView = inflator.inflate(R.layout.custom_row, null);
        holder.text1 = (TextView) rowView.findViewById(R.id.text1);
        holder.text2 = (TextView) rowView.findViewById(R.id.text2);


        holder.text1.setText(data.get(position).getName());
        holder.text2.setText(data.get(position).getDescription());

        return rowView;
    }
}
