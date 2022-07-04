public class ArrayOfObjects {
    public static void main(String[] args){
        //Food[] refrigerator = new Food[3];
        Food food1 = new Food("pizza");
        Food food2 = new Food("sandwich");
        Food food3 = new Food("gherkins");

        Food[] refrigerator = {food1, food2, food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;
        System.out.println(refrigerator[0]);
        System.out.println(refrigerator[1].name);
    }
}



class Food{
    String name;
    Food(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    } // this can be replaced with the object.name
}