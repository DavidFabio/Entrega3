package mates;

import java.util.List;
import java.util.Random;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Funciones {

    //Ejercicio12

    //Las expresiones Lambda son expresiones las cuales se usan cuando necesitamos hacer algo simple en lugar de tener que nombrar directamente a la función.

    //Ejercicio13
    public static double integrateRectangles(DoubleUnaryOperator function, double a, double b, int n, double h) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double x = a + i * h;
            suma += function.applyAsDouble(x);
        }
        return suma * h;
    }

    //Ejercicio14
    
    public static void apartado1(){
        System.out.println("1:");
        IntStream.of(1, 2, 3, 4, 5).forEach(System.out::println);
    }
    
    public static void apartado2(){
        System.out.println("2:");
        IntStream.range(1,6).forEach(System.out::println);
    }
    
    public static void apartado3(){
        System.out.println("3:");
        IntStream.iterate(0,n->n+2).limit(5).forEach(System.out::println);
    }
   
    public static void apartado4(){
        Random random = new Random();
        System.out.println("4:");
        random.doubles(10).forEach(System.out::println);
    }
    //Ejercicio15
    
    public static int suma (int n){
        return IntStream.rangeClosed(0,n).sum();
    }
    
    public static int factorial (int n){
        return IntStream.rangeClosed(1,n).reduce(1,(x,y) -> x*y);
    }
    
    public static int potencia (int base, int exponente){
        return IntStream.iterate(base,x -> x).limit(exponente).reduce(1,(x,y) -> x*y);
    }
    
    public static int lista (List<Integer> lista){
        return lista.stream().reduce(0,(x,y) -> x+y);
    }
    
    public static Double media (List<Double> lista){
        return lista.stream().reduce(0.0,(x,y) -> x+y)/lista.size();
    }
    
    public static void desviacion (List<Double> lista){
        lista.stream().reduce(0.0,(x,y) -> x+y);

    }
    
    public static int sumapares (int n){
        return IntStream.rangeClosed(0,n).filter(x -> x % 2 == 0).sum();
    }
    
    public static int listaenteros (List<Integer> lista){
        return lista.stream().filter(x -> x % 2 == 0).reduce(0,(x,y) -> x+y);
    }
    
    public static List obtenerlistaenteros (List<Integer>lista){
        return lista.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }
    
    public static List listapares (int n){
        return IntStream.rangeClosed(0,n).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
    }

    public static int productoescalar (List<Integer>lista1, List<Integer>lista2){
        return IntStream.range(0, lista1.size()).map(i -> lista1.get(i) * lista2.get(i)).sum();
    }
    
    public static int fibonachi (int n){
        IntStream.range(0, n).map(Funciones::fibonachi).findFirst().orElse(0);
        if (n <= 1) {
            return n;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    //Ejercicio16
    public static double calculateIntegral(DoubleUnaryOperator function, double a, double b, int n) {
        double h = (b - a) / n;
        return DoubleStream.iterate(a, x -> x + h).limit(n).map(function).sum() * h;
    }

}