package com.example.customview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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
        Button areaview = (Button)convertView.findViewById(R.id.area_view);


        ameriTitle.setText(datas.get(position).getCoffeee());
        coffeeImg.setImageDrawable(datas.get(position).getCoffeeImgId());
        final String str =ameriTitle.getText().toString();
        areaview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), googlemap.class);
                intent.putExtra("area_name", str );
                context.startActivity(intent);

            }
        });


        return convertView;
    }

}