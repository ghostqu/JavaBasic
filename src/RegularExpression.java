
public class RegularExpression {
	public static void main(String[] arg) {
		String s = "I have a dog, I have a cat, and I live in Austrila";
		/* abc 
		 * [abc]
		 * [a-z]
		 * [^abc]
		 * a+
		 * a?
		 * . .......
		 */
		//All the case about java regex 
		//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		String[] words = s.split(",? ");
		for(String word : words) {
			if(word.matches("(dog)|(cat)|((A|a).*a)")) // this is find all words start with 'a' end with 'c'
				System.out.println(word);
		}
	}
}
