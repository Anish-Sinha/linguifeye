
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.github.sarxos.webcam.Webcam;

public class Capture 
{
    public static void main(String[] args) throws IOException 
	{
	/*	Webcam.getWebcams(); */
	    //Lists names of webcams connected to computer
//	    for (Webcam w : Webcam.getWebcams()) 
//	    
//	    {
		Webcam w;
            	System.out.println(w.getName());
//	    }
	
        /*Webcam webcam = Webcam.getDefault();
        webcam.open();
        ImageIO.write(webcam.getImage(), "JPG", new File("firstCapture.jpg"));
        webcam.close();*/
    }
}
