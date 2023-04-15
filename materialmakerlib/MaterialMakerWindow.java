package materialmakerlib;

import javax.swing.*;
import java.awt.*;
import universo.Material;
import universo.Propriedades;
import java.util.List;

public class MaterialMakerWindow extends JFrame implements ActionListener {

    private Material material; 
    private String titulo = "MATERIAL MAKER";
    private java.util.List<JCheckBox> propriedades_boxes;

    public MaterialMakerWindow() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(640, 480);

        Box mother_panel = new Box(BoxLayout.Y_AXIS);
            JLabel titulo_label = new JLabel(titulo);
            mother_panel.add(titulo_label);

            JPanel nome_painel = new JPanel();
                JLabel label_nome = new JLabel("Nome do Material: ");
                nome_painel.add(label_nome);

                JTextField textfield_nome = new JTextField("ex: Madeira");
                nome_painel.add(textfield_nome);
            mother_panel.add(nome_painel);
            
            JLabel propriedades_label = new JLabel("Propriedades:");
            mother_panel.add(propriedades_label);

            java.util.List<String> listaPropriedades = Propriedades.lista();
            for (String propriedade : listaPropriedades) {
                JCheckBox propriedade_box = new JCheckBox(propriedade);
                propriedades_boxes.add(propriedade_box);
                mother_panel.add(propriedade_box);
            }

            JButton botao_create = new JButton("Criar Material");
            botao_create.addActionListener(this);
            mother_panel.add(botao_create);

        this.getContentPane().add(mother_panel);

        this.setVisible(true);
    }

        

}
