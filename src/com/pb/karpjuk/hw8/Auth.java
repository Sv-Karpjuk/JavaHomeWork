package com.pb.karpjuk.hw8;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        this.login = "";
        this.password = "";

        if (!(login.length() >= 5 & login.length() <= 20)) {
            throw new WrongLoginException("Довжина Login від 5 до 20 символів! У вас: " + login.length() + "...");
        }

        if (!login.matches("[a-zA-Z0-9]{5,20}")) {
            throw new WrongLoginException("Login повинен містити лише латинські літери та цифри!");
        } else {
            this.login = login;
        }

        if (password.length() < 5) {
            throw new WrongPasswordException("Довжина Password від 5 символів! У вас: " + password.length() + "...");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Відрізняються confirmPassword та password!");
        }

        if (!password.matches("[a-zA-Z0-9_]{5,}")) {
            throw new WrongPasswordException("Password повинен містити лише латинські літери та цифри!");
        } else {
            this.password = password;
        }
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (!(login.equals(this.login) & password.equals(this.password))) {
            throw new WrongLoginException("Користувач по login + password не знайдений!");
        }
        System.out.println("\n" + login + "! Вітаю Вас на нашому мегасайті!");
    }
}
    /*
     - signUp (регистрация на сайте) принимающий login, password, и confirmPassword
    Проверяет параметр login, длинна должна быть от 5 до 20 символов.
    Login должен содержать только латинские буквы и цифры.
    Если логин не соответствует требованиям нужно выбросить WrongLoginException.
    Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания.
    Также password и confirmPassword должны совпадать.
    Если password не соответствует требованиям нужно выбросить WrongPasswordException.
    Если проверки все пройдены успешно записать в свои поля значение login и password.
    Так сохраняем пользователя :)

    - signIn (вход на сайт) принимающий login и password.
    Проверяет что login и password соответствуют значениям из полей класса.
    Если нет - выбрасывает исключение WrongLoginException.
    */
