public class PrintColor {

    public String printChoosen()
    {
        String userSelected = ChooseColor.getColor();
        String result = " ";
        System.out.println("Regarding to the first letter you entered the color is: ");

        switch (userSelected)
        {
            case "B":
                result = "Blue";
                break;
            case "G":
                result = "Green";
                break;
            case "V":
                result = "Violet";
                break;
            case "P":
                result = "Purple";
                break;
            default:
                System.out.println("The letter you choose has no name in database :(");
        }
        System.out.println(result);
        return result;

    }

}
