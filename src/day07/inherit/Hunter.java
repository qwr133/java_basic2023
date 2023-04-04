package day07.inherit;

public class Hunter extends Player{

    int exp;

    int concentration; //집중력

    public Hunter(String nickname) {
        super(nickname);
        this.concentration =100;

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("#concentration :"+this.concentration);
    }

    public void summonBeast() {

    }


    }

