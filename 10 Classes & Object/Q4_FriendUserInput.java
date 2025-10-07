import java.util.Scanner;
class Q4_FriendUserInput {
    String name;
    String address;
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4_FriendUserInput f1 = new Q4_FriendUserInput();
        System.out.print("Enter Friend Name: ");
        f1.name = sc.nextLine();
        System.out.print("Enter Friend Address: ");
        f1.address = sc.nextLine();
        System.out.println("\nFriend Details:");
        f1.showDetails();
        sc.close();
    }
}