package day07.inherit;

public class Mage extends Player {

    int exp;

    int mana; //마력게이지(마법사)

    public Mage(String nickname) {
       super(nickname);
        this.mana =100;

    }



    //썬더볼트 (개별기능)
    public void thunderBolt(){

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("#mana :"+this.mana);
    }
}
