public class Methods {

    public static void main(String[] args) {
        String myname = "amongus";
        int myage = 420;
        hello(myname, myage);

        int x = 3;
        int y = 4;
        int z = sum(x, y);
        System.out.println(z);
    }

    static void hello(String name, int age) {
        System.out.println("hello "+name);
        System.out.println("You are "+age);
    }

    static int sum(int num1, int num2) {
        return(num1+num2);
    }

}
