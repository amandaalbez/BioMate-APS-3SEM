import javax.swing.*;
import javax.swing.text.html.HTML;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class janela4 extends JFrame {
    public janela4() {
        setTitle("BioMate - Sobre Garimpo Ilegal");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela
        setSize(795, 550);
        setLocationRelativeTo(null); // Centraliza na tela
        setResizable(false); // Impede o redimensionamento da janela

        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(new Color(47, 79, 79));
        this.setJMenuBar(barraMenu);

        JMenu menuVoltar = new JMenu("Voltar");
        JMenuItem voltar = new JMenuItem("Voltar Início");
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual (janela3)
                new janela2(); // Abre a janela2
            }
        });
        menuVoltar.add(voltar);
        barraMenu.add(menuVoltar);

        JMenu menuFechar = new JMenu("Fechar");
        JMenuItem fecharAplicacaoItem = new JMenuItem("Fechar Aplicação");
        fecharAplicacaoItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha a aplicação
            }
        });
        menuFechar.add(fecharAplicacaoItem);
        barraMenu.add(menuFechar);

        JPanel panel1 = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(janela2.class.getResource("img\\fundo6.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Label1 - Título "O que é sustentabilidade?"
        JLabel label = new JLabel("<html>Garimpo Ilegal - Amazônia</html>");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(23,67,68));
        label.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da label

        // Label 2 - Sobre Garimpo ilegal
        JLabel novaLabel = new JLabel("<html>O garimpo ilegal na Amazônia é uma atividade que tem causado sérios danos ao meio ambiente e à vida de muitas pessoas que dependem da floresta para sobreviver. É uma prática onde pessoas exploram áreas de forma não autorizada, muitas vezes sem considerar os impactos ambientais e sociais.\n</html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));
        novaLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Align buttons to the right
        buttonPanel1.setBackground(new Color(124, 186, 119));

        JButton btn1 = createButton("Solução");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new solucao4();
            }
        });
        // Add buttons to button panel
        buttonPanel1.add(btn1);

        add(buttonPanel1, BorderLayout.SOUTH);


        // Adiciona a Label1 ao JPanel
        panel1.add(label);
        // Adiciona a novalabel ao JPanel
        panel1.add(novaLabel);

        // Adiciona um espaço vertical entre as labels e o botão
        panel1.add(Box.createVerticalStrut(20)); // Espaço vertical de 20 pixels

        // Adiciona o JPanel ao JFrame
        add(panel1);

        // Torna a janela visível
        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(124, 186, 119));
        button.setText(text);
        button.setForeground(new Color(23,67,68));

        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(janela2::new);
    }
}