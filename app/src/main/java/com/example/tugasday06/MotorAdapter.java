package com.example.tugasday06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MotorAdapter extends RecyclerView.Adapter<MotorAdapter.ViewHolder> {

    private final ArrayList<MotorModel> motorModel;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public MotorAdapter(ArrayList<MotorModel> motorModel) {
        this.motorModel = motorModel;
    }

    @NonNull
    @Override
    public MotorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MotorAdapter.ViewHolder holder, int position) {
        holder.namaItem.setText(motorModel.get(position).getNamaItem());
        holder.deskripsiItem.setText(motorModel.get(position).getDeskripsiItem());
        holder.hargaitem.setText(motorModel.get(position).getHargaItem());
        holder.logoMotor.setImageResource(motorModel.get(position).getLogoMotor());
    }

    @Override
    public int getItemCount() {
        return motorModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaItem, deskripsiItem, hargaitem;
        ImageView logoMotor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaItem = itemView.findViewById(R.id.nama_item);
            deskripsiItem = itemView.findViewById(R.id.des_item);
            hargaitem = itemView.findViewById(R.id.harga_item);
            logoMotor = itemView.findViewById(R.id.logo_motor);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && mListener != null) {
                        mListener.onItemClick(position);
                    }
                }
            });
        }
    }
}
