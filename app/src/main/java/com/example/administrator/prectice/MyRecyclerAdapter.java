package com.example.administrator.prectice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andview.refreshview.recyclerview.BaseRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/29 0029.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    Context context;
    List<Person> list;
    LayoutInflater inflater;
    public MyRecyclerAdapter(Context context, List<Person> list){
      this.list=list;
      this.context=context;
      inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = inflater.inflate(R.layout.item_recyclerview_main, null, false);

        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.age.setText(list.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class  MyViewHolder extends RecyclerView.ViewHolder{
         public TextView name;
         public TextView age;

        public MyViewHolder(View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.name);
            age=(TextView)itemView.findViewById(R.id.age);
        }
    }
    //加载更多
    public void addData(List<Person> list){
        this.list=list;
        this.notifyDataSetChanged();
    }

}
