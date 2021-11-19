package com.pb.karpjuk.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {

    static void createNumbersFile(String fileName) {
        Path path = Paths.get("files/" + fileName);

        // write to file
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    int rnd = (int) (Math.random() * 100);
                    writer.write(rnd + " ");
                }
                writer.newLine();
            }

        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");

        }

    static void createOddNumbersFile(String fileNameFrom, String fileNameTo) throws IOException {
        Path pathFrom = Paths.get("files/" + fileNameFrom);
        Path pathTo = Paths.get("files/" + fileNameTo);
        int[] array = new int[10];

        // read from file
        System.out.println("Read text from file \"" + pathFrom.toAbsolutePath() + "\":");

        try (BufferedWriter writer = Files.newBufferedWriter(pathTo)) {

            try (BufferedReader reader = Files.newBufferedReader(pathFrom)) {

                String line;

                while ((line = reader.readLine()) != null) {

                    String numbers[] = line.split (" ");

                    for (int i = 0; i < 10; i++) {
                        if (Integer.parseInt(numbers[i])%2 == 0) {
                            numbers[i] = "0";
                        }

                        writer.write(numbers[i] + " ");
                    }

                    writer.newLine();

                }

            } catch (Exception ex) {
                System.out.println("Error with file read: " + ex);
            }
            System.out.println("Read from file " + fileNameFrom + " done!");
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + pathTo.toAbsolutePath() + "\" done!");
    }

    public static void main(String[] args) throws IOException {

        createNumbersFile("numbers.txt");

        createOddNumbersFile("numbers.txt", "odd-numbers.txt");
    }
}

/*
 - createNumbersFile - создает текстовый файл "numbers.txt" заполненный случайными целыми числами от 1 до 99.
 10 строк и по 10 чисел в каждой строке. Числа разделять пробелами.

 - createOddNumbersFile - читает файл "numbers.txt", и создает на основе него новый файл "odd-numbers.txt"
 в который входят все числа из "numbers.txt" только все четные заменены на 0.
 В методе main продемонстрировать работу методов createNumbersFile и createOddNumbersFile.

 По желанию можно добавить логирование работы программы.
*/
