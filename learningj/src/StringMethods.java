public class StringMethods {
    public static void main(String[] args) {

        String name = "amongus";

        boolean equals = name.equals("amongus"); //true
        boolean equalsIgnoresCase = name.equalsIgnoreCase("Amongus"); //true
        int length = name.length();
        char charAt = name.charAt(0);
        int indexOf = name.indexOf('o');
        boolean isEmpty = name.isEmpty();
        String toUpperCase = name.toUpperCase(); // same for .toLowerCase
        String trim = name.trim(); //removes whitespace
        String replace = name.replace('n', 'u');
    }
}