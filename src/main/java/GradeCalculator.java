public class GradeCalculator {

    public String calculate(int score) {
        String error = "please input score 0-100";
        if (score < 0 || score > 100) {
            return error;
        } else if (score <= 49) {
            return "F";
        } else {
            return "A";
        }
    }
}
