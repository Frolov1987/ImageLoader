package app.media;

public class PngViewer implements AdvancedImageViewer {
    @Override
    public void viewPng(String fileName) {
        System.out.println("Viewing png file: "+ fileName);
    }

    @Override
    public void viewJpg(String fileName) {

    }
}