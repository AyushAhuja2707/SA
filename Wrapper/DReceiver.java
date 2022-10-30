import java.net.*;

public class DReceiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Waiting for sender to send message");
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.print(str);
        ds.close();
        System.out.println("Message received Successfully..");
    }
}
