public class NumeroParesFor {
    public static void main(String[] args) {
        System.out.println("*** Números Pares usando ciclo for ***");
        for(var i = 0; i <= 20; i++){
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
