public class Method_Overloading_By_DataTypes {

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static void main(String args[]){
          System.out.println(add(12,3));
          System.out.println(add(10.7,3.3));
    }
}
