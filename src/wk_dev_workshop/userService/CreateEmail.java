package wk_dev_workshop.userService;

public class CreateEmail {


    public static void main(String[] args) {
        String email1 = "marko_parker.mp@outlook.de";
        CreateEmail mail = new CreateEmail();
        boolean result = mail.emailFormat(email1);
        System.out.println(result);
    }

    public  boolean emailFormat (String email){

        String regex = ("[a-z0-9_.]+@[a-z0-9-]+\\.[a-z]+");
        if (email.matches(regex)) {
            return true;
        }


        return false;
    }

}



