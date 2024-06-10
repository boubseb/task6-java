public class Classroom {
    public static void main(String[] args) {

        Wilder wilder1 = new Wilder("JC", true);
        Wilder wilder2 = new Wilder("Henry", false);
        Wilder wilder3 = new Wilder("Léa", true);
        Wilder wilder4 = new Wilder("Carole", false);


        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
        System.out.println(wilder4.whoAmI());
    }
}
