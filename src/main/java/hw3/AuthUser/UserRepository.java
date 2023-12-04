package hw3.AuthUser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public List<User> getData() {
        return data;
    }

    public void addUser(User user) {
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void unlogingUsers(){
        for (Iterator<User> iterator = data.iterator(); iterator.hasNext();){
            if (iterator.next().isAdmin == false){
                iterator.remove();
            }
        }
    }

}
