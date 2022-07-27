package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Ivan";
        post.subscription = true;
        post.passport = "1234 № 12345678";
        post.patronymic = "Ivanovich";
        post.surname = "Petrov";
        post.phone = "+7(999)9999999";

    }
}