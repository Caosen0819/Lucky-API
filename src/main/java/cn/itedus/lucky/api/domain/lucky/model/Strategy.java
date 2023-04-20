package cn.itedus.lucky.api.domain.lucky.model;

/**
 * @description: 策略
 * @author: Lucky
 * @date: 2021/12/25
 * @github: Lucky
 * @Copyright: Lucky
 */
public class Strategy {

    private String text;
    private String top;

    public Strategy(String text, String top) {
        this.text = text;
        this.top = top;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

}
