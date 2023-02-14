import java.util.Random;
public class RandomNumbers {
    private int min;
    private int max;
    Random rand = new Random();
    int int_random;
    public RandomNumbers(int range)
    {
        this.int_random = rand.nextInt(range);
    }

    public static void main(String[] args)
    {
        RandomNumbers randomNumbers = new RandomNumbers(30);
        randomNumbers.lotto();
        System.out.println("Min value is: " + randomNumbers.getMin());
        System.out.println("Max value is: " + randomNumbers.getMax());

    }

    public void lotto()
    {
        this.min = 30;
        this.max = 0;
        int result = 0;

        while(result < 5000)
        {
            result = result + int_random;
            int_random = rand.nextInt(30);

            if(int_random <= min)
            {
                min = int_random;
            }
            if(int_random >= max)
            {
                max = int_random;
            }
        }
    }

    public int getMin()
    {
        return min;
    }
    public int getMax()
    {
        return max;
    }


}
