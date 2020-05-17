public class AppMain {


    public static void main(String[] args){
        String name =" Dude ";

        boolean sweet = true;

        System.out.println("Hallo Leute!" + name + "Sweet "+ sweet);
    sweet = false;

    int firstInt = 100_000_000;
    int secondInt = 214_000_000;

    int result = firstInt + secondInt;

        System.out.println(result);

        boolean big = 6 > 3;
        System.out.println(big);
        boolean small = 3 > 9;
        System.out.println(small);
        boolean same = 6==6;
        System.out.println(same);
        boolean notsame = 6==7;
        System.out.println(notsame);
        boolean another = 6<=7;
        System.out.println(another);
        boolean last = 6>=7;
        System.out.println(last);

        int number1 = 6;
        int number2 = 6;
        System.out.println(number1 + number2);

        int number3 = 5;
        int number4 = 5;
        System.out.println(number3 + number4);

    // methode 1
        int result2 = CalculationUtils.duplicate(4);
        printValue(result);

    // methode 2
        int addResult = CalculationUtils. add(5,result);
        printValue(addResult);


        String someString ="some fancy String";
        boolean fancy = isFancy(someString);
        System.out.println(fancy);
    }
    public static boolean isFancy(String someString) {
        return someString.contains("fancy");
    }

    public static void printValue(int value) {
        System.out.println("result2 "+ value);

        boolean comparison;
        if (value > 100) comparison = true;
        else comparison = false;
        System.out.println(comparison);
    }



}
