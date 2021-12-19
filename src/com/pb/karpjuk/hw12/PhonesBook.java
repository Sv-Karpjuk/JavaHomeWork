package com.pb.karpjuk.hw12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhonesBook extends ArrayList<Phones> {

    private ArrayList<Phones> phones;
    private ArrayList<PhonesBook> phonesBook;

    public ArrayList<PhonesBook> getBooks() {
        return phonesBook;
    }

    public PhonesBook(){}

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Phones phone : this) {
            stringBuilder.append("----------------------------\n");
            stringBuilder.append("ClientFIO: " + phone.getClientFIO() + "\n");
            stringBuilder.append("PhoneNum: " + phone.getPhoneNum() + "\n");
            stringBuilder.append("BirthDay: " + phone.getBirthDate() + "\n");
            stringBuilder.append("Address: " + phone.getAddress() + "\n");
            stringBuilder.append("DtEdit: " + phone.getDtEdit() + "\n");
        }

        return stringBuilder.toString();
    }

}
/*
    Создать в пакете hw11 консольное приложение "Телефонная книга".
        Каждый элемент должен иметь:
        ФИО
        дата рождения
        телефоны (количество не ограничено)
        адрес
        дата и время редактирования

 */
