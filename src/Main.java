public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int clientOS=0;
        if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        System.out.println("Задача 2");
        int clientDeviceYear=2013;
        if (clientOS==1&&clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }else if (clientOS==1&&clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else if (clientOS!=1&&clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Задача 3");
        int year=1586;
        if (year<1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if ((year%400==0)||(year%4==0&&year%100!=0)) {
            System.out.println(year+" год является Високосным.");
        }else {
                System.out.println(year+" год не является Високосным.");
            }

        System.out.println("Задача 4");
        int deliveryDistance=20;
        int days=1;
        if (deliveryDistance>100){
            System.out.println("Доставка не осуществляется.");
        }else if (deliveryDistance<=20){
                System.out.println("Время доставки "+days+" день.");
        } else if (deliveryDistance>20&&deliveryDistance<=60) {
                System.out.println("Время доставки "+(days+1)+" дня.");
        }else {
                System.out.println("Время доставки "+(days+2)+" дня.");
        }

        System.out.println("Задача 5");
        int monthNumber =14;
        switch (monthNumber){
            case 12 :
            case 1:
            case 2:
                System.out.println("Месяц "+monthNumber+" относится к зиме.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц "+monthNumber+" относится к весне.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц "+monthNumber+" относится к лету.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц "+monthNumber+" относится к осени.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}