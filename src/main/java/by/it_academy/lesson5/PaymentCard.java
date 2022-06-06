/* Создать класс PaymentCard с полем double balance - баланс на карте.
 Создать конструктор, который принимает начальный баланс и сохраняет его в поле balance.
 Переопределить метод String toString(), который будет возвращать строку 'The card has balance of X',
  где Х = балансу карты. Создать методы: void eatAffordably() - вычитает из баланса 2.6;
   void eatHeartily() - вычитает из баланса 4.6.
   При этом эти методы не должны вычитать, если конечная сумма будет ниже 0.
    Создать метод void addMoney(double amount) - добавить сумму к балансу.
При это, если в метод передадут отрицательное число - баланс не должен измениться в этом случае.
В main методе протестировать методы PaymentCard.
 */
package by.it_academy.lesson5;

public class PaymentCard {
    double balance;

    public PaymentCard(double balance){
        this.balance = balance;

    }
     public String  toString(){
String cardBalance = "The card has a balance of " + balance;


        return cardBalance;

    }
public void eatAffordably(){
    if(balance<=2.6){
        balance = balance;}
    else{ balance-=2.6;
    }
}
public void eatHeartily(){
    if(balance<=4.6){
        balance = balance;}
    else{ balance-=4.6;
    }

}
    void addMoney(double amount){
        if(amount>0){
        balance = balance + amount;}


    }

    public static void main(String[] args) {
        PaymentCard cardBalance = new PaymentCard(500);

        System.out.println(cardBalance.toString());
        cardBalance.eatAffordably();
        System.out.println(cardBalance.balance);
        cardBalance.eatHeartily();
        System.out.println(cardBalance.balance);
        cardBalance.addMoney(500);
        System.out.println(cardBalance.balance);


    }
}
