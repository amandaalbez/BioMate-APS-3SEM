import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class janela2 extends JFrame {
    public janela2() {
        // Criação da Janela2
        setTitle("BioMate - Inicio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela
        setSize(795, 550);
        setLocationRelativeTo(null); // Centraliza na tela
        setResizable(false); // Impede o redimensionamento da janela

        // Imagem Panel2
        ImageIcon imagem = new ImageIcon(janela2.class.getResource("img\\img4.png"));
        JLabel img = new JLabel(imagem);

        // Criação de um Menu
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(new Color(47, 79, 79));
        this.setJMenuBar(barraMenu);

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
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(236, 236, 236));
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setPreferredSize(new Dimension(390, 550)); // Define o tamanho do primeiro JPanel

        // Criação dos labels
        JLabel label = new JLabel("O que é sustentabilidade?");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(83, 83, 83));

        JLabel novaLabel = new JLabel("<html>A sustentabilidade visa garantir o uso adequado<br>dos recursos naturais para as futuras gerações,<br>equilibrando o desenvolvimento econômico<br>com a preservação do meio ambiente.<br>Envolve práticas como reciclagem, reutilização<br>e economia de recursos, sendo uma ação global<br>essencial em nossas atividades diárias.</html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));

        // Adiciona um espaço vertical entre as labels e os botões
        panel1.add(label);
        panel1.add(novaLabel);
        panel1.add(Box.createVerticalStrut(20)); // Espaço vertical de 20 pixels

        // Criação do JPanel para os três primeiros botões
        JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel1.setBackground(new Color(236, 236, 236));

        // Criação dos botões btn1, btn2 e btn3
        JButton btn1 = createButton("3R's", "C:\\Users\\amand\\IdeaProjects\\APSTeste\\src\\img\\icon1.png");
        btn1.setPreferredSize(new Dimension(100, 100));
        JButton btn2 = createButton("<html>Garimpo <br>Ilegal", "C:\\Users\\amand\\IdeaProjects\\APSTeste\\src\\img\\icon2.png");
        btn2.setPreferredSize(new Dimension(100, 100));

        // Adiciona Função de abrir janela3
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new janela3();
            }
        });
        // Adiciona Função de abrir janela4
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new janela4();
            }
        });

        // Adiciona os botões ao painel dos três primeiros botões
        buttonPanel1.add(btn1);
        buttonPanel1.add(btn2);

        // Adiciona o painel dos três primeiros botões ao painel principal
        panel1.add(buttonPanel1);

        // Criação do JPanel para o botão btn4
        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel2.setBackground(new Color(236, 236, 236));

        // Criação do botão btn4
        JButton btn4 = createButton("<html>Poluição <br>dos Mares", "C:\\Users\\amand\\IdeaProjects\\APSTeste\\src\\img\\icon4.png");
        btn4.setPreferredSize(new Dimension(100, 100));

        // Criação do botão btn5
        JButton btn5 = createButton("Queimadas", "C:\\Users\\amand\\IdeaProjects\\APSTeste\\src\\img\\icon5.png");
        btn5.setPreferredSize(new Dimension(100, 100));

        JButton btn3 = createButton("Enchentes", "C:\\Users\\amand\\IdeaProjects\\APSTeste\\src\\img\\icon3.png");
        btn3.setPreferredSize(new Dimension(100, 100));

        // Adiciona Função de abrir janela5
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new janela5();
            }
        });

        // Adiciona Função de abrir janela6
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new janela6();
            }
        });
        // Adiciona Função de abrir janela7
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new janela7();
            }
        });

        // Adiciona o botão btn4 ao painel para o botão btn4
        buttonPanel1.add(btn3);
        buttonPanel2.add(btn4);
        buttonPanel2.add(btn5);

        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.setBackground(new Color(236, 236, 236));
        panel3.setPreferredSize(new Dimension(375, 550)); // Define o tamanho do segundo JPanel
        panel3.add(img, BorderLayout.CENTER); // Adiciona imagem no centro

        // Adiciona o painel para o botão btn4 ao painel principal
        panel1.add(buttonPanel2);

        // Adiciona o JPanel ao JFrame
        // Adicionando os JPanels ao JFrame
        getContentPane().setLayout(new FlowLayout()); // Configura o layout manager para FlowLayout
        getContentPane().add(panel1);
        getContentPane().add(panel3);

        // Torna a janela visível
        setVisible(true);
    }

    // Método para criar botões com texto e ícone
    private JButton createButton(String text, String iconPath) {
        ImageIcon icon = new ImageIcon(iconPath);
        JButton button = new JButton(icon);
        button.setBackground(new Color(23,67,68));
        button.setText(text);
        button.setForeground(new Color(255, 255, 255));
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(janela2::new);
    }
}
