import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args){
        int port = 3000;
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server has been started:");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected:");

            BufferedReader in = new BufferedReader(new InputStreamReader
                    (clientSocket.getInputStream()));

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String reply = in.readLine();
            System.out.println("Client says:" + reply);

            out.println("Hello client, Your message have been received");

            serverSocket.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}