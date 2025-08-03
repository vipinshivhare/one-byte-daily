package oops;
// Encapsulation
class myWallet{
    private int myMoney;

    // public myWallet(int money){
    //     this.myMoney = money;
    // }

    public int getmyMoney(){
        return myMoney;
    }

    public void setmyMoney(int Money){
        myMoney += Money;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        // myWallet mywallet = new myWallet(20);
    
        // mywallet.setmyMoney(20);
        // mywallet.setmyMoney(20);
        // System.out.println(mywallet.getmyMoney());

        myWallet mywallet = new myWallet();
    
        mywallet.setmyMoney(20);
        mywallet.setmyMoney(20);
        System.out.println(mywallet.getmyMoney());
    }

}