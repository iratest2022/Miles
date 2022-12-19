# Задание 1. Мили — модернизация (обязательное к выполнению)
Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать приложение для расчёта миль. Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в Main мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

#Этапы выполнения
Создайте класс BonusMilesService (File -> New -> Java Class, вводите название и нажимаете Enter).
Определите в нём метод calculate, который:
принимает на вход один параметр: cost типа int;
анализируя значение переданного параметра, возвращает рассчитанное количество миль (тип — int).
Разместите следующий код в классе Main:

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
Убедитесь, что выводимое в консоль значение соответствует результатам предыдущей версии приложения.

