import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        // lambda para multiplicacao
        BiFunction<Integer, Integer, Integer> multiplicar = (x, y) -> x * y;
        // lambda para divisao
        BiFunction<Integer, Integer, Integer> dividir = (x, y) -> x / y;
        // lambda para soma
        BiFunction<Integer, Integer, Integer> somar = (x, y) -> x + y;
        // lambda para subtracao
        BiFunction<Integer, Integer, Integer> subtrair = (x, y) -> x - y;

        executar(10,5, multiplicar);

        executar(10,5, dividir);

        executar(10,5, somar);

        executar(10,5, subtrair);


        }
        public static void executar(Integer x, Integer y, BiFunction<Integer, Integer, Integer>biFunction){
        Integer resultado = biFunction.apply(x,y);
            System.out.println("Resultado: " + resultado);
    }
}