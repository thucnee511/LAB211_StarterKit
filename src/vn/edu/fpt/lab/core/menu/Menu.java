package vn.edu.fpt.lab.core.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vn.edu.fpt.lab.core.InputHandler;

public final class Menu {

    private final List<String> options = new ArrayList<>();
    private final String title;

    public Menu(String title) {
        this.title = title;
    }

    public Menu(String title, String options) {
        this.title = title;
        this.options.addAll(Arrays.asList(options.split("\\|")));
    }

    public void printMenu() {
        System.out.println("===== " + title + " =====");
        options.forEach(option -> {
            System.out.println(options.indexOf(option) + 1 + ". " + option);
        });
    }

    public int getChoice() throws IllegalArgumentException {
        int choice = InputHandler.getInteger("Select an option: ");
        if (choice < 1 || choice > options.size()) {
            throw new IllegalArgumentException(
                    ">> Error: Unsupported operation");
        }
        return choice;
    }
}
