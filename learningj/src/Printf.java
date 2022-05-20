public class Printf {

    public static void main(String[] args) {
        // printf() = optional method to control, format, and display text to console
        //				2 args = format string + (object/var/value)
        //				% [flags][precision][width][conversion-character]
        boolean myBool = true;
        char myChar = 'a';
        int myInt = 5;
        String myStr = "Hello";
        double myDouble = 1232;

        //[conversion characters]
        System.out.printf("%b", myBool);
        System.out.printf("%c", myChar);
        System.out.printf("%d", myInt);
        System.out.printf("%s", myStr);
        System.out.printf("%f", myDouble);
        System.out.println();

        //[width] => min num of chars written in output
        System.out.printf("Hello %10s", myStr);
        System.out.printf("Hello %-10s", myStr); // extra spaces now come after
        System.out.println();

        //[precision] => num of digits of precision for floats
        System.out.printf("You have this much money %.2f", myDouble);
        System.out.println();

        //[flags] => adds effect to output
        // - : left-justify
        // + : output a plus or minus sign for a numeric value
        // 0 : numeric valuse are zero padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %20f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %+f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %020f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %,f", myDouble);
    }

}
