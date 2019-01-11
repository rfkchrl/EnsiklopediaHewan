package arisyrifki.app.ensiklopediahewan.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import arisyrifki.app.ensiklopediahewan.R;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class HolderFun extends RecyclerView.ViewHolder {

    public TextView funTitle, funSubtitle, funSubtitle2;
    public ImageView img1, img2;


    public HolderFun(View itemView) {
        super(itemView);

        funTitle = (TextView) itemView.findViewById(R.id.fun_title);
        funSubtitle = (TextView) itemView.findViewById(R.id.fun_subtitle);
        funSubtitle2 = (TextView) itemView.findViewById(R.id.fun_subtitle2);

        img1 = (ImageView) itemView.findViewById(R.id.img_fun);
        img2 = (ImageView) itemView.findViewById(R.id.img_fun2);

    }
}
