import javax.swing.*;
import javax.swing.text.html.HTML;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class janela5 extends JFrame {
    public janela5() {
        setTitle("BioMate - Sobre Enchentes");
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

        // Criação do JPanel
        JPanel panel1 = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(janela2.class.getResource("img\\fundo4.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Label1 - Título "O que é sustentabilidade?"
        JLabel label = new JLabel("Enchentes");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(0,0,0));
        label.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da label

        // Label 2 - Sobre sustentabilidade
        JLabel novaLabel = new JLabel("<html>As enchentes são eventos naturais que ocorrem quando há um grande volume de água que excede a capacidade de absorção do solo ou a capacidade de drenagem dos sistemas fluviais, resultando no transbordamento dos rios, córregos e lagos, porém esses eventos foram potencializados por fatores humanos. </html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));
        novaLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Label 3 - Sobre sustentabilidade
        JLabel novaLabel1 = new JLabel("<html>As áreas urbanas são particularmente vulneráveis às enchentes devido à impermeabilização do solo causada pelo asfaltamento e construção de edifícios, dificultando  a absorção da água e muitas vezes ocorre em áreas de várzea e planícies de inundação, aumentando o risco de danos por enchentes. </html>");
        novaLabel1.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel1.setForeground(new Color(83, 83, 83));
        novaLabel1.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Label 4 - Sobre sustentabilidade
        JLabel novaLabel2 = new JLabel("<html>Enchentes podem ter impactos devastadores nas áreas afetadas causando destruição de casas, infraestrutura, plantações e estradas, além de que, também podem causar a morte, ferimentos, deslocamento e problemas de saúde pública devido à contaminação da água e ao surgimento de doenças transmitidas pela água.\n</html>");
        novaLabel2.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel2.setForeground(new Color(83, 83, 83));
        novaLabel2.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Adiciona as labels ao painel
        panel1.add(label);
        panel1.add(novaLabel);
        panel1.add(novaLabel1);
        panel1.add(novaLabel2);

        // Adiciona um espaço vertical entre as labels e o botão
        panel1.add(Box.createVerticalStrut(20)); // Espaço vertical de 20 pixels

        // Adiciona o JPanel ao JFrame
        add(panel1);

        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(janela2::new);
    }
}