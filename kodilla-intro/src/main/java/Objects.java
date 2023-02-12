public class Objects {

    String name;
    int age;
    String  surname;

    public Objects(String  name, int age, String  surname)
    {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public static void main(String[] args)
    {
        Objects user1 = new Objects("Anna", 12, "Zalewska");
        Objects user2 = new Objects("Wojtek", 45, "Kowalski");
        Objects user3 = new Objects("Agata", 34, "Lacka");
        Objects user4 = new Objects("Krzysztof", 5, "Dupa");

        //Objects[] users = {user1, user2, user3, user4};

        System.out.println(user1.GetAge());

    }

    public Integer GetAge()
    {
        return age;
    }

}
