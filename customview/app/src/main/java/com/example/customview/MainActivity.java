package com.example.customview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    ArrayList<CoffeeData> coffees = new ArrayList<CoffeeData>();
    ListView listView;
    TextView priceTextView;
    CoffeeDataAdapter adapter;

    private volatile static MainActivity _instance;
    public  static MainActivity inst()
    {
        if(_instance ==null)
        {
            synchronized (MainActivity.class)
            {
                if(_instance == null)
                {
                    _instance = new MainActivity();
                }
            }
        }
        return _instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _instance = this;

        listView = (ListView) findViewById(R.id.list_view1);
        priceTextView = (TextView)findViewById(R.id.order_price);
        coffees.add(new CoffeeData("아메리카노", R.drawable.ameri));
        coffees.add(new CoffeeData("바닐라라떼",R.drawable.banila));
        coffees.add(new CoffeeData("선라이즈 애플주스",R.drawable.applejuce));

        adapter = new CoffeeDataAdapter(this, 0, coffees);
        listView.setAdapter(adapter);

        Button nextBtn = (Button) findViewById(R.id.nextbutton);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                startActivity(intent);
            }
        });
    }

}