import javax.swing.*;
import javax.swing.text.html.HTML;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class janela6 extends JFrame {
    public janela6() {
        setTitle("BioMate - Sobre Poluição dos Mares");
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
                ImageIcon backgroundImage = new ImageIcon(janela2.class.getResource("img\\fundo9.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Label1 - Título "Poluição dos Mares"
        JLabel label = new JLabel("Poluição dos Mares");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(23,67,68));
        label.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da label

        // novaLabel - Sobre "Poluição dos Mares"
        JLabel novaLabel = new JLabel("<html>A poluição dos mares é a introdução de substâncias ou elementos prejudiciais ao ecossistema marinho, causando danos aos organismos aquáticos, ao meio ambiente e à saúde humana. Essa poluição pode ocorrer de várias formas:</html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));
        novaLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // novaLabel2 - Sobre "Poluição dos Mares"
        JLabel novaLabel2 = new JLabel("<html>1° Poluição Química: Introdução de produtos químicos industriais, pesticidas e derivados de petróleo no mar.<br>" +
                "2° Poluição por Resíduos Sólidos: Descarte inadequado de plásticos, vidros e metais.<br>" +
                "3° Poluição por Microplásticos: Partículas pequenas de plástico resultantes da degradação de materiais maiores.<br>" +
                "4° Poluição Térmica: Descarte de água aquecida de usinas e navios, alterando a temperatura da água.<br>" +
                "5° Poluição por Ruído: Interferência na comunicação de animais marinhos devido a ruídos de navios e atividades submarinas.</html>");
        novaLabel2.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel2.setForeground(new Color(83, 83, 83));
        novaLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);


        JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Align buttons to the right
        buttonPanel1.setBackground(new Color(255, 226, 219));

        JButton btn1 = createButton("Solução");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new solucao6();
            }
        });

        buttonPanel1.add(btn1);
        add(buttonPanel1, BorderLayout.SOUTH);

        // Adiciona a Label2 ao JPanel
        panel1.add(label);
        panel1.add(novaLabel);
        panel1.add(novaLabel2);

        // Adiciona um espaço vertical entre as labels e o botão
        panel1.add(Box.createVerticalStrut(20)); // Espaço vertical de 20 pixels

        // Adiciona o JPanel ao JFrame
        add(panel1);

        // Torna a janela visível
        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(255, 226, 219));
        button.setText(text);
        button.setForeground(new Color(12,63,103));

        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(janela2::new);
    }
}