package com.pb.karpjuk.hw8_test;

public class testRegex {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9]{5,20}";

        String[] passes = { "qwertopaisdfghjk","sfd,jnbd," };
        for (String string : passes)
            if (!string.matches(regex))
                System.out.println("Не проходит: " + string);

    }
}
