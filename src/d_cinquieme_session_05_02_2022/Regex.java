package d_cinquieme_session_05_02_2022;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String min = "bonjourlmonde";
        String maj = "BONJOURLEMONDE";
        String num = "12345";
        String mix = "bonjourLeMonde90";
        String difficult = "bonjour!!!Lemonde90)%";

        String regexKleinBuschstaben = "[a-z]*"; //0 ou plusieurfois
        String regexGrossBuschstaben = "[A-Z]*";
        String regexNumber = "[0-9]*";
        String regexMix = "[0-9a-zA-Z]*";

        String regexList = ".*[abc458]{2}.{2}";
        String specialKarak = ".*["+ Pattern.quote("\\&!%$§(/%=?=(&$") +"]{2}.*";

        System.out.println(min.matches(regexKleinBuschstaben));
        System.out.println(maj.matches(regexGrossBuschstaben));
        System.out.println(num.matches(regexNumber));
        System.out.println(min.matches(regexNumber));

        System.out.println(mix.matches(regexMix));
        System.out.println(difficult.matches(specialKarak));

    }
}
