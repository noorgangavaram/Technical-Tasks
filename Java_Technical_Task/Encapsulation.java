
class Bank{
   private double balance = 100;
   public void setBalance(int newMoney){
       balance = newMoney;
   }
   public double getBalance(){
       return balance+100;
   }

}
public class Encapsulation {
    public static void main(String args[]){
        Bank bank = new Bank();
        bank.setBalance(200);
        System.out.println(bank.getBalance());
    }
}
