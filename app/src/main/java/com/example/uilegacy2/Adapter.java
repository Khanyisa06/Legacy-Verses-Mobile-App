package com.example.uilegacy2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private ArrayList<User> categories;

public Adapter(ArrayList<User>  categories){
    this.categories = categories;

}

public class MyViewHolder extends RecyclerView.ViewHolder{

    private TextView nameTxt;

    public MyViewHolder(final View view){
        super(view);
        nameTxt = view.findViewById(R.id.name);
    }

}

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tems, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {

    String name = categories.get(position).getCatergory();
    holder.nameTxt.setText((name));

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
