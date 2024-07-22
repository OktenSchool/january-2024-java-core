package org.okten;

import lombok.SneakyThrows;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final String CONSTANT = "Constant";

    public static void main(String[] args) {
        writeWords(List.of("Jameson", "Bob", "Martin", "lkasjdjalksd"), "resources/words.txt");
        List<String> words = readWords("resources/words.txt");

        long count = getWordsWithLengthGreaterThan5(words);
        System.out.println(count);
    }

    @SneakyThrows
    public static List<String> readWords(String filePath) {
        Path path = Paths.get(filePath);
        return Files.readAllLines(path);
    }

    @SneakyThrows
    public static void writeWords(List<String> words, String filePath) {
        Path path = Paths.get(filePath);
        Files.write(path, words, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public static long getWordsWithLengthGreaterThan5(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("Words can not be null");
        }

        return words
                .stream()
                .map(String::length)
                .filter(wordLength -> wordLength > 5)
                .count();
    }

    public static void finallyDemo() {
        try {
            getWordsWithLengthGreaterThan5(null);
            System.out.println("Unreachable line");
        } finally {
            System.out.println("Code from finally block");
        }
    }

    public static void fileOldApproachDemo() {
        // Input/Output Stream

        List<String> words = new ArrayList<>();

        File file = new File("resources/test.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {
            byte[] bytes = fileInputStream.readAllBytes();
            String fileContent = new String(bytes);
            words = Arrays.stream(fileContent.split("\n")).toList();

            System.out.println("Data from file: " + words);
        } catch (FileNotFoundException e) {
            System.out.println("File with words not found");
        } catch (IOException e) {
            System.out.println("Unable to read file with words");
        } finally {
            System.out.println("I am executing always *");
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write("test content from our program\n".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to write to the file");
        }

        try {
            long result = getWordsWithLengthGreaterThan5(words);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Unable to count words (got exception)");
        }
    }
}
