public class E1_ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        
        int array[] = new int[] { 4, 1, 2 };

            // Accedemos al elemento en la 2da pocicion 
            System.out.println("El elemento en el índice 2 es " + array[2]);

            // Accedemos a un elemento fuera de la array

            System.out.println("El elemento en el índice -1 es " + array[3]);

    }
    
}
