//package w1;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;



public class RandomWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "";
		String champion = "";
		int i=0;
		
		while(!StdIn.isEmpty()) {
			++i;
			s = StdIn.readString();
			if (StdRandom.bernoulli(1/i)) {
				champion = s;
			}
			
		}
		
		StdOut.println(champion);

	}

}
