package webcam;

public class Main {

	public static void main(String[] args) {
		
		FaceCompare faceCom = new FaceCompare();
		try {
			faceCom.compare();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(faceCom.getResult());
		
		
		
		
	}

}
