public class ConsoleUserOutput implements UserOutput{

    @Override
    public void print(String massage) {
        System.out.println(massage);
    }
}
