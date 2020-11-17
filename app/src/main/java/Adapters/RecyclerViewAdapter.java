package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adoptionanimauxapplication.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private List<Drink> dataModelList;

    public RecyclerViewAdapter(List<Drink> dataModelList){
        this.dataModelList = dataModelList;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_drinks, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.textViewNameDrink.setText(dataModelList.get(position).get_name());
        holder.textViewSizeDrink.setText(String.valueOf(dataModelList.get(position).get_size()));
        holder.textViewPriceDrink.setText(String.valueOf(dataModelList.get(position).get_price()));
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public long getItemId(int position){
        return super.getItemId(position);
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageViewDrink;
        TextView textViewNameDrink, textViewSizeDrink, textViewPriceDrink;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewDrink = itemView.findViewById(R.id.imageDrink);
            textViewNameDrink = itemView.findViewById(R.id.textViewName);
            textViewSizeDrink = itemView.findViewById(R.id.textViewSize);
            textViewPriceDrink = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
