import button.Button;
import checkbox.Checkbox;
import factory.GUIFactory;
import factory.MacosFactory;
import factory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factoryWin = new WindowsFactory();
        Button buttonWin = factoryWin.createButton();
        Checkbox checkboxWin = factoryWin.createCheckbox();

        GUIFactory factoryMac = new MacosFactory();
        Button buttonMac = factoryMac.createButton();
        Checkbox checkboxMac = factoryMac.createCheckbox();

        buttonWin.render();
        checkboxWin.render();
        buttonMac.render();
        checkboxMac.render();
    }
}
