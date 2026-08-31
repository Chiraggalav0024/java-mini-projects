import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args){
        String url = "localhost";
        int port = 3000;

        try(Socket clientSocket = new Socket(url, port)){
            System.out.println("Server connnected on port" + port);

            BufferedReader in = new BufferedReader
                    (new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            out.println("Hello server");

            String reply = in.readLine();
            System.out.println("Server replied:" + reply);

            clientSocket.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}