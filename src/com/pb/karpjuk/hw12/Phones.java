package com.pb.karpjuk.hw12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Phones {

    private String clientFIO;
    private String birthDate;
    private String phoneNum;
    private String address;
    private String dtEdit;

    public Phones() {

        this.dtEdit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public Phones(String clientFIO, String birthDate, String address, String phoneNum) {

        this.clientFIO = clientFIO;
        this.birthDate = birthDate;
        this.phoneNum = phoneNum;
        this.address = address;
        this.dtEdit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public Phones(String clientFIO, String birthDate, String address, String phoneNum, LocalDateTime dtEdit) {

        this.clientFIO = clientFIO;
        this.birthDate = birthDate;
        this.phoneNum = phoneNum;
        this.address = address;
        this.dtEdit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    //clientFIO
    public String getClientFIO() {

        return clientFIO;
    }

    public void setClientFIO(String clientFIO) {

        this.clientFIO = clientFIO;
        this.dtEdit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    //birthDate
    public String getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(String birthDate) {

        this.birthDate = birthDate;
        this.dtEdit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    //phoneNum
    public String getPhoneNum() {

        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {

        this.phoneNum = phoneNum;
        this.dtEdit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    //address
    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
        this.dtEdit = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    //dtEdit
    public String getDtEdit() {

        return dtEdit;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("ClientFIO: " + getClientFIO() + " ");
        stringBuilder.append("PhoneNum: " + getPhoneNum() + " ");
        stringBuilder.append("BirthDay: " + getBirthDate() + " ");
        stringBuilder.append("Address: " + getAddress() + " ");
        stringBuilder.append("DtEdit: " + getDtEdit() + " ");

        return stringBuilder.toString();
    }

}

