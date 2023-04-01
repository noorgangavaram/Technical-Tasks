public class Duplicate_Character_String {
    public static void main(String args[]){
        String name = "java";
        String letters = "";
        String duplicates = "";

        for(int i=0;i<name.length();i++){
            String current_Character = Character.toString(name.charAt(i));

            if(letters.contains(current_Character)){
                if(!duplicates.contains(current_Character)){
                    duplicates = duplicates +current_Character;
                }
            }else {
                letters = letters+current_Character;
            }
        }

        System.out.println("Duplicate characters are " + duplicates );


    }
}
