public class Main {

    public static void main(String[] args) {
        // type sout + tab; autocompletes system.out.print

        boolean bool = true;
        byte a = -128; // to 127
        short b = -32768; // to 32767

        int c = 5; // -2billion to 2 billion
        System.out.println("My number is " + c);

        long d = 123452859234L; // -9quintillion to +  => followed by 'L'
        float e = 5.5213f; // up to 6-7 digits => number followed by 'f'
        double f = 5.1234456756347; //up to 15 digits
        char g = 'a';
        String h = "Hello"; //reference variable (sequence of chars), not primitive

    }

}
