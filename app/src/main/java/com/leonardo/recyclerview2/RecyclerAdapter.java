package com.leonardo.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerAdapter.NumerosViewHolder> {
    private int mNumerosItems;


    public RecyclerAdapter (int numeroDeItems){
        mNumerosItems = numeroDeItems;
    }

    class NumerosViewHolder extends RecyclerView.ViewHolder{
        TextView mTxtListaNumeros;
        public NumerosViewHolder(@NonNull View itemView) {
            super(itemView);
            mTxtListaNumeros = itemView.findViewById(R.id.textViewListaNumeros);
        }

        void bind(int listaIndex){
            mTxtListaNumeros.setText(String.valueOf(listaIndex));
        }
    }

    @NonNull
    @Override
    public NumerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        int layoutIdParaListItem = R.layout.lista_numeros_row;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        boolean attachToParentRapido = false;
        View view = inflater.inflate(layoutIdParaListItem, parent, attachToParentRapido);
        NumerosViewHolder viewHolder = new NumerosViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumerosViewHolder holder, int position) {

        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumerosItems;
    }

}
