public class LogicOps {

    public static void main(String[] args) {
        int a = -69;
        if(a>10 && a <25) {
            System.out.println("temp is medium");
        }
        else if(a>10 || a > 5){
            System.out.println("temp is not cold");
        }
        else if(!(Math.abs(a) == 69)) {
            System.out.println("damn, not nice");
        }
        else if(Math.abs(a) == 69) {
            System.out.println("nice");
        }
    } // comparison of strings requires .equals(comparer) method

}
