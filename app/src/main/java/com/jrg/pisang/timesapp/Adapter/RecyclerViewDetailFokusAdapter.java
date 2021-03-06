package com.jrg.pisang.timesapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jrg.pisang.timesapp.R;

import java.util.List;

public class RecyclerViewDetailFokusAdapter extends RecyclerView.Adapter<RecyclerViewDetailFokusAdapter.MyViewHolder> {

    private List<String> data;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public RecyclerViewDetailFokusAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_news_popular, parent, false);
        return new MyViewHolder(view, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewDetailFokusAdapter.MyViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title, news_datepub;
        ImageView imageView;
        RecyclerViewDetailFokusAdapter.OnItemClickListener onItemClickListener;

        public MyViewHolder(@NonNull View itemView, RecyclerViewDetailFokusAdapter.OnItemClickListener onItemClickListener) {
            super(itemView);

            itemView.setOnClickListener(this);

            title = itemView.findViewById(R.id.textViewTitle);
            news_datepub = itemView.findViewById(R.id.textViewDate);
            imageView = itemView.findViewById(R.id.imageViewNews);

            this.onItemClickListener = onItemClickListener;
        }

        @Override
        public void onClick(View v) {
            onItemClickListener.onItemClick(v, getAdapterPosition());
        }
    }
}
