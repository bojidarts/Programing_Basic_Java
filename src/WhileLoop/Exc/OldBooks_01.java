package WhileLoop.Exc;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String newBook = scanner.nextLine();
        int bookCounter = 0;
        boolean isFound = false;

        while (!newBook.equals("No More Books")){
            if (newBook.equals(searchedBook)){
                isFound = true;
                break;
            }

            bookCounter++;
            newBook = scanner.nextLine();
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", bookCounter);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCounter);
        }
    }
}
