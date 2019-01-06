package arisyrifki.app.ensiklopediahewan.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class ModelFun implements Serializable{
    public String funTitle, funSubtitle;

    public String getFunTitle() {
        return funTitle;
    }

    public String getFunSubtitle() {
        return funSubtitle;
    }

    public ModelFun(String funTitle, String funSubtitle) {

        this.funTitle = funTitle;
        this.funSubtitle = funSubtitle;
    }
}
