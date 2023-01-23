package Seminar3.terminal;

public class Menu {
    private final static String output = "Введите команды:\n" +
    "\t'" + Command.ADD + "' для создания\n" +
    "\t'" + Command.DEL + "' для удаления";

    public static void display(){
        System.out.println(output);
    }
}
