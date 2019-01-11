package arisyrifki.app.ensiklopediahewan.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class ModelFun implements Serializable{
    public String funTitle, funSubtitle, funSubtitle2;
    public int img1, img2;

    public String getFunTitle() {
        return funTitle;
    }

    public String getFunSubtitle() {
        return funSubtitle;
    }

    public String getFunSubtitle2() {
        return funSubtitle2;
    }

    public int getImg1() {
        return img1;
    }

    public int getImg2() {
        return img2;
    }

    public ModelFun(String funTitle, String funSubtitle, String funSubtitle2, int img1, int img2) {
        this.funTitle = funTitle;
        this.funSubtitle = funSubtitle;
        this.funSubtitle2 = funSubtitle2;
        this.img1 = img1;
        this.img2 = img2;
    }
}
