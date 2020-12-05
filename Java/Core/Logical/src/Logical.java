public class Logical {

    public static void main(String args[]) {

        boolean hasAccount = true;
        boolean isLoggedIn = false;
        boolean hasPaid = false;

        //&& - return true if both condition are true
        System.out.println(hasAccount && isLoggedIn && hasPaid);

        // || - return true if any one condition are true
        System.out.println(hasAccount || isLoggedIn || hasPaid);

        // !- reverse things
        System.out.println(!hasPaid);
    }
}
