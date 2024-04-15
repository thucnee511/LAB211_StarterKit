package vn.edu.fpt.lab.core;

import java.util.Scanner;

public final class InputHandler {

    private static Scanner sc = new Scanner(System.in);

    public static int getInteger(String inputMsg) {
        while (true) {
            System.out.print(inputMsg);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println(">> Error: Input value must be an integer number.");
            }
        }
    }

    public static double getDouble(String inputMsg) {
        while (true) {
            System.out.print(inputMsg);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println(">> Error: Input value must be a real number.");
            }
        }
    }

    public static String getString(String inputMsg) {
        System.out.print(inputMsg);
        return sc.nextLine();
    }

    public static String getStringNotNull(String inputMsg) {
        while (true) {
            System.out.print(inputMsg);
            try {
                String inputValue = sc.nextLine();
                if (inputValue == null || inputValue.isEmpty()) {
                    throw new Exception(">> Error: Input value cannot be null or empty.");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
