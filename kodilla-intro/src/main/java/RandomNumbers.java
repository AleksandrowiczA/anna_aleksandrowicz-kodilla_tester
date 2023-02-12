import java.util.Random;
public class RandomNumbers {
    Random rand = new Random();
    int upperbound;
    int int_random;
    public RandomNumbers(int range)
    {
        this.int_random = rand.nextInt(range);
    }

    public static void main(String[] args)
    {
        RandomNumbers randomNumbers = new RandomNumbers(30);
        randomNumbers.lotto();
    }

    public void lotto()
    {
        int result = 0;
        int iteration = 0;

        for(int i = 0; i < iteration +1; i++)
       {
           RefreshRandomNumbers(i);
           if(result > 5000)
           {
               System.out.println(result);
               return;
           }
           iteration = iteration +1;
           result = result + int_random;
       }
    }

    public void RefreshRandomNumbers(int iteration)
    {
        int[] table = new int[iteration+1];
        table[iteration] = int_random;
    }


}
