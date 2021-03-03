import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;


public class Main {
	static String[] urls;
	static BufferedImage image;
	public static void main(String[] args) throws MalformedURLException {
		int count = 0;
		String[] urls = {"https://ap.rdcpix.com/2484311338/5ac20c791405fc96bdc379d36a169af1l-m0od-w1024_h768.jpg", "https://ap.rdcpix.com/392183360/5ac20c791405fc96bdc379d36a169af1l-m1od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m3950118025od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m3671716312od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m353306170od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2460020855od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m650285137od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2319460631od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2011767637od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2781957482od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m3161462152od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m1257152087od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m3657353195od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2098954081od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2115423644od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2408183071od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2437914846od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m1415953395od-w1024_h768.jpg", "https://ap.rdcpix.com/5ac20c791405fc96bdc379d36a169af1l-m2049927616od-w1024_h768.jpg"};
		
		try {
			for (String link : urls) {
				URL url = new URL(link);	
				image = ImageIO.read(url);
				ImageIO.write(image, "png", new File(".\\"+count+".png"));
				System.out.println(count);
				count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


