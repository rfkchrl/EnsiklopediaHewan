package arisyrifki.app.ensiklopediahewan.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class ModelSatwa implements Serializable{
    public String hewanTitle, hewanSubtitle;

    public String getHewanTitle() {
        return hewanTitle;
    }

    public String getHewanSubtitle() {
        return hewanSubtitle;
    }

    public ModelSatwa(String hewanTitle, String hewanSubtitle) {

        this.hewanTitle = hewanTitle;
        this.hewanSubtitle = hewanSubtitle;
    }
}
