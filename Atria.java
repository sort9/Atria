// import the java Scanner utility to collect user input
import java.util.Scanner;

public class Atria {

    // constants for colored text
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // program variables
    public static int menuInput, settingsOptionInput, changeSettingsOptionInput;

    // default settings
    public static boolean numbers_setting = true, letters_setting = true, special_characters_setting = true;

    // other settings
    public static int passwordLength;

    public static void programGreetings() {
        System.out.println("Atria Password Generator V1.0");
    }

    public static void settings() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Program Settings: ");
        System.out.println("Numbers included within password: " + numbers_setting);
        System.out.println("Letters included within password: " + letters_setting);
        System.out.println("Special characters included within password: " + special_characters_setting);
        System.out.println("-----------------------------");
        System.out.println("0. Return to main menu");
        System.out.println("1. Change a setting");
        System.out.print("Enter your option: ");
        settingsOptionInput = input.nextInt();
        switch (settingsOptionInput) {
            case 0:
                menu();
                break;
            case 1:
                changeSettings();
                break;
        }
    }

    public static void changeSettings() {
        Scanner input = new Scanner(System.in);
        System.out.println("0. Cancel");
        System.out.println("1. Toggle numbers included");
        System.out.println("2. Toggle letters included");
        System.out.println("3. Toggle special characters included");
        System.out.print("Enter your option: ");
        changeSettingsOptionInput = input.nextInt();
        switch (changeSettingsOptionInput) {
            case 0:
                settings();
                break;
            case 1:
                if (numbers_setting == true) {
                    numbers_setting = false;
                }
                else {
                    numbers_setting = true;
                }
                System.out.print(ANSI_GREEN + "Numbers included setting updated!\n" + ANSI_RESET);
                settings();
                break;
            case 2:
                if (letters_setting == true) {
                    letters_setting = false;
                }
                else {
                    letters_setting = true;
                }
                System.out.print(ANSI_GREEN + "Letters included setting updated!\n" + ANSI_RESET);
                settings();
                break;
            case 3:
                if (special_characters_setting == true) {
                    special_characters_setting = false;
                }
                else {
                    special_characters_setting = true;
                }
                System.out.print(ANSI_GREEN + "Special characters included setting updated!\n" + ANSI_RESET);
                settings();
                break;
        }
    }

    public static void menu() {
        Scanner input = new Scanner(System.in); // creates Scanner object to collect user input
        System.out.println("-----------------------------");
        System.out.println("Main Menu Options:");
        System.out.println("0. Exit");
        System.out.println("1. Settings");
        System.out.println("2. Generate a Password");
        System.out.print("Enter your option: ");
        menuInput = input.nextInt();
        switch (menuInput) {
            case 0:
                break;
            case 1:
                settings();
                break;
            case 2:
                generatePassword();
                break;
        }
    }

    public static void generatePassword() {
        Scanner input = new Scanner(System.in);
        int count = 0; // start the string character count at 0
        System.out.println("-----------------------------");
        System.out.print("Enter a password length: ");
        passwordLength = input.nextInt();
    }

    public static void main(String[] args) {
        programGreetings();
        menu();
    }

}