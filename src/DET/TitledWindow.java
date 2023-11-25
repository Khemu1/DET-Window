package DET;

public class TitledWindow extends Window {
    String text;
    int titleBarHeight;

    public TitledWindow(int width, int height, String text, int titleBarHeight) {
        super(width, height);
        this.text = text;
        setTitleBarHeight(titleBarHeight);
    }

    public String getText() {
        return text;
    }

    public int getTitleBarHeight() {
        return titleBarHeight;
    }

    public void setTitleBarHeight(int titleBarHeight) {
        this.titleBarHeight = Math.min(height / 2, titleBarHeight);
    }
}
