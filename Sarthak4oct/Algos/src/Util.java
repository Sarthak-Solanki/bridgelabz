import java.util.ArrayList;
import java.util.Iterator;

public class Util {
	public static boolean anagram(String s1, String s2) {
		boolean b = true;
		int[] count = new int[26];
		int[] count2 = new int[26];
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				count[s1.charAt(i) - 97]++;
			}
			for (int i = 0; i < s2.length(); i++) {
				count2[s2.charAt(i) - 97]++;
			}
			for (int i = 0; i < s1.length(); i++) {
				if (count[i] == count2[i]) {
					b = true;
				}
			}
		}
		return b;
	}

	public static ArrayList<Integer> primeNumber() {
		// int count = 0;

		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 2; i <= 1000; i++) {
			boolean b = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}

			}
			if (b) {
				a.add(i);
				// System.out.println(i);
				// count++;
				// break;
			}
		}
		// System.out.println(count);
		return a;
	}

	public static boolean palindromeInteger(int a) {
		ArrayList<Integer> az = new ArrayList<Integer>();
		int z;	
		while(a>0) {
			z = a%10;
			az.add(z);
			a = a/10;
		}
		for (int i = 0; i < az.size()/2; i++) {
			int temp = az.size()-1;
			if(az.get(i)  !=az.get(temp)) {
				return false;
			}

		}
		return true;
	}

	public static void anagramInteger(ArrayList<Integer> a) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		int temp1,temp2;
		for (int i = 0; i < a.size()-1; i++) {
			int n1 = a.get(i);
			while(n1>0) {
				temp1 = n1%10;
				a1.add(temp1);
				n1 = n1/10;
			}
			for (int j = i+1; j < a.size(); j++) {
				int n2 = a.get(j);
				while(n2>0) {
					temp2 = n2%10;
					a2.add(temp2);
					n2 = n2/10;
				}
				for (Integer z : a1) {
					if(a2.contains(z)) {
						a2.remove(z);
					}
				}
				if(a2.isEmpty()) {
					System.out.println(a.get(i)+" "+a.get(j));
				}
				a2.removeAll(a2);
			}
			a1.removeAll(a1);
		}
	}
}