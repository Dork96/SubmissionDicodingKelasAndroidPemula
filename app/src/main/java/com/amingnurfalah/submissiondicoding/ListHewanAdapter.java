package com.amingnurfalah.submissiondicoding;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHewanAdapter extends RecyclerView.Adapter<ListHewanAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Animal> listAnimal;

    private ArrayList<Animal> getListAnimal(){ return listAnimal; }

    public void setList(ArrayList<Animal> listAnimal){
       this.listAnimal = listAnimal;
    }
    ListHewanAdapter(Context context){ this.context = context; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row_animal, viewGroup, false);

        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
       final Animal animal = getListAnimal().get(position);

       final String namaAnimal = animal.getName();
       final String detailAnimal = animal.getDetail();
       final String photoAnimal = animal.getPhoto();

        Glide.with(holder.itemView.getContext()).load(animal.getPhoto()).apply(new RequestOptions().override(55,55)).into(holder.imgPhoto);

        holder.tvName.setText(animal.getName());
        holder.tvDetail.setText(animal.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listAnimal.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
          Intent detail = new Intent(context, FormDetail.class);
           detail.putExtra("NAME", namaAnimal );
           detail.putExtra("DETAIL" , detailAnimal);
           detail.putExtra(FormDetail.EXTRA_PHOTO, photoAnimal);
            context.startActivity(detail);

            }
        });

    }
    @Override
    public int getItemCount() {
        return getListAnimal().size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvDetail;

        ListViewHolder(View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_from);
        }
    }
}

