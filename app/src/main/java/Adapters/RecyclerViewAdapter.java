package Adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adoptionanimauxapplication.R;

import Models.Animal;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private List<Animal> dataModelList;

    public RecyclerViewAdapter(List<Animal> dataModelList){
        this.dataModelList = dataModelList;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_animaux, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        //holder.imageViewAnimal.set;
        holder.imageViewAnimal.setImageResource(itemsData[position].getImageUrl());
        holder.textViewNameAnimal.setText(dataModelList.get(position).get_nom());
        holder.textViewEspeceAnimal.setText(String.valueOf(dataModelList.get(position).get_espece()));
        holder.textViewStatusAnimal.setText(String.valueOf(dataModelList.get(position).get_status()));
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public long getItemId(int position){
        return super.getItemId(position);
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageViewAnimal;
        TextView textViewNameAnimal, textViewEspeceAnimal, textViewStatusAnimal;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewAnimal = itemView.findViewById(R.id.imageView);
            textViewNameAnimal = itemView.findViewById(R.id.txtNom);
            textViewEspeceAnimal = itemView.findViewById(R.id.txtEspece);
            textViewStatusAnimal = itemView.findViewById(R.id.txtStatus);
        }
    }
}
