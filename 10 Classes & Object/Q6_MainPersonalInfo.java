class Q6_MainPersonalInfo {
    public String name = "Vishal";
    public String age = "21";
    public String location = "Pune";
    public String phone = "7973763984";
    public static void showInfo() {
        Q6_MainPersonalInfo obj = new Q6_MainPersonalInfo();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        System.out.println("Location: " + obj.location);
        System.out.println("Phone: " + obj.phone);
    }
    public static void main(String[] args) {
        showInfo();
    }
}