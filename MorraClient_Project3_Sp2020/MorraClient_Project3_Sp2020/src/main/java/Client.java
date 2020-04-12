import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.function.Consumer;

import javafx.application.Platform;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client{
	
    String ip ; 
    int port;
    Socket socketClient;
	
	ObjectOutputStream out;
	ObjectInputStream in;
    
	private Consumer<Serializable> callback;
	
	Client(Consumer<Serializable> call, String ip, int port){
		callback = call;
		this.port = port; 
		this.ip = ip;
	}

	public void run() {
		try {
			socketClient = new Socket(ip, port);
		    out = new ObjectOutputStream(socketClient.getOutputStream());
		    in = new ObjectInputStream(socketClient.getInputStream());
		    socketClient.setTcpNoDelay(true);
			}
			catch(Exception e) {}
			
			while(true) {
				try {
					String message = in.readObject().toString();
					callback.accept(message);
				}
				catch(Exception e) {}
			}
		} /* end run() */ 
	
	public void send(String data) {
		try {
			out.writeObject(data); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}  

/*
    class ClientThread extends Thread {

        Socket connection;
        int count;
        ObjectInputStream in;
        ObjectOutputStream out;

        ClientThread(Socket s, int count){
            this.connection = s;
            this.count = count;
        }

        public void updateClients(String message) {
            for(int i = 0; i < clients.size(); i++) {
                ClientThread t = clients.get(i);
                try {
                    t.out.writeObject(message);
                }
                catch(Exception e) {}
            }
        }

        public void run(){

            try {
                in = new ObjectInputStream(connection.getInputStream());
                out = new ObjectOutputStream(connection.getOutputStream());
                connection.setTcpNoDelay(true);
            }
            catch(Exception e) {
                System.out.println("Streams not open");
            }

            updateClients("new client on server: client #"+count);

            while(true) {
                try {
                    String data = in.readObject().toString();
                    callback.accept(new MorraInfo(0, 0, -1, -1, -1, -1, count));
                    updateClients("client #"+count+" said: "+data);

                }
                catch(Exception e) {
                    callback.accept(new MorraInfo(0, 0, -1, -1, -1, -1, count));
                    updateClients("Client #"+count+" has left the server!");
                    clients.remove(this);
                    break;
                }
            }
        }//end of run


    }//end of client thread
    */
    
