import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Books");
            System.out.println("6. Display Users");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String bAuthor = scanner.nextLine();
                    library.addBook(bTitle, bAuthor);
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String uName = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    int uId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    library.registerUser(uName, uId);
                    break;
                case 3:
                    System.out.print("Enter title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 4:
                    System.out.print("Enter title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    library.displayUsers();
                    break;
                case 7:
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        scanner.close();
    }
}

