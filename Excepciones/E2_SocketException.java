
import java.io.*;
import java.net.URL;

public class E2_SocketException {

    public static void main(String[] args) {
        try {
            downloadXML("https://example.com/data.xml", "data.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
