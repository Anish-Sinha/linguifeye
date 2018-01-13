
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.github.sarxos.webcam.Webcam;

public class Capture 
{
    public static void main(String[] args) throws IOException 
	{
	    //Lists names of webcams connected to computer
	    for (Webcam w : Webcam.getWebcams()) 
	    {
            System.out.println(w.getName());
        }
	    
        Webcam webcam = Webcam.getWebcamByName("Live! Cam Sync HD VF0770 0");
        webcam.open();
        ImageIO.write(webcam.getImage(), "JPG", new File("firstCapture.jpg"));
        webcam.close();
    }
}
