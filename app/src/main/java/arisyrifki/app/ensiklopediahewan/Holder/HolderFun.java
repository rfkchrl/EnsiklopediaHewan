package arisyrifki.app.ensiklopediahewan.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import arisyrifki.app.ensiklopediahewan.R;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class HolderFun extends RecyclerView.ViewHolder {

    public TextView funTitle, funSubtitle;


    public HolderFun(View itemView) {
        super(itemView);

        funTitle = (TextView) itemView.findViewById(R.id.fun_title);
        funSubtitle = (TextView) itemView.findViewById(R.id.fun_subtitle);

    }
}
