//Tester class for output
public class instrumentTester
{
    public static void main(String[] args)
    {
        Guitar g = new Guitar();
        Violin v = new Violin();
        Keyboard k = new Keyboard();
        g.play();
        g.adjust();
        g.compose();
        v.play();
        v.adjust();
        v.compose();
        k.play();
        k.adjust();
        k.compose();
    }
}
         