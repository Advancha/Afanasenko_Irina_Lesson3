package com.example.afanasenko.lesson3;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DataAdapter extends ArrayAdapter<String> {

    private final static String[] mContacts;
    static {
        mContacts=new String[30];
        for (int i=0; i<30; i++) {
            mContacts[i]= "Some app"; //Integer.toString(i);
        }
    }
    Context mContext;

    // Конструктор
    public DataAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId, mContacts);
        // TODO Auto-generated constructor stub
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        TextView label = (TextView) convertView;
        if (convertView == null) {
            convertView = new TextView(mContext);
            label = (TextView) convertView;
        }
        label.setText(mContacts[position]);
        label.setBackgroundColor(Color.WHITE);
        label.setTextColor(Color.DKGRAY);
        label.setGravity(Gravity.CENTER);
        label.setPadding(25,50,25,50);

        return (convertView);
    }

}