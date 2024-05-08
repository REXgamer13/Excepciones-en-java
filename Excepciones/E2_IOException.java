import java.io.File;
import java.io.FileReader;

public class E2_IOException {

    public static void main(String[] args) {

        File archivo = new File("archivo_inexistente.txt");
        
            FileReader lector = new FileReader(archivo);
            lector.close();

    }   
}
