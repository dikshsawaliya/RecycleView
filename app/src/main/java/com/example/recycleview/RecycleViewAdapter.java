package com.example.recycleview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecycleViewAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return carBrandList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView iv_carPic;
    TextView tv_carName;
    TextView tv_dateMade;


        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            iv_carPic = itemView.findViewById(R.id.iv_carbrandPicture);
            tv_carName = itemView.findViewById(R.id.tv_carbrandName);
            tv_dateMade = itemView.findViewById(R.id.tv_dateCreated);

        }
    }
}
