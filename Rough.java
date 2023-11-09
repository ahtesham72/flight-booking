// import java.util.Scanner;
// import java.util.ArrayList;

// public class Test {
// static {
// System.out.println("WELCOME TO MY TICKET");
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int choice;
// int opt;
// int count = 0;
// ArrayList<Ticket> plist = new ArrayList<Ticket>();
// do {
// System.out.println("1)BOOK INTERNATIONAL FLIGHT\n2)BOOK DOMESTIC TICKET");
// System.out.println("3)DOMESTIC AVAILABILITY\n4)INTERNATIONAL AVAILABILITY");
// System.out.println("5)BOOKED TICKETS");
// opt = sc.nextInt();
// System.out.println("ENTER HOW MANY TICKETS YOU WANT TO BOOK");
// count = sc.nextInt();
// if (count < 6) {

// switch (opt) {
// case 1: {
// for (int i = 0; i < count; i++) {
// System.out.println("INTERNATIONAL TICKET BOOKING");
// Ticket objI = new International();
// // objI.display();
// plist.add(objI);
// }
// break;
// }
// case 2: {
// for (int j = 0; j < count; j++) {
// System.out.println("DOMESTIC TICKET BOOKING");
// Ticket objD = new Domestic();
// // objD.display();
// plist.add(objD);

// }
// break;
// }
// case 3: {
// DA objDA = new DA();
// break;
// }
// case 4: {
// IA objDA = new IA();
// break;
// }
// case 5: {
// for (Ticket ticket : plist) {
// System.out.println(ticket.display());
// }
// }
// default:
// break;
// }

// } else {
// System.out.println("YOU CANNOT BOOK MORE THAN 5 TICKETS AT ONCE");
// }
// System.out.println("DO YOU WISH TO CONTINUE?\n1)YES\t2)NO");
// choice = sc.nextInt();
// } while (choice != 2);
// System.out.println("THANK YOU FOR BOOKING WITH US!!!!");
// }
// }
