import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String a = "&";

        String regex1 = ".*[a-z].*";
        String regex = "[a-z]{5}";
        String regex2 = "[^a-z]"; //^Negation
        String regex3 = "['a-zA-Z']"; //^Negation
        String regex4 = "["+Pattern.quote("!$%&/()=?,")+"]";

        System.out.println(a.matches(regex4));
    }
}
