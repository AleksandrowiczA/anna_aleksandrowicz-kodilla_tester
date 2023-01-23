public class Counting {
    public static void main(String[] args){

        Addition();
        Multiplication(2, 3, 4);
        if (1 > 2){
            System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa.");
        }

    }

    public static void Addition(){
        int first = 4;
        int second = 7;
        int result = first + second;
        System.out.println(result);

    }

    public static void Multiplication(int a, int b, int c){
        int result = a * b * c + Division(10, 5);
        System.out.println(result);
    }

    public static Integer Division(int a, int b){
        int result = a / b;
        return result;
    }


}
