public class BonusMilesService {

    public int calculate(int cost) {
        int milePerCost = 10;

        int miles = cost / milePerCost;
        return miles;
    }
}