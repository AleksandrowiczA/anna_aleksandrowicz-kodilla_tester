public class User {
    String name;
    int age;

    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args)
    {
        User anna = new User("Anna", 20);
        User wojtek = new User("Wojtek", 15);
        User maria = new User("Maria", 65);
        User agata = new User("Agata", 52);
        User krzysiek = new User("Krzysiek", 10);
        User maja = new User("Maja", 31);

        User[] users = {anna, wojtek, maria, agata, krzysiek, maja};
        int result = 0;
        int tableLength = users.length;
        int avrg;

        for(int i = 0; i < users.length; i++)
        {
            result = result + users[i].GetAge();
        }
        avrg = result/tableLength;

        for(int i = 0; i < users.length; i++)
        {
            if(users[i].GetAge() < avrg)
            {
                System.out.println(users[i].GetName());
            }
        }
    }
    public String GetName()
    {
        return name;
    }
    public Integer GetAge()
    {
        return age;
    }
}
