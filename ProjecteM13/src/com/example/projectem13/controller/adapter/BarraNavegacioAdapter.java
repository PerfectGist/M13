package com.example.projectem13.controller.adapter;

import java.util.Collections;

import com.example.projectem13.R;
import com.example.projectem13.R.layout;
import com.example.projectem13.model.bussines.ItemDesplegable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
 
import java.util.Collections;
import java.util.List;

public class BarraNavegacioAdapter extends RecyclerView.Adapter<BarraNavegacioAdapter.MyViewHolder> {
    List<ItemDesplegable> data = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;
 
    public BarraNavegacioAdapter(Context context, List<ItemDesplegable> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }
 
    public void delete(int position) {
        data.remove(position);
        notifyItemRemoved(position);
    }
 
    
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_desplegable, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }
 
    /** Agafa l'item del drawer que hem seleccionat i ens retorna quin és per a assignar-li el titol **/
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ItemDesplegable current = data.get(position);
        holder.title.setText(current.getTitol());
    }
 
    @Override
    public int getItemCount() {
        return data.size();
    }
 
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
 
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
