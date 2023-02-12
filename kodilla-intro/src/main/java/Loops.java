public class Loops {

    public static void main(String[] args)
    {
        int[] numbers = {1, 4, 6, 8, 9,};
        int wynik = method(numbers);
        System.out.println(wynik);
    }
    public static Integer method(int[] numbers){

        int result = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            result += numbers[i];
        }
        return result;
    }

}
