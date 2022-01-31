package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Button> buttons = new ArrayList<>();
        Button newButton = new Button("New");
//        newButton.addListener(new ButtonListener() {
//            @Override
//            public void act(String action) {
//                System.out.println("Button was pressed; action " + action + " was triggered");
//            }
//        });
        newButton.addListener(new NewButtonListener());
        buttons.add(newButton);

        Button closeButton = new Button("Close");
        closeButton.addListener(new ButtonListener() {
            @Override
            public void act(String action) {
                System.out.println(action + " was triggered; app will close now");
            }
        });
        buttons.add(closeButton);

        closeButton.click();
        newButton.click();

        Button customNewButton = new Button("CustomNew");
        customNewButton.addListener(new NewButtonListener() {
            @Override
            public void act(String action) {
                System.out.println("Custom " + action + " was triggered");
            }
        });
        buttons.add(customNewButton);

        customNewButton.click();
    }
}
