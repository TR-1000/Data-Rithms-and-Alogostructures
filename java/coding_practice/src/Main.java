import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static int solution(int X, int Y, int D) {
		double x = (double) X;
        double y = (double) Y;
        double d = (double) D;
        double totalHops = Math.ceil((y-x)/d);

        return (int)totalHops;
	}
	
	
	
	public static void main(String[] args) {
		int currentPosition = 10;
		int destination = 85;
		int jumpDistance = 30;
		System.out.println(solution(currentPosition, destination, jumpDistance));
	}
}


