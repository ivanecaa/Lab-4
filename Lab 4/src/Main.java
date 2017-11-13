import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberToSpecify;
        int sum=0;
        int iteration=0;
        Scanner scan=new Scanner(System.in);
        //numberToSpecify=scan.nextInt();
        System.out.println("Print a times table");

       /* for (int i=1;i<=20;i++){
            System.out.println(numberToSpecify+"*"+i+" = "+(numberToSpecify*i));
        }*/


       /* while(sum<500){
            iteration++;
            sum+=iteration;
        }
        System.out.println(iteration);
*/

        UserGroup usergroup = new UserGroup();
        UserGroup administrator=new UserGroup();
        usergroup.addSampleData();
        while (usergroup.getUserIterator().hasNext()){
            if(usergroup.getUserIterator().next().getUserType().equals("admin")){
                administrator.people.add(usergroup.getUserIterator().next());
            }
        }
        /*while (it.hasNext()) {
            User element = it.next();
            if (element.getUsername().equals(Username)) {
                it.remove();
            }*/


        administrator.printUsernames();
        //usergroup.printUsernames();
        User u1= usergroup.getUser(0);

    }
}
