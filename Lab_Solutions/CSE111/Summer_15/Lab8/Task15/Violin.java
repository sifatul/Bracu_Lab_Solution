public class Violin extends Instrument
{
    String name = "Violin";
    String purpose = "music";
    
    public void play()
    {
        System.out.println("This "+name+" is used for "+purpose);
    }
    
    public void adjust()
    {
        System.out.println("This "+name+" is used for tuning");
    }
    
    public void compose()
    {
        System.out.println("This "+name+" is used for fun");
    }
}