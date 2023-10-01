public class Instruction {
    private int numberInstruction;
    private String nameInstruction;
    private UserInput userInput = new ConsoleUserInput();
    private UserOutput userOutput = new ConsoleUserOutput();

    public Instruction(int numberInstruction, String nameInstruction){
        this.numberInstruction = numberInstruction;
        this.nameInstruction = nameInstruction;
    }

    @Override
    public String toString() {
        String text = "";
        text += this.numberInstruction;
        text += "  - " + this.nameInstruction;
        return text;
    }
}
