package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by Vydra řičné on 12. 6. 2016.
 */
public class DateServer {
    public static void main(String[] args) throws IOException {
        ServerSocket lisener = new ServerSocket(9090);
       while (true) {
           Socket socket = lisener.accept(); //blokující metoda vrací objekt typu socket, pokud to neuděláme, nezjistíme, že se na liseneru něco stalo, bude pouze přijímat info
           // socket.getOutputStream() - budeme do něj něco vpisovat, výstup
           PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // zabalili jsme outputstream do něčeho, co pracuje se znaky
           out.println(new Date().toString());
           System.out.println("spojení přijato");
           socket.close();
       }
    }

}
//aby server nepřijíml jenom jedno spojení a běžel furt, je potřeba ho hodit do nekonečného cyklu  - jedna možnost while cyklus s true jako parametrem,
// druhá je for cyklus obsahující jenom dva střddníky, ale typicky se používá while-true