import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RF {
	public static String RFrequency(String input) {
		String lowercaseName = input.toLowerCase();
		Map<Character, Integer> m = new TreeMap<Character, Integer>(); // Create a new map. Contains key and variable.
		for (char character : lowercaseName.toCharArray()) // changing string in to character array. For every character
		// in this character-array..
		{
			if (m.containsKey(character)) // if m contains a character +1 to the count. also ascending order
				m.put(character, m.get(character) + 1);
			else
				m.put(character, (int) 1f); // just maintain ascending order and print character
		}
		System.out.println("Character  |Frequency");
		for (Character key : m.keySet()) {
			System.out.println(" " + key + "         |  " + m.get(key));
		}
		// for every character in the String print its count using the keys.
		System.out.println("Character  | Relative Frequency");
		for (Entry<Character, Integer> entry : m.entrySet()) {
			Float freq = (float) entry.getValue() / input.length();
			System.out.println(" " + entry.getKey() + "         | " + freq);
			// for each map entry get the float value and divide my the string length to get
			// the relative frequency.
			// converted to a float so that the character frequency is to 0dp and the
			// relative frequency has decimals.
		}
		return lowercaseName;

	}
}

// int has min value of 0 so float must be used.

// The TreeMap class implements the Map interface by using a tree. A TreeMap
// provides an efficient means of storing key/value pairs in sorted order, and
// allows rapid retrieval.

// unlike a hash map, a tree map guarantees that its elements will be sorted in
// an ascending key order.
