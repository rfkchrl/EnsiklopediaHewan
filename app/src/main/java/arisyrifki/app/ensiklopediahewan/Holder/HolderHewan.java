package arisyrifki.app.ensiklopediahewan.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import arisyrifki.app.ensiklopediahewan.R;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class HolderHewan extends RecyclerView.ViewHolder {

    public TextView hewanTitle, hewanSubtitle;
    public ImageView hewanImg;

    public HolderHewan(View itemView) {
        super(itemView);


        hewanTitle = (TextView) itemView.findViewById(R.id.hewan_title);
        hewanSubtitle = (TextView) itemView.findViewById(R.id.hewan_subtitle);
        hewanImg = (ImageView) itemView.findViewById(R.id.img_hewan);

    }


}
