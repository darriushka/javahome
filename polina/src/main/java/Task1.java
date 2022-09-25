public class Task1 {
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table() {
        //Ваше решение здесь
        for(int i=1; i<10;i++)
            for(int j=1; j<10;j++)
                System.out.println(i+"*"+j+"="+i*j);

    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n) {
        //Ваше решение здесь
        int s=0;
        while (n!=0) {
            s += (n % 10);
            n=n/10;
        }
        return s;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        //Ваше решение здесь
        if (year %100==0 && year %400==0)
            return true;
        else if(year %4==0 && year %100!=0)
            return true;
        else if(year %100==0)
            return false;
        else
            return false;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n) {
        //Ваше решение здесь
        if (n.equals("Понедельник"))
            return 1;
        if (n.equals("Вторник"))
            return 2;
        if (n.equals("Среда"))
            return 3;
        if (n.equals("Четверг"))
            return 4;
        if (n.equals("Пятница"))
            return 5;
        if (n.equals("Суббота"))
            return 6;
        if (n.equals("Воскресенье"))
            return 7;
        return 0;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array) {
        //Ваше решение здесь
              /*  for (int i=0;i<array.length;i++){
                    System.out.print(array[i]+" ");
                }*/

    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array) {
        //Ваше решение здесь
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array) {
        //Ваше решение здесь
        boolean s=false;
        while(!s){
            s=true;
            for (int i=0;i<(array.length-1);i++){
                if (array[i]>array[i+1]){
                    int x=array[i];
                    array[i]=array[i+1];
                    array[i+1]=x;
                    s=false;
                }
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args) {
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1, 5, 3, 7, 10, 2, 5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1, 5, 3, 7, 10, 2, 5}, {1, 5, 3, 7, 10, 2, 5}};
        printArray(array2D);
    }
}
