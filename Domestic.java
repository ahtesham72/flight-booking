import java.util.Scanner;

public class Domestic extends Ticket {
    String sor;
    String des;
    Scanner sc = new Scanner(System.in);

    public void nothing() {
        // nothing
    }

    public Domestic() {
        super();
        System.out.println("ENTER YOUR SOURCE AND DESTINATION");
        this.sor = sc.next();
        this.des = sc.next();
    }

    public String display() {
        System.out.println("-------------------------------------------------");
        System.out.println("DOMESTIC TRAVELLER'S DETAIL");
        super.display();
        System.out.println("SOURCE:" + sor);
        System.out.println("DESTINATION:" + des);
        return "----------------------------------------------------";

    }
}
