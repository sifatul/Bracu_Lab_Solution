public class Guitar extends Instrument
{
    String name = "Guitar";
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