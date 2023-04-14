package materialmakerlib;

import javax.swing.*;
import java.awt.*;
import universo.Material;

public class MaterialMakerWindow extends JFrame {

    private Material material = new Material();

    public MaterialMakerWindow() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(640, 480);

        JPanel mother_panel = new JPanel();

        JLabel label_nome = new JLabel("Nome do Material: ");
        mother_panel.add(label_nome);

        JTextField textfield_nome = new JTextField();
        mother_panel.add(textfield_nome);

        this.getContentPane().add(mother_panel);

        this.setVisible(true);
    }
}
