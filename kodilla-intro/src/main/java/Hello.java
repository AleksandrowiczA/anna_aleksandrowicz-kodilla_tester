public class Hello {
    public static void main(String[] args){

        String example = sayHello();
        int godzina = sayDay();
        System.out.println(godzina);
        System.out.println(example);
    }
    private static String sayHello() {
        String text = "Hello from FirstClass!";
        return text;
    }

    private static Integer sayDay()
    {
        int hour = 12;
        int minute = 24;
        int suma = hour + minute;
        return suma;
    }

    int sum()
    {
        int a = 1;
        int b = 2;
        int result = a + b;
        return result;
    }
}
