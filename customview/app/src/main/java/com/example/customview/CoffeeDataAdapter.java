package com.example.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoffeeDataAdapter extends ArrayAdapter<CoffeeData> {
    ArrayList<CoffeeData> datas;
    Context context;

    public CoffeeDataAdapter(@NonNull Context context, int resource, ArrayList<CoffeeData>
            datas){
        super(context, resource);
        this.context = context;
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Nullable
    @Override
    public CoffeeData getItem(int position){
        return datas.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull
            ViewGroup parent){

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.coffeelist, null,true);
        }

        TextView ameriTitle = (TextView) convertView.findViewById(R.id.ameri_title);
        ImageView coffeeImg = (ImageView) convertView.findViewById(R.id.coffee1_img);

        ameriTitle.setText(datas.get(position).getCoffeee());
        coffeeImg.setImageDrawable(datas.get(position).getCoffeeImgId());

        return convertView;
    }

}