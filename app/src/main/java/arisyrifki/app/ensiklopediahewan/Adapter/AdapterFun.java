package arisyrifki.app.ensiklopediahewan.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.ensiklopediahewan.FunDetail;
import arisyrifki.app.ensiklopediahewan.Holder.HolderFun;
import arisyrifki.app.ensiklopediahewan.Model.ModelFun;
import arisyrifki.app.ensiklopediahewan.R;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class AdapterFun extends RecyclerView.Adapter<HolderFun> {

    private List<ModelFun> fun = new ArrayList<>();

    public AdapterFun(List<ModelFun> fun) {
        this.fun = fun;
    }

    @Override
    public HolderFun onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fun,parent,false);
        final HolderFun holderFun = new HolderFun(itemView);

        holderFun.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holderFun.getAdapterPosition();
                Intent intent = new Intent(holderFun.itemView.getContext(), FunDetail.class);
                intent.putExtra("id_Fun", fun.get(position));
                holderFun.itemView.getContext().startActivity(intent);

            }
        });

        return holderFun;
    }

    @Override
    public void onBindViewHolder(HolderFun holder, int position) {
        holder.funTitle.setText( fun.get(position).getFunTitle());
        holder.funSubtitle.setText( fun.get(position).getFunSubtitle());
    }


    @Override
    public int getItemCount() {
        return fun.size();
    }
}
