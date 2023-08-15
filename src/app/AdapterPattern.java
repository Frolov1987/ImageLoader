package app;

import app.viewers.ViewImage;

public class AdapterPattern {

    public static void main(String[] args) {
        ViewImage viewImage = new ViewImage();
        viewImage.view("jpg","space.jpg");
        viewImage.view("png","tree.png");
        viewImage.view("gif","fanny.gif");
    }
}
