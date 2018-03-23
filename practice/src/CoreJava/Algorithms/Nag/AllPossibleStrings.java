package CoreJava.Algorithms.Nag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AllPossibleStrings {

	public static Set<String> permutation(String s) {
		// The result
		Set<String> res = new HashSet<String>();
		// If input string's length is 1, return {s}
		if (s.length() == 1) {
			res.add(s);
		} else if (s.length() > 1) {
			int lastIndex = s.length() - 1;
			// Find out the last character
			String last = s.substring(lastIndex);
			// Rest of the string
			String rest = s.substring(0, lastIndex);
			// Perform permutation on the rest string and
			// merge with the last character
			res = merge(permutation(rest), last);
		}
		return res;
	}

	public static Set<String> merge(Set<String> set, String c) {
		Set<String> res = new TreeSet<String>();
		// Loop through all the string in the list
		for (String s : set) {
			// For each string, insert the last character to all possible
			// postions
			// and add them to the new list
			for (int i = 0; i <= s.length(); ++i) {
				String ps = new StringBuffer(s).insert(i, c).toString();
				res.add(ps);
			}
		}
		return res;
	}

	public static Set<String> SubString(String str, int n) {
		Set<String> ts = new TreeSet<>();
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++) {
				ts.add(str.substring(i, j));
				System.out.println(str.substring(i, j));
			}
		return ts;
	}

	public static void main(String[] args) {
		String word = "hello";

		String str = "abcd";
		SubString(word, word.length());

		Set<String> l = permutation(word);

		System.out.println(l);

		List<String> al = new ArrayList<>();
		int[] a = new int[word.length()];

		Map<String, Integer> hm = new LinkedHashMap<>();
		// {e ,el,ell,ello,h,he,hel,hell,hello,l,ll,llo,lo,o}
		// h>{h,he,hel,hell,hello},e>{e,el,ell,ello},l>{l,ll,lo} ,o

		for (int i = 0; i < word.length(); i++) {
			a[i] = (int) word.charAt(i);

		}
	}

}
