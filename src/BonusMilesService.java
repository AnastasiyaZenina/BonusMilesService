public class BonusMilesService {
    public int calculate(int price) {
        int cost = price;
        int bonus = 20;
        int miles = cost / bonus;
        return miles;
    }
}
