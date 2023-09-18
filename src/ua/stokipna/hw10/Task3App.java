package ua.stokipna.hw10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3App {
    public static void main(String[] args) throws FileNotFoundException {
        WordDictionary wordDictionary = new WordDictionary();
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            String[] words = line.split(" ");
            wordDictionary.processWords(words);
        }
        System.out.println(wordDictionary.toString());
    }
}
