package ro.siit;

public class NewButtonListener implements ButtonListener{

    @Override
    public void act(String action) {
        System.out.println("Button was pressed; action " + action + " was triggered");
    }

}
