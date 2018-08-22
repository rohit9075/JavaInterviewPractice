package Polymorphism;

class FactoryMethod {

    static Bank getObject(String bank) {

        Bank bank1 = new Bank();

        if ("SBI".equals(bank)) {
            bank1 = new SBI();
        } else if ("PNB".equals(bank)) {
            bank1 = new PNB();
        } else if ("ICICI".equals(bank)) {
            bank1 = new ICICI();
        } else {
            new Bank();
        }

        return bank1;
    }
}
