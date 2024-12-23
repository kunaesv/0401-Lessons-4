package ru.demo;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GetLangs {
    private static final String MENUFROM = "Выберите язык c которого хотите перевести:\n1.Английский\n2.Французский\n3.Немецкий\n4.Русский\n5.Турецкий\n6.Выход" ;
    private static final String MENUTO = "Выберите язык на который хотите перевести:\n1.Английский\n2.Французский\n3.Немецкий\n4.Русский\n5.Турецкий\n6.Выход" ;

    public static int ChooseOneLang;
    public static String Lang1;
    public static String Lang2;
    public static int ChooseTwoLang;
    public static String GetLangFrom(){
            boolean isNumeric = false ;
            System.out.println(MENUFROM);
            Scanner from = new Scanner(System.in);
            try {
                ChooseOneLang = parseInt(from.nextLine());
                switch (ChooseOneLang) {
                    case 1:
                        Lang1 = "en";
                        break;
                    case 2:
                        Lang1 = "fr";
                        break;
                    case 3:
                        Lang1 = "de";
                        break;
                    case 4:
                        Lang1 = "ru";
                        break;
                    case 5:
                        Lang1 = "tr";
                        break;
                    case 6:
                        Lang1 = "exit";
                    default:
                        System.out.println("Выбрано не верное значение языка");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Введено некоректное значение\nПожалуйста повторите еще раз!\n");
                isNumeric = true;
            }
            if(isNumeric)
                System.out.println("Введен текст\nПожалуйста введите порядковый номер!");
        ChooseOneLang = 0;
        return Lang1;
    }

    public static String GetLangTo(){
            boolean isNumeric1 = false;
            try {
                System.out.println(MENUTO);
                Scanner to = new Scanner(System.in);
                ChooseTwoLang = parseInt(to.nextLine());
                switch (ChooseTwoLang) {
                    case 1:
                        Lang2 = "en";

                        break;
                    case 2:
                        Lang2 = "fr";

                        break;
                    case 3:
                        Lang2 = "de";

                        break;
                    case 4 :
                        Lang2 = "ru";

                        break;
                    case 5:
                        Lang2 = "tr";
                        break;
                    case 6:
                        Lang2 = "exit";
                        break;
                    default:
                        System.out.println("Выбрано не верное значение языка");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено некоректное значение\nПожалуйста повторите еще раз!\n");
                isNumeric1 = true;
            }
            if(isNumeric1)
                System.out.println("Введен текст\nПожалуйста введите порядковый номер!");
        ChooseTwoLang = 0;
        return Lang2;
    }
}
