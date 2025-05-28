package factory;

import button.Button;
import button.MacosButton;
import checkbox.Checkbox;
import checkbox.MacosCheckbox;

public class MacosFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacosButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacosCheckbox();
    }
}
