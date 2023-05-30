package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EmailList {
    private HashSet<String> todoL = new HashSet<>();

    public void add(String email) {

        if (isValidEmail(email)) {
            todoL.add(email.toLowerCase());
        }else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }
    private boolean isValidEmail(String email) {
        return  email.contains("@") && ((email.endsWith(".ru") || email.endsWith(".com")));
    }

    public List<String> getSortedEmails() {
            List<String> sortedList = new ArrayList<>(todoL);
            Collections.sort(sortedList);
                return sortedList;
    }
}
