package app.viewers;

public class ViewImage implements ImageViewer {
    ImageAdapter imageAdapter;

    @Override
    public void view(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("jpg")) {
            System.out.println("Viewing jpg file: " + fileName);
        }

        else if (imageType.equalsIgnoreCase("png")

        ) {
            imageAdapter = new ImageAdapter(imageType);
            imageAdapter.view(imageType, fileName);
        } else {
            System.out.println("Invalid file type. " + imageType + " format not supported");
        }
    }
}
