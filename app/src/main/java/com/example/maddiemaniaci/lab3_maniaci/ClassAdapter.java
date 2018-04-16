package com.example.maddiemaniaci.lab3_maniaci;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class ClassAdapter extends ArrayAdapter {


    public ClassAdapter(Context context, String[] classes) {
        super(context, 0, classes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final String className = (String) this.getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.class_item, parent, false);
        }
        TextView textView = convertView.findViewById(R.id.classText);
        textView.setText(className);
        final Context c = this.getContext();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, "You selected " + className + "!", Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
