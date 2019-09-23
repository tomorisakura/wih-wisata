package grevi.msx.wihwisata;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ListViewHolder> {

    private ArrayList<Wisata> listWisata;

    public ListViewAdapter(ArrayList<Wisata> list) {
        this.listWisata = list;
    }

    private itemCallback itemCallback;

    public void setOnItemClicked(itemCallback itemCallback) {
        this.itemCallback = itemCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_wisata, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Wisata wisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext()).load(wisata.getPicWisata()).into(holder.picWisata);
        holder.namaWisata.setText(wisata.getNama_wisata());
        holder.lokasiWisata.setText(wisata.getLokasi_wisata());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemCallback.onClickedItem(listWisata.get(holder.getAdapterPosition()));
            }
        });

        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.btnLike.setText("Like");
                holder.btnLike.setEnabled(true);

                if (holder.btnLike.isPressed()) {
                    Toast.makeText(holder.itemView.getContext(),"Menyukai " +listWisata.get(holder.getAdapterPosition()).getNama_wisata(),Toast.LENGTH_SHORT).show();
                    holder.btnLike.setText("Liked");
                } else {
                    holder.btnLike.setText("Like");
                }
            }
        });

        holder.btnWish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),listWisata.get(holder.getAdapterPosition()).getNama_wisata()+" berhasil ditambahkan",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public interface itemCallback {
        void onClickedItem(Wisata wisata);
    }

    @Override
    public int getItemCount()
    {
        return listWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView picWisata;
        TextView namaWisata,lokasiWisata;
        Button btnLike,btnWish;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            picWisata = itemView.findViewById(R.id.pic_wisata);
            namaWisata = itemView.findViewById(R.id.nama_wisata);
            lokasiWisata = itemView.findViewById(R.id.lokasi_wisata);
            btnLike = itemView.findViewById(R.id.btn_like);
            btnWish = itemView.findViewById(R.id.btn_wish);
        }
    }
}
