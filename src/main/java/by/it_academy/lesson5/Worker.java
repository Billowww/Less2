/*package by.it_academy.lesson5;

public class Worker {
    String name;
    int salary;

    public Worker(String name2, int salary3) {
        this.name = name2;
        this.salary = salary3;
    }

    public Worker(String name) {
        this(name, 0);

    }                                       //Это конструктор , не имеет возращаемого значения(прим int )

    public void raiseSalary(int amount){
        salary+= amount;
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("Nikolay", 100);              //Переменная будет типом класса , Worker- тип переменной и название класса
// new Worker - вызываем конструктор, указываем имя и зарплату
        System.out.println(worker1.name);
        System.out.println(worker1.salary);
        worker1.raiseSalary(100);
        System.out.println(worker1.salary );


        Worker worker2 = new Worker("Nikolay");              //Переменная будет типом класса , Worker- тип переменной и название класса
// new Worker - вызываем конструктор, указываем имя и зарплату
        System.out.println(worker2.name);
        System.out.println(worker2.salary);
        worker2.raiseSalary(10);
        System.out.println(worker2.salary);
        new Worker()


    }
}
*/