public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        int rubPerMile = 20;

        miles = price / rubPerMile;
        return miles;


    }

}
