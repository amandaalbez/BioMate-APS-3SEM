import javax.swing.*;
import javax.swing.text.html.HTML;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class janela7 extends JFrame {
    public janela7() {
        setTitle("BioMate - Sobre Queimadas");
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
                ImageIcon backgroundImage = new ImageIcon(janela2.class.getResource("img\\fundo8.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Label1 - Título "Queimadas"
        JLabel label = new JLabel("Queimadas");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(23,67,68));
        label.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da label

        // novaLabel  - Sobre queimadas
        JLabel novaLabel = new JLabel("<html>Geralmente elas ocorrem nos períodos de estiagem que se inicia no mês de maio e pode seguir até outubro, porém <br>muitas vezes esses incêndios podem ser causados por criminosos, que iniciam focos de incêndios que acabam se alastrando para regiões de mata e pastos.\n</html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));
        novaLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // novaLabel1 - Sobre queimadas
        JLabel novaLabel1 = new JLabel("<html>Essas ações podem causar diversos problemas graves para a fauna e flora daquele local, já que os mesmos contribuem para a diminuição da qualidade do solo e também do ar daquela região, causando doenças respiratórias até mesmo nos seres humanos.</html>");
        novaLabel1.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel1.setForeground(new Color(83, 83, 83));
        novaLabel1.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Label2 - Título "Solução"
        JLabel label2 = new JLabel("<html>Solução</html>");
        label2.setFont(new Font("Calibri", Font.BOLD, 22));
        label2.setForeground(new Color(23,67,68));
        label2.setAlignmentX(Component.LEFT_ALIGNMENT);

        // novaLabel2 - Sobre queimadas
        JLabel novaLabel2 = new JLabel("<html>Para evitar queimadas, é crucial investir em educação ambiental, fiscalização, leis restritivas e manejo do fogo. Além disso, é importante construir infraestrutura de proteção, envolver a comunidade, emitir alertas antecipados e utilizar tecnologia avançada. A cooperação internacional e a manutenção das áreas verdes também são essenciais. Com essas medidas, é possível reduzir o risco de queimadas e proteger o meio ambiente e as pessoas.</html>");
        novaLabel2.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel2.setForeground(new Color(83, 83, 83));
        novaLabel2.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Adiciona as Labels ao JPanel
        panel1.add(label);
        panel1.add(novaLabel);
        panel1.add(novaLabel1);
        panel1.add(label2);
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