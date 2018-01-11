public class CalcWeights {
    public double countGramsFromKilograms(String kilograms){
        return Double.valueOf(kilograms) * 1000;
    }

    public double countGramsFromMiligrams(String miligrams){
        return Double.valueOf(miligrams) / 1000;
    }

    public double countMiligramsFromKilograms(String kilograms){
        return Double.valueOf(kilograms) * 1000000;
    }

    public double countMiligramsFromGrams(String grams) {
        return Double.valueOf(grams) * 1000;
    }

    public double countKilogramsFromGrams(String grams){
        return Double.valueOf(grams) / 1000;
    }

    public double countKilogramsFromMiligrams(String miligrams){
        return Double.valueOf(miligrams) / 1000000;
    }
}
