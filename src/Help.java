public class Help {
    String massage = " help - справка \n mem - создать надпись на картинке \n exit - выход";

    public Help() {
        this.massage = massage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.massage==obj)return true;
        return super.equals(obj);
    }

    public void printHelp(){
        System.out.println(massage);
    }
}

