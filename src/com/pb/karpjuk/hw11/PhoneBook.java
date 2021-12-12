package com.pb.karpjuk.hw11;

import java.util.ArrayList;
import java.time.LocalDate;

public class PhoneBook extends ArrayList<Phone> {

    public PhoneBook(){}

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Phone phone : this) {
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