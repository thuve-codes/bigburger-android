package com.thuve.bigburger;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class itemsAdapter extends RecyclerView.Adapter <itemsAdapter.itemViewHolder> {
    private ArrayList<itemrecycle> myitems;
    public static class itemViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageview;



        public itemViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview=itemView.findViewById(R.id.imgitem);
        }
    }


    public itemsAdapter(ArrayList<itemrecycle> item) {
        myitems=item;
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
    itemViewHolder itemviewHolder=new itemViewHolder(view);
    return itemviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        itemrecycle currentitem=myitems.get(position);
        holder.imageview.setImageResource(currentitem.getImagesource());


    }

    @Override
    public int getItemCount() {
        return myitems.size();
    }


}
