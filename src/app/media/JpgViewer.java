package app.media;

public class JpgViewer implements AdvancedImageViewer {
    @Override
    public void viewJpg(String fileName) {
        System.out.println("Viewing jpg file: " + fileName);
    }

    @Override
    public void viewPng(String fileName) {

    }
}