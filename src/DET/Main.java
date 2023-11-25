package DET;

public class Main {
    public static void main(String[] args) {
        TitledWindow titledWindow = new TitledWindow(800, 600, "My Titled Window", 80);

        System.out.println("Window Size: " + titledWindow.getWidth() + "x" + titledWindow.getHeight());
        System.out.println("Title: " + titledWindow.getText());
        System.out.println("Title Bar Height: " + titledWindow.getTitleBarHeight());
    }
}
