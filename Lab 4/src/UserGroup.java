import java.util.ArrayList;
import java.util.Iterator;


public class UserGroup {
    protected ArrayList<User> people;

    public UserGroup(){
        people=new ArrayList<User>();
    }

    public void addSampleData(){
        people.add(new User("iv1", User.UserType.admin,"Ivan"));
        people.add(new User("pi96", User.UserType.editor,"Pini"));
        people.add(new User("ba4ka", User.UserType.user,"Kristiqn"));
        people.add(new User("Bo20", User.UserType.editor,"Bobo"));
        people.add(new User("vo04", User.UserType.user,"Voni"));
        people.add(new User("I4i", User.UserType.editor,"Ina"));
        people.add(new User("El42", User.UserType.admin,"Elena"));
        people.add(new User("Kr123", User.UserType.admin,"Krisata"));
        people.add(new User("Ju15", User.UserType.user,"Juja"));
        people.add(new User("Gab00", User.UserType.editor,"Gabriela"));
    }

    public User getUser(int idx){
        return people.get(idx);
    }

    public void printUsernames() {
        for (User user : people) {
            System.out.printf("%s %s\n", user.getUsername(), user.getUserType());
        }
    }

    public void removeFirstUser(){
        people.remove(0);
    }

    public  void removeLastUser(){
        people.remove(people.size()-1);
    }

    public void removeUser(String Username){
        Iterator<User> it=people.iterator();
        while (it.hasNext()) {
            User element = it.next();
            if (element.getUsername().equals(Username)) {
                it.remove();
            }
        }
    }

    public Iterator<User> getUserIterator() {
        Iterator<User> iterate = people.iterator();
        return iterate;
    }

}

