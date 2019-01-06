package arisyrifki.app.ensiklopediahewan.Holder;

import android.media.Image;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class ModelHewan implements Serializable {
    public String hewanTitle, hewanSubtitle;
    public int hewanImg;

    public String getHewanTitle() {
        return hewanTitle;
    }

    public String getHewanSubtitle() {
        return hewanSubtitle;
    }

    public int getHewanImg() {
        return hewanImg;
    }

    public ModelHewan(String hewanTitle, String hewanSubtitle, int hewanImg) {
        this.hewanTitle = hewanTitle;
        this.hewanSubtitle = hewanSubtitle;
        this.hewanImg = hewanImg;
    }
}

