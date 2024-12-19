package strings;

public class StringDemo {
    public static void main(String[] args) {
        String sentence = "Chris is a great guy";

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.replace('a', 'o'));

        StringBuilder words = new StringBuilder("Fidelis is cool");
        words.append(" and great guy \n");
        words.append("He is currently teaching chris");
        System.out.println(words);

        
        StringBuffer quote = new StringBuffer();



    }
}
