/*
 Write an abstract class ‘Instrument’ which will
 have abstract method ‘play’, ‘adjust’ & concrete
 method ‘compose’. 

Use the abstract class ‘Instrument’ to create
class ‘Guitar’, ‘Keyboard’ & ‘Violin’. 

Create instance (object) of every classes
invoking(calling) every method. The method 
will print any message with ‘Instrument name’
and ‘Purpose’, 

 */
public abstract class Instrument
{
    public abstract void play();
    public abstract void adjust();
    public void compose()
    {
        System.out.println();
    }
}
   