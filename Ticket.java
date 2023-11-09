import java.util.*;

public abstract class Ticket {
    String name;
    String dot;
    String category;
    String gender;
    int age;
    Scanner sc = new Scanner(System.in);

    public Ticket() {
        System.out.println("ENTER TRAVELLER'S NAME,AGE,DATE OF TRAVEL,GENDER & CATEGORY ");
        this.name = sc.next();
        this.age = sc.nextInt();
        this.dot = sc.next();
        System.out.println("ENTER MALE OR FEMALE:");
        this.gender = sc.next();
        System.out.println("1.SENIOR CITIZEN  2.GENERAL ADULT");
        this.category = sc.next();
    }

    public abstract void nothing();

    public String display() {
        System.out.println("NAME:" + name);
        System.out.println("AGE:" + age);
        System.out.println("DATE OF TRAVEL:" + dot);
        System.out.println("GENDER:" + gender);
        System.out.println("CATEGORY:" + category);
        System.out.println("TICKET COST:2400");
        return "----------------------------------------------------";
    }
}
