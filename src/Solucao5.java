import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solucao5 extends JFrame {
    public Solucao5() {

        setTitle("BioMate - Solução");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela
        setSize(795, 550);
        setLocationRelativeTo(null); // Centraliza na tela
        setResizable(false); // Impede o redimensionamento da janela

        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(new Color(47, 79, 79));
        this.setJMenuBar(barraMenu);

        JMenu menuVoltar = new JMenu("Voltar");
        JMenuItem voltar = new JMenuItem("Voltar Início");
        JMenuItem pgA = new JMenuItem("Enchentes");

        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela2(); // Abre a janela2
            }
        });

        pgA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela5(); // Abre a janela5
            }
        });

        menuVoltar.add(voltar);
        menuVoltar.add(pgA); // Adding pgA as a submenu under menuVoltar

        barraMenu.add(menuVoltar); // Adding menuVoltar directly to the JMenuBar

        JMenu menuFechar = new JMenu("Fechar");
        JMenuItem fecharAplicacaoItem = new JMenuItem("Fechar Aplicação");
        fecharAplicacaoItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha a aplicação
            }
        });

        menuFechar.add(fecharAplicacaoItem);
        barraMenu.add(menuFechar);


        // Criação do JPanel
        JPanel panel1 = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(Solucao5.class.getResource("img/fundo4.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Label1 - Título "O que é sustentabilidade?"
        JLabel label = new JLabel("Solução");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(23,67,68));
        label.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da label

        // novaLabel2 - Sobre sustentabilidade
        JLabel novaLabel3 = new JLabel("<html>Para evitar as enchentes:<br>" +
                "1° Melhorar a drenagem urbana.<br>" +
                "2° Proteger áreas naturais.<br>" +
                "3° Planejar o uso do solo de forma inteligente.<br>" +
                "4° Preparar-se com alertas e planos de evacuação.<br>" +
                "5° Coordenar esforços de gestão de bacias hidrográficas.</html>");
        novaLabel3.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel3.setForeground(new Color(83, 83, 83));
        novaLabel3.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Adiciona as labels ao painel
        panel1.add(label);
        panel1.add(novaLabel3);

        // Adiciona um espaço vertical entre as labels e o botão
        panel1.add(Box.createVerticalStrut(20)); // Espaço vertical de 20 pixels

        // Adiciona o JPanel ao JFrame
        add(panel1);

        // Torna a janela visível
        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Solucao5::new);
    }
}