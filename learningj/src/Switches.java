public class Switches {

    public static void main(String[] args) {
        String day = "friday";

        switch(day) {
            case "sunday": System.out.println("It is sunday");
                break;
            case "monday": System.out.println("It is monday");
                break;
            case "tuesday": System.out.println("It is tuesday");
                break;
            case "wednesday": System.out.println("It is wednesday");
                break;
            case "thursday": System.out.println("It is thursday");
                break;
            case "friday": System.out.println("It is friday");
                break;
            case "saturday": System.out.println("It is saturday");
                break;
        }

        int a = 3;
        switch(a) {
            case 5: System.out.println(a);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("between 1 and 4");
                break;

            default: System.out.println("not five");
        }

    }

}
