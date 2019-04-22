package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2.
 *
 * <p>Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Point<Float> point1 = new Point<>(21F, 43F);
        Point<Integer> point2 = new Point<>(32, 62);

        double distance = point1.distanceTo(point2);
        //System.out.println(distance);

         /*
         * TODO(Студент): Выполнять задание №2
         *
         * 1. Выполнить обобщение класса Point с использованием
         *    шаблона так, чтобы в качестве координат точки
         *    можно было использовать любые числовые типы данных.
         *
         * 2. Создать  экземпляр типа Point:
         *
         *    - Создать точку, использующую для описания координат
         *      значения типа float.
         *
         *    - Создайте точку, использующую для описания координат
         *      значение типа int.
         *
         * 3. Вычислите дистанцию между точками.
         *
         * 4. С использованием отладчика проверьте корректность
         *    работы программы.
         */
    }
}
