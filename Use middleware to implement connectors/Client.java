public class Client {
public static void main(String [] args)
{
interfaceCalculator i=new Server();
System.out.println(i.add(12,13));
System.out.println(i.sub(12,12));
}
}