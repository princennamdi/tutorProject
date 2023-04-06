public class Accounts {

    private int id;

    private String accName;

    private double accBalance;


    public Accounts(int id, String accName, double accBalance) {
        this.id = id;
        this.accName = accName;
        this.accBalance = accBalance;
//        System.out.println("A new account has been created");
//        System.out.println("==============================");

    }

    public int getId() {
        return id;
    }

    public String getAccName() {
        return accName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", accName='" + accName + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }

    public void credit(double amount) {
        this.accBalance += amount;
        String status = amount + " Was added successfully, new Balance = " + this.accBalance;
        System.out.println(status);
    }

    public void debit(double amount) {
        if (amount > this.accBalance) {
            System.out.println("Insufficient balance");
        } else {
            this.accBalance -= amount;
            String status = amount + " Was deducted successfully, new Balance = " + this.accBalance;
            System.out.println(status);
        }

    }

    public void transfer(Accounts to, double amount){
        if(amount >  this.accBalance){
            System.out.println("Insufficient balance");
        }else{
            this.debit(amount);
            to.credit(amount);
            String status = amount + " was transferred from " + this.accName + " to " + to.accName;
            System.out.println(status);

        }

    }

    public void changeAccNo(int newAccNo){
        if(this.id == newAccNo){
            System.out.println("New Account Name is same as old account name!");
        }else{
            this.id = newAccNo;
        }
        this.id = newAccNo;
    }

    public void changeAccName(String newAccName){
        this.accName = newAccName;
        System.out.println("Account details successfully changed");
    }

    public void changeAccDetails(String newAccName, int newAccNo){
        this.accName = newAccName;
        this.id = newAccNo;
        System.out.println("Account details have been successfully changed");
        System.out.println("Your new account name is: "+ this.accName + ". " + "Your new account number is: " + this.id);
    }



}
