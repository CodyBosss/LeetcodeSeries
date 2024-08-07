package SandyBoss;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SuperUglyNumber {
	public static void main(String [] args) {
		int n=1;
		int [] primes = {2,3,5};
		System.out.println(nthUglyNumber(n, primes));
	}
	public static int nthUglyNumber(int n, int primes[]) {
		PriorityQueue<Long> heap = new PriorityQueue<>();
		Set<Long> seen = new HashSet<>();
		
		heap.add(1L);
		seen.add(1L);
		long currentUgly=1;
		
		for(int i=0; i<n; i++) {
			currentUgly = heap.poll();
			for(int prime : primes) {
				long newUglu = currentUgly*prime;
				if(seen.add(newUglu)) {
					heap.add(newUglu);
				}
			}
		}
		return (int)currentUgly;
	}
}
