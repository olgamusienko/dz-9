public class Main {
    public static void main(String[] args) {

        Person man1 = new Man("Nick", "Bond", 18);
        Person woman1 = new Woman("Mary", "Stewart", 62);
        Person woman2 = new Woman("Lily", "Rose", 35);
        Person man2 = new Man("Jack", "Brown", 70);
        woman1.registerPartnership(man2);

        System.out.println(man1.getFirstName() + " " + man1.getLastName() + (man1.isRetired() ? " is retired" : " is not retired"));
        System.out.println(man2.getFirstName() + " " + man2.getLastName() + (man2.isRetired() ? " is retired" : " is not retired"));
        System.out.println(woman1.getFirstName() + " " + woman1.getLastName() + (woman1.isRetired() ? " is retired" : " is not retired"));
        System.out.println(woman2.getFirstName() + " " + woman2.getLastName() + (woman2.isRetired() ? " is retired" : " is not retired"));
        System.out.println(woman1.getFirstName() + " " + woman1.getLastName() + "'s partner is " + woman1.getPartner().getFirstName() + " " + woman1.getPartner().getLastName());
        System.out.println(man2.getFirstName() + " " + man2.getLastName() + "'s partner is " + man2.getPartner().getFirstName());
        System.out.println(man1.getFirstName() + "'s partner is " + man1.getPartner());

        man1.deregisterPartnership(true);
        man2.deregisterPartnership(true);
        System.out.println(man2.getFirstName() + " " + man2.getLastName() + "'s partner is " + man2.getPartner());
        System.out.println(woman1.getFirstName() + " " + woman1.getLastName());




    }
}