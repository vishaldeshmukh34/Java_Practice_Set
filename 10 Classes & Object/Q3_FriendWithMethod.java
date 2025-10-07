class Q3_FriendWithMethod {
    String name;
    String address;
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        Q3_FriendWithMethod f1 = new Q3_FriendWithMethod();
        Q3_FriendWithMethod f2 = new Q3_FriendWithMethod();
        f1.name = "Harshada";
        f1.address = "Pune";
        f2.name = "Aditya";
        f2.address = "Pandharpur";
        System.out.println("Friend 1 Details:");
        f1.showDetails();
        System.out.println("\nFriend 2 Details:");
        f2.showDetails();
    }
}