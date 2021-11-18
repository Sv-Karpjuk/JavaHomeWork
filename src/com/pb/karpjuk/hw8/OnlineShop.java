package com.pb.karpjuk.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login;
        String password;
        String confirmPassword;

        Scanner scan = new Scanner(System.in);

        //Реєстрація
        System.out.println("Привіт! Запрошуємо до реєстрації на сайті...");

        System.out.print("\nПридумайте login: ");
        login = scan.nextLine();

        System.out.print("Придумайте password: ");
        password = scan.nextLine();

        System.out.print("Повторно password: ");
        confirmPassword = scan.nextLine();

        // for speedtest
        //login = "dn180276ksj";
        //password = "password";
        //confirmPassword = "password";

        Auth user = new Auth();

        try {
            user.signUp(login, password, confirmPassword);

        } catch (WrongLoginException err1) {
            System.out.println(err1);
            return;

        } catch (WrongPasswordException err2) {
            System.out.println(err2);
            return;
        }

        //  Авторизація

        // for speedtest
        //login = "dn180276ksj";
        //password = "password";

        System.out.println("\nАвторизація на сайті...");

        System.out.print("Введіть login: ");
        login = scan.nextLine();

        System.out.print("Введіть password: ");
        password = scan.nextLine();

        try {
            user.signIn(login, password);

        } catch (WrongLoginException err3) {
            System.out.println(err3);

            }
    }
}

/*
Создать класс OnlineShop с методом main.
В main создать один объект класса Auth.
Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
Обработать исключения методов signUp signIn с помощью блоков try-catch.
*/
