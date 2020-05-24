interface Hello
{
    public void show();
}

interface Hi
{
    public void put();
}
public class Demo1
{
    public static void main(String args[])
    {
        Hello Gauttam = () -> System.out.println("Hello World");
        Gauttam.show();

        Hi g = () -> System.out.println("Hi");
        g.put();
    }
}