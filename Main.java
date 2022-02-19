package Task1_2_WorkerLambda;

public class Main {


    public static void main(String[] args) {

        System.out.println("Домашнее задание к занятию 1.1: " +
                "Лямбда-выражения и функциональные интерфейсы\n" +
                "Задача 2: Работяга\n");

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerE = System.out::println;

        Worker worker = new Worker(listener, listenerE);
        worker.start(33);

    }

}
