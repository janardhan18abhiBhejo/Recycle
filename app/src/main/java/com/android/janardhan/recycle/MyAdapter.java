package com.android.janardhan.recycle;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Gaurav1 on 3/28/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{
    private LayoutInflater inflator;
    List<Information> data_obj= Collections.emptyList();

    public MyAdapter(Context context,List<Information> data_obj)
    {
       this.inflator=LayoutInflater.from(context);
       this.data_obj=data_obj;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view=  inflator.inflate(R.layout.sinle_row,parent,false);
        MyViewHolder myholder_obj=new MyViewHolder(view);
        return myholder_obj;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information infor_obj=data_obj.get(position);
        holder.mylabel.setText(infor_obj.name);
        holder.mypic.setImageResource(infor_obj.ids);
    }


    @Override
    public int getItemCount() {
        return data_obj.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView   mylabel;
        ImageView  mypic;
        public MyViewHolder(View itemView) {
             super(itemView);
             mylabel =(TextView)itemView.findViewById(R.id.textView);
             mypic   =(ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
