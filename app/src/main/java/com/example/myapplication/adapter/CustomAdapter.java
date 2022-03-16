package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Constant;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Constant>constantList;

    public CustomAdapter(Context context,List<Constant> constantList){
        this.context = context;
        this.constantList = constantList;
    }


    @Override
    public int getCount() {
        return constantList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);

        ImageView imageView=(ImageView)view.findViewById(R.id.thumbnail);
        TextView textView = (TextView)view.findViewById(R.id.title);

        imageView.setImageResource(constantList.get(i).getImage());
        textView.setText(constantList.get(i).getTitle());
        return view;
    }
}
