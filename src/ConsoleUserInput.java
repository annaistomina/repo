import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private UserOutput userOutput = new ConsoleUserOutput();
    private Help help = new Help();
    private Mem mem = new Mem();

    @Override
    public String read() throws IOException {
        Scanner scanner = new Scanner(System.in);
        userOutput.print("Введите команду:");
        String x = null;
        boolean isExit = false;
        while (!isExit) {
            x = scanner.nextLine();
            isExit = x.equals("exit");

            if (x.equals("help")) {
                help.printHelp();
                } else {
                    if (x.equals("mem")) {
                        mem.printMem();
                    } else {
                        if (x.equals("exit")){
                            System.out.println("До свидания!");
                            break;
                        }else {
                            System.out.println("Ошибка! Команда не существует");
                        }
                    }
                }

            }return x;

        }

    }





