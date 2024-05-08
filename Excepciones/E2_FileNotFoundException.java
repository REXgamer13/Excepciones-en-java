import java.io.File;
import java.util.Scanner;
public class E2_FileNotFoundException {

    public static void main(String[] args) {
    
        File archivo = new File("archivo_no_existente.txt");
        Scanner scanner = new Scanner(archivo);

    }

}
