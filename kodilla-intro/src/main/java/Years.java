public class Years {
    public static void main(String[] args){

       goodYear(2020);

    }

    public static void goodYear(int year){

        if (year%4 == 0 && year%100 != 0 || year%400 == 0)
        {
            System.out.println("Ten rok jest przestepny");
        }else{
            System.out.println("Ten rok nie jest przestepny!");
        }
    }

}
