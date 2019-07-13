package lection12;

class Employer {

    String name;
    String position;
    int money;
    String date;
    String boss;

    Employer(String name, String position, int money, String date, String boss) {
        this.name = name;
        this.position = position;
        this.money = money;
        this.date = date;
        this.boss = boss;
    }
    Employer (){
        name = "Имя сотрудника";
        position = "должность сотрудника";
        money = 0;
        date = "Дата принятия на работу";
        boss = "начальник сотрудника";
    }
}

public class Task04 {
    public static void main(String arg[]) {
        Employer e1 = new Employer ("Василий Васильев", "манагер", 5000, "10.05.2017", "Николай Иванович");
        Employer e2 = new Employer ("Николай Николаев", "Главный манагер", 7000, "10.08.2017", "Николай Иванович");
        Employer e3 = new Employer ("Александр Александров", "кассир", 3000, "11.12.2016", "Николай Иванович");
        Employer e4 = new Employer ("Нкита Васюков", "водитель", 4300, "10.05.2018", "Николай Иванович");
    }
}
