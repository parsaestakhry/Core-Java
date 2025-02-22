public class Inh {

    public static void main(String[] args) {
        Calc calculator = new Calc();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(advancedCalculator.add(2, 0));

        AwsomeCalculator awesomeCalculator = new AwsomeCalculator();
        System.out.println(awesomeCalculator.power(2, 3));

    }
    

    

}


class Calc {
    int num;
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
}