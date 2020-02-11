package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Sandbox {

	public static int loopSize(Node node) {
		int counter = 0;
		while (!Objects.isNull(node)) {
			counter++;
			System.out.println(counter);
			node = node.getNext();
		}
		return counter;

	}

	public static String seriesSum(int n) {
		return String.format("%.2f",
				DoubleStream.iterate(1, e -> e + 1)
				.limit(n - 1)
				.map(e -> 1 / (3 * e + 1))
				.sum() + 1);
	}

	/**
	 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
	 * Implement a function that determines whether a string that contains only letters 
	 * is an isogram. Assume the empty string is an isogram. Ignore letter case.
	 * @param str
	 * @return
	 */
	public static boolean isIsogram(String str) { 
		return str.toLowerCase().chars().distinct().count() == str.length();
	}

	/** a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers 
	 * in the form of a phone number "(123) 456-7890". 
	 * @param numbers
	 * @return
	 */
	public static String createPhoneNumber(int[] numbers) {
		String str = Arrays.toString(numbers).replaceAll("[\\[,\\] ]", "");
		return String.format("(%s) %s-%s", str.substring(0, 3), str.substring(3, 6), str.substring(6, 10));
	}

	public static boolean validatePin(String pin) {
		return pin.matches("[\\d]{4}|[\\d]{6}");
	}

	public static int duplicateCount(String text) {
		return (int) new ArrayList<Long>(text.chars()
				.mapToObj(i -> (char) i)
				.map(Character::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.values())
				.stream()
				.filter(e -> e > 1)
				.count();
	}

	public static int sortDesc(final int num) {
		return Integer.parseInt(
				Arrays.asList(Integer.toString(num).split(""))
				.stream()
				.sorted((a, b) -> b.compareTo(a))
				.reduce("", String::concat));
	}

	public static void main(String[] args) {
		System.out.println(seriesSum(2));
		System.out.println("1. " + isIsogram("aba"));
		System.out.println("2. " + isIsogram("Dermatoglyphics"));
		System.out.println("3. " + isIsogram("moose"));
		System.out.println("4. " + isIsogram("isogram"));
		System.out.println("5. " + isIsogram("isIsogram"));
		System.out.println("6. " + isIsogram("moOse"));
		System.out.println("7. " + isIsogram("thumbscrewjapingly"));
		System.out.println(createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }));

		System.out.println(validatePin("1"));
		System.out.println(validatePin("12"));
		System.out.println(validatePin("123"));
		System.out.println(validatePin("12345"));
		System.out.println(validatePin("1234567"));
		System.out.println(validatePin("1234"));
		System.out.println(validatePin("1.234"));
		System.out.println(validatePin("00000000"));

		System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));

		Node ls = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, new Node(7)))))));
		System.out.println(loopSize(ls));
		System.out.println(sortDesc(132631));
	}
}
