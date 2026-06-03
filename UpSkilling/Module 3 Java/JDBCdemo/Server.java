package JDBCdemo;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);

        Socket s = ss.accept();

        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(s.getInputStream()));

        System.out.println(br.readLine());

        br.close();
        s.close();
        ss.close();
    }
}