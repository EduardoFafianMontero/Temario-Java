public class FuncionSumar {
    // Definimos la funcion sumar
    static int sumar(int a, int b){
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        var resultado_funcion = sumar(arg1, arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);
        resultado_funcion = sumar(10, 20);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }
}
