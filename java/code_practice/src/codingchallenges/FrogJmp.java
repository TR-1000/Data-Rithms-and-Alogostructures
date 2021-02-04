package codingchallenges;

public class FrogJmp {
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

/*
A small frog wants to get to the other side of the road. 
The frog is currently located at position X and wants to get to a position greater than or equal to Y. 
The small frog always jumps a fixed distance, D.
Count the minimal number of jumps that the small frog must perform to reach its target.
 */
