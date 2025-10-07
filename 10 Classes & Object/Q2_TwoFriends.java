class Q2_TwoFriends {
    String name;
    String address;
    public static void main(String[] args) {
        Q2_TwoFriends f1 = new Q2_TwoFriends();
        Q2_TwoFriends f2 = new Q2_TwoFriends();
        f1.name = "Harshada";
        f1.address = "Pune";
        f2.name = "Aditya";
        f2.address = "Pandharpur";
        System.out.println("Friend 1 Details:");
        System.out.println("Name: " + f1.name);
        System.out.println("Address: " + f1.address);
        System.out.println("\nFriend 2 Details:");
        System.out.println("Name: " + f2.name);
        System.out.println("Address: " + f2.address);
    }
}