package com.android.janardhan.recycle;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaurav1 on 3/28/2016.
 */
public class MainActivity extends Activity
 {
     RecyclerView mycycle;
     private MyAdapter myadpobj;
     @Override
     protected void onCreate(Bundle savedInstanceState)
     {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         mycycle=(RecyclerView)findViewById(R.id.myrecycleview);
         myadpobj=new MyAdapter(this,getData());
         mycycle.setAdapter(myadpobj);
         //mycycle.setLayoutManager(new GridLayoutManager(this, 4));
         //added new line comment by jd on 4/5/2016
         mycycle.setLayoutManager(new LinearLayoutManager(this));
     }

     public static List<Information> getData()
     {
         List<Information> mylist=new ArrayList<>();
         int[] icons={R.drawable.delivery_food,R.drawable.delivery_food,R.drawable.delivery_food,R.drawable.delivery_food,R.drawable.delivery_food,R.drawable.delivery_food,R.drawable.delivery_food,R.drawable.delivery_food};
         String[] titles={"Android","recycleview","CardView","ListView","Android","recycleview","CardView","ListView"};
         for(int i=0;i<icons.length && i< titles.length;i++)
         {
             Information new_obj=new Information();
             new_obj.ids=icons[i];
             new_obj.name=titles[i];
             mylist.add(new_obj);
         }
         return mylist;
     }
}
