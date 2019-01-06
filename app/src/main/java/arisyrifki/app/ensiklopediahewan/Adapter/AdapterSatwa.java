package arisyrifki.app.ensiklopediahewan.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.ensiklopediahewan.Holder.HolderSatwa;
import arisyrifki.app.ensiklopediahewan.Model.ModelSatwa;
import arisyrifki.app.ensiklopediahewan.R;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class AdapterSatwa extends RecyclerView.Adapter<HolderSatwa> {

    private List<ModelSatwa> satwa = new ArrayList<>();

    public AdapterSatwa(List<ModelSatwa> satwa) {
        this.satwa = satwa;
    }

    @Override
    public HolderSatwa onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_satwa,parent,false);
        final HolderSatwa holderSatwa = new HolderSatwa(itemView);



        return holderSatwa;
    }

    @Override
    public void onBindViewHolder(HolderSatwa holder, int position) {
        holder.hewanTitle.setText(satwa.get(position).getHewanTitle());
        holder.hewanSubtitle.setText(satwa.get(position).getHewanSubtitle());
    }

    @Override
    public int getItemCount() {
        return satwa.size();
    }
}
