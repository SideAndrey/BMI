public class BmiService {
    public float calculate(int weight, float height) {
        float square = height * height;
        float bmi = weight / square;
        return bmi;
    }
}