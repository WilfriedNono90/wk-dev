package wk_dev_workshop.userService;

import java.util.List;
import java.util.Optional;

public interface LoginServiceInterface {

    public boolean testName(String name);
    public boolean testAge(int age);
    public boolean testEmail(String email);
    public boolean testMotDePasse(String mdp);
    public boolean saveUser(String name, String prenom, int age, String email, String mdp);
    public boolean deleteUser(String idUser);
    public List<User> findAllUser();
    public Optional<User> findUserById(String idUser);
    public boolean testLoginDaten(String name, String mdp);
}
