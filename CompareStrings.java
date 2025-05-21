import java.util.Scanner;

public class CompareStrings {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
	   System.out.println("Введите первый текст для сравнения:");

       String stra = sc.nextLine();

       System.out.println("Введите второй текст для сравнения:");
       String strb = sc.nextLine();

       if (stra.equals(strb)) {
          System.out.println("Строки идентичны");
       } else {
          System.out.println("Строки неидентичны");
       } 
sc.close();
   }
}