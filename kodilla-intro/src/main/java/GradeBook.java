public class GradeBook {

    public static void main(String[] args)
    {

        Grades grades = new Grades();

        grades.add(7);
        grades.add(8);
        grades.add(3);
        grades.add(3);
        grades.add(2);

        grades.returnLastValue();
        grades.returnAverage();


    }
}
