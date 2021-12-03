package com.apllication.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PendapatanAdapter extends RecyclerView.Adapter<PendapatanAdapter.ViewHolder> {
    private List<String> no, tanggal, total, metode;
    private LayoutInflater inflater;

    public PendapatanAdapter(List<String> no, List<String> tanggal, List<String> total, List<String> metode, Context context) {
        this.no = no;
        this.tanggal = tanggal;
        this.total = total;
        this.metode = metode;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nomor = no.get(position);
        String tanggal_pembayaran = tanggal.get(position);
        String total_pembayaran = total.get(position);
        String metode_pembayaran = metode.get(position);

        holder.nomer.setText(nomor);
        holder.tgl.setText(tanggal_pembayaran);
        holder.total_semua.setText(total_pembayaran);
        holder.metode_bayar.setText(metode_pembayaran);
    }

    @Override
    public int getItemCount() {
        return no.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nomer, tgl, total_semua, metode_bayar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomer = itemView.findViewById(R.id.tV_nomor);
            tgl = itemView.findViewById(R.id.tV_tanggal);
            total_semua = itemView.findViewById(R.id.tV_total_tagihan);
            metode_bayar = itemView.findViewById(R.id.tV_metode);
        }
    }
}
