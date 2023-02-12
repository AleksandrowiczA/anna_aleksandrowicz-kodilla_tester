public class Notebook {

    int weight, price, year;

   public Notebook(int weight, int price, int year)
   {
       this.weight = weight;
       this.price = price;
       this.year = year;
   }

    public void checkPrice() {
        if (price < 600)
        {
            System.out.println("This notebook is very cheap.");
        }
          else if(price >= 600 && price <= 1000)
          {
            System.out.println("The price is good");
          }
          else if(price > 1000)
          {
              System.out.println("This notebook is expensive");
          }
    }

    public void checkWeight()
    {
        if (weight < 600)
        {
            System.out.println("This notebook is so light");
        }
        else if(weight >= 600 && price <= 1000)
        {
            System.out.println("This notebook is not so heavy");
        }
        else if(weight > 1000)
        {
            System.out.println("This notebook is really heavy");
        }
    }

    public void checkYearPrice()
    {
       if(price <= 600 && year <= 2000)
       {
           System.out.println("Laptop from this year has a good price");
       }
       else if(price > 600 && price <= 1000 && year >= 2000 && year <= 2008 )
       {
           System.out.println("Such an old laptop shouldn't be so expensive");
       }
       else if(price > 1000 && price <= 1800 && year > 2000 && year <= 2007)
       {
           System.out.println("This laptop has a nice price");
       }
       else if(price > 1800 && price <= 3000 && year > 2007 && year <= 2019)
       {
           System.out.println("For this year, laptop should be a little bit cheaper");
       }
       else
       {
           System.out.println("Entered values do not match any condition");
       }

    }


}

