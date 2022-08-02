public class BonusMilesService {
    public int calculate(int cost) {
        int rubl = 20;
        int calculate = cost / rubl;
        System.out.println("Вам начисленно" + calculate);
        return calculate;
    }
}
