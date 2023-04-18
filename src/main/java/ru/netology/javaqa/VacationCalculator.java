package ru.netology.javaqa;

public class VacationCalculator {  // объявляем класс с именем VacationCalculator
    public int calculateVacationMonths(int income, int expenses, int threshold) { // объявляем метод с именем calculateVacationMonths, имеет три аргумента "income" - доход, "expenses" - расходы, и "threshold" - пороговое значение. Возвращает целое значение, т.к. указан тип "int"
        int remainingMoney = 0; // изначально на счету 0
        int vacationMonths = 0; // счетчик количество месяцев отдыха

        for (int i = 1; i <= 12; i++) { // проходим по месяцам года
            if (remainingMoney >= threshold) { // если на счету есть достаточно денег для отдыха, то
                vacationMonths++; // увеличиваем количество месяцев отдыха, затем
                remainingMoney -= expenses; // уменьшаем остаток денег на ежемесячные расходы
                remainingMoney -= expenses * 3; // уменьшаем остаток денег на траты на отдых
            } else { // если на счету недостаточно денег для отдыха
                remainingMoney += income; // увеличиваем остаток денег на доход от работы
                remainingMoney -= expenses; // уменьшаем остаток денег на ежемесячные расходы
            }
        }

        return vacationMonths;
    }
}