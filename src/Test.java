import java.io.IOException;
import java.util.Arrays;

public class Test {
    private Instruction[]instructions;
   private UserInput userInput = new ConsoleUserInput();
   private Mem mem = new Mem();
    private Test(Instruction[]instructions){
        this.instructions = instructions;
           }
    private void runTest() throws IOException {
              for (int i = 0; i<instructions.length; i++) {
            System.out.println(instructions[i]);
        } userInput.read();



    }

    public static void main(String[] args) throws IOException {
        Instruction[]instructions = new Instruction[3];
        instructions[0] = new Instruction(1,"help");
        instructions[1] = new Instruction(2,"mem");
        instructions[2] = new Instruction(3,"exit");
             Test test = new Test(instructions);
        test.runTest();

    }

}
