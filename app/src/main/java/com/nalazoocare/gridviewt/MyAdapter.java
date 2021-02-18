package com.nalazoocare.gridviewt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-04-21
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private int img[];
    private LayoutInflater inf;

    public MyAdapter(Context context, int layout, int[] img) {
        this.context = context;
        this.layout = layout;
        this.img = img;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return img[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = inf.inflate(layout, null);
            ImageView iv = convertView.findViewById(R.id.imageView1);
            iv.setImageResource(img[position]);
        }
        return convertView;
    }
}
