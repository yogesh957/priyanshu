public class bank {

   private int bankBalance;
    private int bankPin;

    public void setBankBalance(int bankBalance) {

            this.bankBalance = bankBalance;
    }
    public void setBankPin(int bankPin) {
        this.bankPin = bankPin;
    }

    public int getBankBalance() {
        return bankBalance;
    }
}

class check {

    public static void main(String[]args) {
        bank Axis = new bank();
        Axis.setBankPin(030412);
        Axis.setBankBalance(2000);
        System.out.println(Axis.getBankBalance());

    }
}
