package study;
interface paymentmethod{
    void pay();
    interface  typeofcard{
        void messageone();
        void messagetwo();
    }
}
class debitcardpayment implements paymentmethod {
    @Override
    public void pay() {
        System.out.println("This is a debitcardpaymtn");
    }


}
class classfortypeofcards implements paymentmethod.typeofcard{
    @Override
    public void messageone() {
        System.out.println("This is of type card SBI BANK");
    }

    @Override
    public void messagetwo() {
        System.out.println("This is of type card INDIAN BANK");
    }
}
class creditcardpayment implements paymentmethod{
    @Override
    public void pay() {System.out.println("This is a creditcardpaymtn");
    }
}
class UPIcardpayment implements paymentmethod{
    @Override
    public void pay() {
        System.out.println("This is a UPIcardpaymtn");
    }
}
public  class dsastudy{


    public static void main(String[] args) {
//        but by using the interface method we can use a new style of using classes
//        paymentmethod is the interface and the creditcard is the constructor
//        this is the interface and the class which implements the interface though that i am creating a obj and then im passing it to a makepayment method
//        it is clear that interface has the template to thr work we are doing and in which we can create the methods for different uses

        paymentmethod pm = new debitcardpayment();
        paymentmethod.typeofcard typeofcardsavailableforpayment = new classfortypeofcards();
        typeofcardsavailableforpayment.messageone();
        typeofcardsavailableforpayment.messagetwo();
//        makepayment(pm);
        pm.pay();
        //this is the normal way of creating a object and implementing it inside another class
//        debitcardpayment dc = new debitcardpayment();
//        dc.pay();
    }

//    this is the explanation in the above code if you use the interface to create a obj and assign it with a specific class contructor it use the repective
//    contructor for the obj
//   we are just using the object to class the method inside the interface
    public static void makepayment(paymentmethod pm ){
        pm.pay();
    }
}
