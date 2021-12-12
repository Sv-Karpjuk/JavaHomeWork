package com.pb.karpjuk.hw11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) throws JsonProcessingException, FileNotFoundException {

        String choice = "";
        String choiceNew = "";
        String choiceField = "";
        String filePathWrite = "";
        String filePathRead = "";
        String fileScan = "";

        Scanner scan = new Scanner(System.in);
        Phone editPhone = new Phone();
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Phone("Петерсон Іванісов","2000-01-01","Дніпро","0673420774"));
        phoneBook.add(new Phone("Корпенко-Корий Петро","1878-11-12","Дніпро","0991232356"));
        phoneBook.add(new Phone("Васильків Гаврило","1978-06-13","Київ","0449876354"));
        phoneBook.add(new Phone("Яндекс Ольга","1997-12-24","Дніпро","0768765432"));
        phoneBook.add(new Phone("Шиповник Діма","1996-11-15","Київ","0954203830, 0671234567"));
        phoneBook.add(new Phone("Андроїд Миросько","2002-10-30","Дніпро","0973459673"));
        phoneBook.add(new Phone("Айфон Петро","1999-09-21","Київ","0932344556"));
        phoneBook.add(new Phone("Сильна Вероніка","1948-08-26","Дніпро","0734657346"));
        phoneBook.add(new Phone("Петроференц Жека","1994-07-06","Одеса","0664753963"));
        phoneBook.add(new Phone("Япончик Джон","1968-06-09","Івано-Франківськ","0687574938"));

        //show
        System.out.println("-----------------------------------------------------------");
        System.out.println("| Т Е Л Е Ф О Н Н И Й   Д О В І Д Н И К  ver.1.2.20211212 |");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Меню: X Вихід | + Додати елемент | - Видалити елемент | E Редагувати елемент | ");
        System.out.print("F Пошук елемента | = Вивід книги | ");
        System.out.println("S записати у файл | O завантажити з файлу");

        //START
        while (!("X".equalsIgnoreCase(choice)|"Ч".equalsIgnoreCase(choice))) {
            starts:
            System.out.print("\nВиберіть дію ( X | + | - | E | F | = | S | O ): ");
            choice = scan.nextLine();
            int cntSearch = 0;

            //+ Додати елемент
            if ("+".equals(choice)) {
                System.out.println("Дія: додати нового клієнта: ");
                System.out.print("Введіть clientFIO: ");
                choiceNew = scan.nextLine();
                editPhone.setClientFIO(choiceNew);

                System.out.print("Введіть birthDate: ");
                choiceNew = scan.nextLine();
                editPhone.setBirthDate(choiceNew);

                System.out.print("Введіть phoneNum: ");
                choiceNew = scan.nextLine();
                editPhone.setPhoneNum(choiceNew);

                System.out.print("Введіть address: ");
                choiceNew = scan.nextLine();
                editPhone.setAddress(choiceNew);

                phoneBook.add(editPhone);
                System.out.println("Клієнт " + editPhone + "доданий!");
            } // end +

            //F Пошук елемента
            if ("F".equalsIgnoreCase(choice)|"А".equalsIgnoreCase(choice)) {
                System.out.print("Введіть дані для пошуку елемента: ");
                choiceNew = scan.nextLine();
                System.out.println("Результати пошуку: ");
                for (int i = 0; i < phoneBook.size(); i++) {
                    if (phoneBook.get(i).getClientFIO().contains(choiceNew)|
                            phoneBook.get(i).getPhoneNum().contains(choiceNew)|
                            phoneBook.get(i).getAddress().contains(choiceNew)|
                            phoneBook.get(i).getBirthDate().contains(choiceNew)) {
                        System.out.println("id=" + i + " " + phoneBook.get(i));
                        cntSearch ++;
                    }
                }
                if (cntSearch == 0) {
                    System.out.println("Нічого не знайдено :(");
                }
            } // end F

            //E Редагувати елемент
            if ("E".equalsIgnoreCase(choice)|"У".equalsIgnoreCase(choice)) {
                System.out.print("Введіть дані для пошуку елементу для його редагування: ");
                choiceNew = scan.nextLine();
                System.out.println("Результати пошуку: ");
                for (int i = 0; i < phoneBook.size(); i++) {
                    if (phoneBook.get(i).getClientFIO().contains(choiceNew)|
                            phoneBook.get(i).getPhoneNum().contains(choiceNew)|
                            phoneBook.get(i).getAddress().contains(choiceNew)|
                            phoneBook.get(i).getBirthDate().contains(choiceNew)) {
                        System.out.println("id=" + i + " " + phoneBook.get(i));
                        cntSearch ++;
                    }
                }
                if (cntSearch == 0) {
                    System.out.println("Нічого не знайдено :(");
                } else {
                    System.out.println("");

                    int choiceId = -1;
                    boolean notAnInteger = true;
                    String input = "";

                    while (notAnInteger) {
                        System.out.print("Введіть id елемента для редагування ( X Вихід ) : ");
                        input = scan.nextLine();

                        if ("X".equalsIgnoreCase(input) | "Ч".equalsIgnoreCase(input)) {
                            break;
                        }

                        try {
                            choiceId = Integer.parseInt(input);
                            phoneBook.get(choiceId);
                            notAnInteger = false;
                        } catch (NumberFormatException e1) {
                            System.out.println("\u001B[31m" + "УВАГА: id - ціле число!" + "\033[0m");
                        } catch (IndexOutOfBoundsException e2) {
                            System.out.println("\u001B[31m" + "УВАГА: id - число від 0 до " + (phoneBook.size() - 1) + "!" + "\033[0m");
                        }
                    }

                    if (!("X".equalsIgnoreCase(input) | "Ч".equalsIgnoreCase(input))) {

                        choiceField = "";
                        System.out.println("Редагування елементу: " + phoneBook.get(choiceId));
                        System.out.print("Введіть назву поля для редагування ( X Вихід | C clientFIO | B birthDate | P phoneNum | A address ): ");
                        choiceField = scan.nextLine();

                        while (!("X".equalsIgnoreCase(choiceField) | "Ч".equalsIgnoreCase(choiceField))) {

                            if ("C".equalsIgnoreCase(choiceField) | "С".equalsIgnoreCase(choiceField)) {
                                System.out.print("Введіть нове значення clientFIO: ");
                                String choiceFieldValue = scan.nextLine();
                                phoneBook.get(choiceId).setClientFIO(choiceFieldValue);
                                choiceField = "";
                            }
                            if ("B".equalsIgnoreCase(choiceField) | "И".equalsIgnoreCase(choiceField)) {
                                System.out.print("Введіть нове значення birthDate: ");
                                String choiceFieldValue = scan.nextLine();
                                phoneBook.get(choiceId).setBirthDate(choiceFieldValue);
                                choiceField = "";
                            }
                            if ("P".equalsIgnoreCase(choiceField) | "З".equalsIgnoreCase(choiceField)) {
                                System.out.print("Введіть нове значення phoneNum: ");
                                String choiceFieldValue = scan.nextLine();
                                phoneBook.get(choiceId).setPhoneNum(choiceFieldValue);
                                choiceField = "";
                            }
                            if ("A".equalsIgnoreCase(choiceField) | "Ф".equalsIgnoreCase(choiceField)) {
                                System.out.print("Введіть нове значення address: ");
                                String choiceFieldValue = scan.nextLine();
                                phoneBook.get(choiceId).setPhoneNum(choiceFieldValue);
                                choiceField = "";
                            }
                            System.out.print("Введіть назву поля для редагування ( X | C | B | P | A ) : ");
                            choiceField = scan.nextLine();
                        }
                        System.out.println("Успішно відредаговано: " + phoneBook.get(choiceId));
                    }
                }
                } // end E

            //- Видалити елемент
            if ("-".equals(choice)) {
                System.out.print("Введіть дані для пошуку елементу для його видалення: ");
                choiceNew = scan.nextLine();
                System.out.println("Результати пошуку: ");
                for (int i = 0; i < phoneBook.size(); i++) {
                    if (phoneBook.get(i).getClientFIO().contains(choiceNew)|
                            phoneBook.get(i).getPhoneNum().contains(choiceNew)|
                            phoneBook.get(i).getAddress().contains(choiceNew)|
                            phoneBook.get(i).getBirthDate().contains(choiceNew)) {
                        System.out.println("id=" + i + " " + phoneBook.get(i));
                        cntSearch ++;
                    }
                }
                if (cntSearch == 0) {
                    System.out.println("Нічого не знайдено :(");
                } else {
                    System.out.println("");

                    int choiceId = -1;
                    boolean notAnInteger = true;

                    while (notAnInteger) {
                        System.out.print("Введіть id елемента для видалення: ");
                        String input = scan.nextLine();
                        try {
                            choiceId = Integer.parseInt(input);
                            phoneBook.get(choiceId);
                            notAnInteger = false;
                        } catch (NumberFormatException e1) {
                            System.out.println("\u001B[31m" + "УВАГА: id - ціле число!"+"\033[0m");
                        } catch (IndexOutOfBoundsException e2) {
                            System.out.println("\u001B[31m" + "УВАГА: id - число від 0 до " + (phoneBook.size() - 1) + "!" + "\033[0m");
                        }
                    }

                    editPhone = phoneBook.get(choiceId);
                    phoneBook.remove(choiceId);
                    System.out.println("Успішно видалено: " + editPhone);

                }
            } // end -

            //= Вивід книги
            if ("=".equals(choice)) {

                choiceField = "";

                System.out.print("Введіть назву поля для сортування ( X Вихід | C clientFIO | B birthDate | P phoneNum | A address | D dtTmEdit ): ");
                choiceField = scan.nextLine();

                while (!("X".equalsIgnoreCase(choiceField)|"Ч".equalsIgnoreCase(choiceField))) {

                    if ("C".equalsIgnoreCase(choiceField)|"С".equalsIgnoreCase(choiceField)) {
                        phoneBook.sort(Comparator.comparing(p -> p.getClientFIO()));
                        System.out.println(phoneBook);
                        break;
                    }
                    if ("B".equalsIgnoreCase(choiceField)|"И".equalsIgnoreCase(choiceField)) {
                        phoneBook.sort(Comparator.comparing(p -> p.getBirthDate()));
                        System.out.println(phoneBook);
                        break;
                    }
                    if ("P".equalsIgnoreCase(choiceField)|"З".equalsIgnoreCase(choiceField)) {
                        phoneBook.sort(Comparator.comparing(p -> p.getPhoneNum()));
                        System.out.println(phoneBook);
                        break;
                    }
                    if ("A".equalsIgnoreCase(choiceField)|"Ф".equalsIgnoreCase(choiceField)) {
                        phoneBook.sort(Comparator.comparing(p -> p.getAddress()));
                        System.out.println(phoneBook);
                        break;
                    }
                    if ("D".equalsIgnoreCase(choiceField)|"В".equalsIgnoreCase(choiceField)) {
                        phoneBook.sort(Comparator.comparing(p -> p.getDtEdit()));
                        System.out.println(phoneBook);
                        break;
                    }
                    System.out.print("Введіть назву поля для сортування ( X | C | B | P | A | D ) : ");
                    choiceField = scan.nextLine();
                }

            } // end =

            //S записати у файл
            if ("S".equalsIgnoreCase(choice)|"І".equalsIgnoreCase(choice)|"Ы".equalsIgnoreCase(choice)) {

                fileScan = "";
                System.out.print("Введіть [шлях]імя файлу для експорту даних з Довідника: ");
                fileScan = scan.nextLine();

                if ("".equals(fileScan)) {
                    filePathWrite = "D:/phoneBook.json";
                } else {
                    filePathWrite = fileScan;
                }

                ObjectMapper mapper = new ObjectMapper();
                // json с отступами
                mapper.enable(SerializationFeature.INDENT_OUTPUT);

                // для работы с полями типа LocalDate
                SimpleModule module = new SimpleModule();
                module.addSerializer(LocalDateTime.class, new LocalDtTmSerializer());
                module.addDeserializer(LocalDateTime.class, new LocalDtTmDeserializer());
                mapper.registerModule(module);
                Path path = Paths.get(filePathWrite);

                try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                    String json = mapper.writeValueAsString(phoneBook);
                    writer.write(json);

                } catch (Exception ex) {
                    System.out.println("Помилка запису файлу " + path.toAbsolutePath() + ": " + ex);
                }
                System.out.println("Запис Довідника у файл \"" + path.toAbsolutePath() + "\" завершено!");

            } // end S

            // O завантажити з файлу
            if ("O".equalsIgnoreCase(choice)|"Щ".equalsIgnoreCase(choice)) {

                fileScan = "";
                System.out.print("Введіть [шлях]імя файлу для імпорту даних у Довідник: ");
                fileScan = scan.nextLine();

                if ("".equals(fileScan)) {
                    filePathRead = "D:/phoneBook.json";
                } else {
                    filePathRead = fileScan;
                }

                choiceField = "";

                System.out.print("Виберіть варіант завантаження ( X Вихід | + Додати у Довідник дані з файлу | - Перезаписати Довідник даними з файлу ): ");
                choiceField = scan.nextLine();

                while (!("X".equalsIgnoreCase(choiceField)|"Ч".equalsIgnoreCase(choiceField))) {

                    GsonBuilder builder = new GsonBuilder();
                    Gson gson = builder.create();

                    try {
                        BufferedReader bufferedReader = new BufferedReader(
                                new FileReader(filePathRead));
                        PhoneBook phoneBook2 = gson.fromJson(bufferedReader, PhoneBook.class);
                        if ("-".equals(choiceField)) {
                            phoneBook.clear();
                            phoneBook.addAll(phoneBook2);
                            System.out.println("Довідник перезаписаний з файлу " + filePathRead + " успішно!");
                            break;
                        }

                        if ("+".equals(choiceField)) {
                            phoneBook.addAll(phoneBook2);
                            System.out.println("Дані з файлу " + filePathRead + " додані до Довідника успішно!");
                            break;
                        }

                    } catch (Exception e) {
                        System.out.println("\u001B[31m" + "УВАГА: Файлу " + filePathRead + " не знайдено!" + "\033[0m");
                        break;
                    }

                    System.out.print("Виберіть варіант завантаження ( X | + | - ): ");
                    choiceField = scan.nextLine();

                }

            }
            } // while

        //END
        //System.out.println(phoneBook);

    }
}

/*
    Обеспечить следующий функционал:
        добавление элемента+
        удаление элемента+
        поиск элементов+
        вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)+
        редактирование элемента+
        запись в файл всех данных+
        загрузка из файла всех данных
 */
