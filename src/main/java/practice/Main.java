package practice;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static EmailList todoL = new EmailList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду (LIST, ADD, 0)");
            String command = scanner.nextLine();
            if (command.equals("0")) {
                break;
            }
            if (command.equals("ADD")){
                System.out.println("Введите адрес:");
                String email = scanner.nextLine();
                todoL.add(email);
            }
            if (command.equals("LIST")){
                List<String> sortedEmails = todoL.getSortedEmails();
                for (String email : sortedEmails) {
                    System.out.println(email);
                }
            }
        }
    }
}
