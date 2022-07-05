public class BonusMilesService {
    public int calculate(int cost, int miles) {
        if (cost <= 20) {
            miles = 0;
        } else {
            miles = 1;
        }
        return cost;
    }
