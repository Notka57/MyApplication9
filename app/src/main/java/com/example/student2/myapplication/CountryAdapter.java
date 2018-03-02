package com.example.student2.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by student2 on 02.03.18.
 */

public class CountryAdapter extends ArrayAdapter {
    public CountryAdapter(@NonNull Context context,  @NonNull Object[] objects) {
        super(context, R.layout.country_item, objects);
    }


    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.country_item, null);
        TextView num = convertView.findViewById(R.id.country_number);
        num.setText(position + ".");
        if (position % 2  == 0) convertView.setBackgroundColor(Color.LTGRAY);

        else convertView.setBackgroundColor(Color.WHITE);

        TextView country= convertView.findViewById(R.id.country_name);
        country.setText((String)getItem(position));
        return convertView;
    }
}

