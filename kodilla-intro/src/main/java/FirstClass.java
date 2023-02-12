public class FirstClass {
    public static void main(String[] args)
    {
        Notebook notebook = new Notebook(589, 1700, 2003);
        System.out.println("Weight: " + notebook.weight + " " + "Price: " + notebook.price + " " + "Year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();
        System.out.println();

        Notebook heavyNotebook = new Notebook(2000, 2200, 2017);
        System.out.println("Weight: " + heavyNotebook.weight + " " + "Price: " + heavyNotebook.price + " " + "Year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();
        System.out.println();

        Notebook oldNotebook = new Notebook(1600, 500, 1998);
        System.out.println("Weight: " + oldNotebook.weight + " " + "Price: " + oldNotebook.price + " " + "Year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();
    }
}
