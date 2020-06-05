public class BmiService {
    public static float calculate(int weight, float height) {
        float square = height * height;
        float bmi = weight / square;
        return bmi;
        }

}