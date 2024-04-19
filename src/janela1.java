import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class janela1 extends JFrame {
    public janela1() {

        setTitle("BioMate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Impede o redimensionamento da janela

        // Imagem Panel2
        ImageIcon imagem = new ImageIcon(janela2.class.getResource("img\\img1.png"));
        JLabel img = new JLabel(imagem);

        JLabel label = new JLabel("BioMate", JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD, 40));
        label.setForeground(new Color(47, 79, 79));

        // Componente para inserir imagem acima da primeira label
        ImageIcon novaImagem = new ImageIcon(janela2.class.getResource("img\\logo.png"));
        JLabel novaImagemLabel = new JLabel(novaImagem);

        //Criacao de Panels
        JPanel panel1 = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(janela2.class.getResource("img\\fundo3.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setPreferredSize(new Dimension(390, 550)); // Define o tamanho do primeiro JPanel

        // Adiciona a nova imagem acima da primeira label
        GridBagConstraints gbcNovaImagemLabel = new GridBagConstraints();
        gbcNovaImagemLabel.gridx = 0;
        gbcNovaImagemLabel.gridy = 0;
        gbcNovaImagemLabel.weightx = 1;
        gbcNovaImagemLabel.weighty = 0; // Sem peso vertical
        gbcNovaImagemLabel.fill = GridBagConstraints.BOTH;
        panel1.add(novaImagemLabel, gbcNovaImagemLabel);

        // Adicionando um botão "Entrar" abaixo da nova label
        JButton entrarButton = new JButton("Entrar");
        entrarButton.setFont(new Font("Montserrat",Font.BOLD,14));
        entrarButton.setForeground(new Color(185,223,221));
        entrarButton.setBackground(new Color(23,67,68));

        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.gridx = 0;
        gbcButton.gridy = 1; // Agora é logo após a nova imagem
        gbcButton.insets = new Insets(10, 0, 0, 0); // Adiciona espaçamento superior
        panel1.add(entrarButton, gbcButton);

        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new janela2();
            }
        });

        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.setBackground(Color.white);
        panel2.setPreferredSize(new Dimension(375, 550)); // Define o tamanho do segundo JPanel
        panel2.add(img, BorderLayout.CENTER); // Adiciona imagem no centro

        // Adicionando os JPanels ao JFrame
        getContentPane().setLayout(new FlowLayout()); // Configura o layout manager para FlowLayout
        getContentPane().add(panel1);
        getContentPane().add(panel2);

        pack(); // Ajusta automaticamente o tamanho do JFrame com base nos componentes adicionados
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new janela1());
    }
    static {
        new Splash();
    }
}