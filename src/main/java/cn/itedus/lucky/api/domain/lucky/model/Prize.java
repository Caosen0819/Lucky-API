package cn.itedus.lucky.api.domain.lucky.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Lucky
 * @date: 2021/12/25
 * @github: Lucky
 * @Copyright: Lucky
 */
public class Prize {

    private List<Strategy> fonts = new ArrayList<>();
    private String background;

    public Prize(Strategy fonts, String background) {
        this.fonts.add(fonts);
        this.background = background;
    }

    public Prize(List<Strategy> fonts, String background) {
        this.fonts = fonts;
        this.background = background;
    }

    public List<Strategy> getFonts() {
        return fonts;
    }

    public void setFonts(List<Strategy> fonts) {
        this.fonts = fonts;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
