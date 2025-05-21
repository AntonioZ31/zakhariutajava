import java.util.Scanner;

public class CompareAndCalculate {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int numa = readInt(sc, "Введите первое число a: ");
       int numb = readInt(sc, "Введите второе число b: ");

       // Сравнение
       if (numa > numb) {
          System.out.println("a > b");
       } else if (numa < numb) {
          System.out.println("a < b");
       } else {
          System.out.println("a = b");
       }
	         
        // Сложение
        try {
            int sum = Math.addExact(numa, numb);
            System.out.println("Сумма равна " + sum);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: переполнение при сложении.");
        }

        // Вычитание
        try {
            int diff = Math.subtractExact(numa, numb);
            System.out.println("Разность равна " + diff);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: переполнение при вычитании.");
        }

        // Умножение
        try {
            int prod = Math.multiplyExact(numa, numb);
            System.out.println("Произведение равно " + prod);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: переполнение при умножении.");
        }
 
      if (numb != 0) {
         System.out.println("Результат деления равен " + ((double)numa / numb));
      } else {
         System.out.println("Деление на ноль невозможно");
      }
sc.close();
   }

   private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное целое число.");
            }
        }
    }
}