public class Arrays2d {

    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "Mustang";
        cars[0][1] = "Corvette";
        cars[0][2] = "Shelby";
        cars[1][0] = "Prius";
        cars[1][1] = "Skyline";
        cars[1][2] = "Primera";
        cars[2][0] = "Chimera";
        cars[2][1] = "Saggaris";
        cars[2][2] = "E-Type";

        for(int i=0;i<cars.length; i++) {
            int j = 0;
            System.out.println();
            while(j<cars[i].length) {
                System.out.print(cars[i][j] + " ");
                j++;
            }
        }

        String[][] arr = {{"Mustang", "Corvette", "Shelby"},
                {"Prius", "Skyline", "Primera"},
                {"Chimera", "Saggaris", "E-Type"}};
        //another way of assigning values, at declaration


    }

}