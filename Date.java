
public class Date
{
    // instance variables - replace the example below with your own
    private int month;
    private int date;
    private int year;
   
    public Date()
    {
        // initialise instance variables
        month = 1;
        date = 19;
        year = 2022;


    }
    public int showDate()
    {
        return  date;

    }
    public int showMonth(){
        return month;
    }
    public int showYear(){
      return year;
    }
    public void showFullDate(){
        System.out.println("Todays date is "+ date + "." + month + "." + year);

    }
}
