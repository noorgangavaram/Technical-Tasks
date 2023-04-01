import java.io.BufferedWriter;
import java.io.FileWriter;

public class Files {
    public static void main(String args[]){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            writer.write("This is a new file ");
            writer.newLine();
            writer.write("added by the user");
            writer.close();


        }catch (Exception e){
            System.out.println("The exception is : "+ e);
        }


    }
}
