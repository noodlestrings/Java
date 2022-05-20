public class Wrappers {

    public static void main(String[] args) {
        // wrapper class = way to use primitive data types as reference types that contain useful methods
        // 				   can be used with collections (e.g. ArrayList)
        //				   Less efficient than primitive values

        /*primitive       wrapper
         * ####           ####
         * boolean        Boolean
         * char           Char
         * int            Integer
         * double         Double
         */

        // autoboxing = automatic conversion by the Java compiler of primitive types to the corresponding object wrapper classes
        // unboxing = opposite of autoboxing. conversion of wrapper class to primitive types


        Boolean Wbool = true;
        Character Wcharacter = 'a';
        Integer Wnumber = 5;
        Double Wdecimal = 3.43543;
        String Wword = "Wrapper";

        if (Wnumber==5) {
            System.out.println("equals 5"); //example of unboxing: uses the wrapper classes as if it were primitive
        }


    }

}
