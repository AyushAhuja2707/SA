import java.rmi.*;
public interface IHello extends Remote{
public String message() throws RemoteException;
}