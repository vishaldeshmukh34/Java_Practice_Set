// 7. Season Finder
// Take a month number (1–12) as input and use switch-case to print the season:
// Dec–Feb → Winter
// Mar–May → Summer
// Jun–Aug → Rainy
// Sep–Nov → Autumn

public class Day7_SeasonFinder {
    public static void main(String[] args) {
        int month = 5;

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Winter"); break;
            case 3: case 4: case 5:
                System.out.println("Summer"); break;
            case 6: case 7: case 8:
                System.out.println("Rainy/Monsoon"); break;
            case 9: case 10: case 11:
                System.out.println("Autumn"); break;
            default:
                System.out.println("Invalid Month"); break;
        }
    }
}
