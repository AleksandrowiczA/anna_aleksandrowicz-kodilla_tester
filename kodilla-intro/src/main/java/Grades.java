public class Grades {
    private int[] grades;
    private int size;

    public Grades()
    {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value)
    {
        if(size == 10)
        {
            return;
        }

        grades[size] = value;
        size++;

    }

    public void returnLastValue()
    {
      int last = grades[size - 1];
      System.out.println(last);
    }

    public void returnAverage()
    {
        float result = 0;
        float modulo = grades.length;
        float avrg;

        for(int i = 0 ; i < grades.length; i++)
        {
            result += grades[i];

        }
        System.out.println("Sum of all grades: " + result);
        avrg = result / modulo;
        System.out.println("Average: " + avrg);
    }



}
