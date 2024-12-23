package ru.demo;

import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static String Lang1;
    public static String Lang2;

    public static boolean exit = true;

    public static void main(String[] args) throws Exception {
        boolean isNumeric = true;
        while (exit) {
            Lang1 =GetLangs.GetLangFrom();
            Lang2 = GetLangs.GetLangTo();
            if (Lang1 == "exit" || Lang2 == "exit")
            { break;}
            System.out.println("Введите текст для перевода:");
            Scanner Text = new Scanner(System.in);
            String text = Text.nextLine();
            System.out.println("\nПеревод вашего текста:");
            System.out.println(Translator.Translator(text, Lang1, Lang2) + "\n");

            FileWriter writer = new FileWriter("fileForWrite.txt");
            writer.write("Ввод: " + text + "\n");
            writer.write("Перевод: " + (Translator.Translator(text, Lang1, Lang2)));
            writer.write("\n");
            writer.close();
        }

    }
}