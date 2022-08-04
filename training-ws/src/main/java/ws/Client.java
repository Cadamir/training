package ws;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String... args){
        try{
            Socket client = new Socket("localhost", 8080);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF("Ich bin ein Client\n" + client.getLocalSocketAddress());

            DataInputStream input = new DataInputStream(client.getInputStream());
            System.out.println(input.readUTF());
            client.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
