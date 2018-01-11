public class CalcMeters {

    public double countCentimetersFromMeters(String meters){
        return Double.valueOf(meters) * 100;
    }

    public double countCentimetersFromMilimeters(String milimeters){
        return Double.valueOf(milimeters) / 10;
    }

    public double countMilimetersFromMeters(String meters){
        return Double.valueOf(meters) * 1000;
    }

    public double countMilimetersFromCentimeters(String centimeters) {
        return Double.valueOf(centimeters) * 10;
    }

    public double countMetersFromCentimeters(String centimeters){
        return Double.valueOf(centimeters) / 100;
    }

    public double countMetersFromMilimeters(String milimeters){
        return Double.valueOf(milimeters) / 1000;
    }
}
