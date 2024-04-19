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

        // Criação do JPanel
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBackground(new Color(236, 236, 236));
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel

        // Label1 - Título "O que é sustentabilidade?"
        JLabel label = new JLabel("Queimadas");
        label.setFont(new Font("Calibri", Font.BOLD, 28));
        label.setForeground(new Color(0,0,0));
        label.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da label

        // Adiciona a Label1 ao JPanel
        panel1.add(label);

        // Label 2 - Sobre sustentabilidade
        JLabel novaLabel = new JLabel("<html>A sustentabilidade visa garantir o uso adequado<br>dos recursos naturais para as futuras gerações,<br>equilibrando o desenvolvimento econômico<br>com a preservação do meio ambiente.<br>Envolve práticas como reciclagem, reutilização<br>e economia de recursos, sendo uma ação global<br>essencial em nossas atividades diárias.</html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));
        novaLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Adiciona a Label2 ao JPanel
        panel1.add(novaLabel);

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