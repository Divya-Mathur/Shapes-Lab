
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draw my picture
        Circle veryouterCircle = new Circle("black", 400, 200, 200);
        veryouterCircle.makeVisible();
        Circle innerCircle = new Circle("blue", 300, 250, 250);
        innerCircle.makeVisible();
        Circle secondCircle = new Circle("red", 200, 300, 300);
        secondCircle.makeVisible();
        Circle outerCircle = new Circle("yellow", 100, 350, 350);
        outerCircle.makeVisible();
        // YAAAAAAAAAAAAAAAAAAY


        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "Bruh.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}