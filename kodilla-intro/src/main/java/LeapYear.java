public class LeapYear {

    public static void main(String[] args) {
        LeapYear(2020);
    }

    public static void LeapYear(int year)
    {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )
        {
            System.out.println("This year is Leap");
        } else{
            System.out.println("This year isn't leap");
        }

    }
}
