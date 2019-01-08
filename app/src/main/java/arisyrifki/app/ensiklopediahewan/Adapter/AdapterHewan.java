package arisyrifki.app.ensiklopediahewan.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.ensiklopediahewan.HewanDetail;
import arisyrifki.app.ensiklopediahewan.Holder.HolderHewan;
import arisyrifki.app.ensiklopediahewan.Holder.ModelHewan;
import arisyrifki.app.ensiklopediahewan.R;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class AdapterHewan extends RecyclerView.Adapter<HolderHewan> {

    private List<ModelHewan> hewan = new ArrayList<>();


    public AdapterHewan(List<ModelHewan> hewan) {

        this.hewan = hewan;
    }

    @Override
    public HolderHewan onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hewan,parent,false);

        final HolderHewan holderHewan = new HolderHewan(itemView);

        holderHewan.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holderHewan.getAdapterPosition();
                Intent intent = new Intent(holderHewan.itemView.getContext(), HewanDetail.class);
                intent.putExtra("id_Hewan", hewan.get(position));
                holderHewan.itemView.getContext().startActivity(intent);

            }
        });

        return holderHewan;
    }

    @Override
    public void onBindViewHolder(HolderHewan holder, int position) {

        holder.hewanTitle.setText(hewan.get(position).getHewanTitle());
        holder.hewanSubtitle.setText(hewan.get(position).getHewanSubtitle());
        holder.hewanImg.setImageResource(hewan.get(position).getHewanImg());
    }

    @Override
    public int getItemCount() {
        return hewan.size();
    }
}
