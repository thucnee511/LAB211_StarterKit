package vn.edu.fpt.lab.core.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
