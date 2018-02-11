package com.split.oshaleen.split;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewListAdapter extends RecyclerView.Adapter<NewListAdapter.MyViewHolder>{
    private ShoppingList list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView item_name;

        public MyViewHolder(View view) {
            super(view);
            item_name = (TextView) view.findViewById(R.id.item);
        }
    }

    public NewListAdapter(ShoppingList list) {
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.new_list_row, parent, false);

        return new NewListAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NewListAdapter.MyViewHolder holder, int position) {
        holder.item_name.setText(this.list.getItem(position));
    }

    @Override
    public int getItemCount() {
        return list.getSize();
    }
}
