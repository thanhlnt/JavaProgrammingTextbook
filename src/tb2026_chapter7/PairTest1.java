package tb2026_chapter7;

public class PairTest1 {
	public static void main(String[] args) {
		String[] words = { "Java", "programming", "textbook", "2026"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min word: " + mm.getFirst());
		System.out.println("max word: " + mm.getSecond());
	}
}
