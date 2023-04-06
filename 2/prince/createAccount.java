public class createAccount {


    public static void main(String[] args) {


        Accounts prince = new Accounts(200, "Prince Orafu", 1000000.00);
        Accounts ekene = new Accounts(201, "Ekene Okolo", 249);

//        System.out.println(prince.toString());
//        prince.changeAccName("Prince Blighter");
//        System.out.println(prince.toString());

        System.out.println("Previous Details: " + prince.toString());
        prince.changeAccDetails("Prince Blighter", 209);
        System.out.println(prince.toString());
//        System.out.println(prince.getAccBalance());
//        System.out.println(ekene.getAccBalance());
//
//
//        prince.transfer(ekene, 230000);
//
//
//        System.out.println(prince.getAccBalance());
//        System.out.println(ekene.getAccBalance());



//        System.out.println("The account ID is: " + prince.getId());
//        System.out.println("The account name is: " + prince.getAccName());
//        System.out.println("The account balance is: " + prince.getAccBalance());
//        System.out.println("==============================");

//        prince.credit(200000);
//        prince.debit(500000.2);



    }
}
