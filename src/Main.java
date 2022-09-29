public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();

    }
    public static void Task1() {
     /*Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера или телефона,
     а также мобильное приложение. И нам, и клиенту удобнее с телефона пользоваться мобильным приложением.
     Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку на скачивание приложения.
     Но мы не знаем, iOS или Android он использует.

    Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение для обоих вариантов.

    Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)

    При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.

    Например, для iOS оно будет звучать так:

    «Установите версию приложения для iOS по ссылке».

    А для Android так:

    «Установите версию приложения для Android по ссылке».
      */
        System.out.println("\n" + "Задание 1" + "\n");
    int clientOS = 1;
    if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
    }
    public static void Task2 () {
    /*К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона, но и год его создания:
    от этого зависит, подойдет ли приложение для телефона или оно просто не установится.
    Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
    Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
    Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий — операционной
    системы телефона (iOS или Android) и года производства.
    Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
    Например, для iOS оно будет звучать так:
    «Установите облегченную версию приложения для iOS по ссылке».
    А для Android так:
    «Установите облегченную версию приложения для Android по ссылке».
    При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
    Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
     */
    int clientOS = 0;
    int clientDeviceYear = 2015;
    if (clientOS == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }  else {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }
    }




}