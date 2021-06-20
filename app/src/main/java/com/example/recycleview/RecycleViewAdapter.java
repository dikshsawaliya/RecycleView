package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    List<CarBrand> carBrandList;
    Context context;

    public RecycleViewAdapter(List<CarBrand> carBrandList, Context context) {
        this.carBrandList = carBrandList;
        this.context = context;
    }

    public RecycleViewAdapter(List<CarBrand> carBrandList) {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_carbrand,parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.MyViewHolder holder, int position) {

        holder.tv_carName.setText(carBrandList.get(position).getName());
        holder.tv_dateMade.setText(String.valueOf(carBrandList.get(position).getDateOfManufacturing()));
        Glide.with(this.context).load(carBrandList.get(position).getImageURL()).into(holder.iv_carPic);
    }

    @Override
    public int getItemCount() {
        return carBrandList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView iv_carPic;
    TextView tv_carName;
    TextView tv_dateMade;


        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);
            iv_carPic = itemView.findViewById(R.id.iv_carbrandPicture);
            tv_carName = itemView.findViewById(R.id.tv_carbrandName);
            tv_dateMade = itemView.findViewById(R.id.tv_dateCreated);

        }
    }
}
