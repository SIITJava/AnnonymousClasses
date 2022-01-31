package ro.siit;

public class Button {
    private String label;
    private ButtonListener listener;

    public Button(String label){
        this.label = label;
    }

    public void addListener(ButtonListener listener){
        this.listener = listener;
    }

    public void click(){
        this.listener.act(this.label);
    }
}
