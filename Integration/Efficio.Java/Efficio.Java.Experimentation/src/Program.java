import Efficio.Java.Engine;
import Efficio.Java.Frame;

public class Program {
	static {
		System.loadLibrary("Efficio.Core");
		System.loadLibrary("Leap");
		System.loadLibrary("Efficio.LeapMotion");
		System.loadLibrary("Efficio.RealSense");
		System.loadLibrary("Efficio.Kinect");
		System.loadLibrary("EfficioRuntime");
	  }


	public static void main(String[] args) {
		Engine engine = new Engine();
		
		engine.Start();
		
		while (true){
			Frame frame = engine.GetFrame();
		}
	}

}