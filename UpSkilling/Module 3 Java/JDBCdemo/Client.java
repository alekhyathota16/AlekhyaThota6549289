package JDBCdemo;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 6000);

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        out.println("Hello Server");

        s.close();
    }
}