import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class janela3 extends JFrame {
    public janela3() {
        setTitle("BioMate - Sobre os 3R's");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(795, 550);
        setLocationRelativeTo(null);
        setResizable(false);

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

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBackground(new Color(236, 236, 236));
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel label = new JLabel("Os 3 R's");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(0,0,0));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(label);

        JLabel novaLabel = new JLabel("<html>A sustentabilidade visa garantir o uso adequado<br>dos recursos naturais para as futuras gerações,<br>equilibrando o desenvolvimento econômico<br>com a preservação do meio ambiente.<br>Envolve práticas como reciclagem, reutilização<br>e economia de recursos, sendo uma ação global<br>essencial em nossas atividades diárias.</html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));
        novaLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(novaLabel);

        panel1.add(Box.createVerticalStrut(20));

        add(panel1);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(janela3::new);
    }
}
