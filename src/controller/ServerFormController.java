/**
 * @author :Hansaka Malshan
 * created 5/30/2023---1:16 AM
 */
package controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerFormController {
    //   private final ServerSocket serverSocket;
    private  static ArrayList<ClientHandler> clientHandlerArray =new ArrayList<>();



    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(18000);
        Socket accept;

        while(true){
            System.out.println("Weiting for client");
            accept =serverSocket.accept();
            System.out.println("new member coNECTD");
            ClientHandler clientHandler=new ClientHandler(accept, clientHandlerArray);
            clientHandlerArray.add(clientHandler);
            clientHandler.start();

        }
    }
}


