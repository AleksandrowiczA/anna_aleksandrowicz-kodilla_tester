public class Application {
    String name;
    double age;
    double height;
    public Application(String name, double age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args)
    {
        Application user = new Application("Adam", 40.5, 178);

        if(user.GetName() != null)
        {
            if(user.GetAge() > 30 && user.GetHeight() >160)
            {
                System.out.println("User is older than 30 and taller than 160cm");
            }else
            {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
    public String GetName()
    {
        return name;
    }
    public double GetAge()
    {
        return age;
    }
    public double GetHeight()
    {
        return height;
    }
}
