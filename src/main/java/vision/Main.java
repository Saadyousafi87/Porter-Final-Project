package webcam;

public class Main {

	public static void main(String[] args) {
		
		ImageDetection imgDet = new ImageDetection();
		
		imgDet.DetectFace();
		
		imgDet.takeImage(imgDet.isFaceDetected());
		
		
	}

}
