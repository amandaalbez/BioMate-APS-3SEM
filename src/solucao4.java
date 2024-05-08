import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class solucao4 extends JFrame {
    public solucao4() {

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
        JMenuItem pgA = new JMenuItem("Garimpo Ilegal");

        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela2(); // Abre a janela2
            }
        });

        pgA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela4(); // Abre a janela5
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
                ImageIcon backgroundImage = new ImageIcon(solucao4.class.getResource("img/fundo4.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Label1 - Título "O que é sustentabilidade?"
        // Label2 - Título "Solução"
        JLabel label2 = new JLabel("<html>Solução</html>");
        label2.setFont(new Font("Calibri", Font.BOLD, 22));
        label2.setForeground(new Color(23,67,68));
        label2.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Label 3 -
        JLabel novaLabel2 = new JLabel("<html>Combater o garimpo ilegal na Amazônia requer uma abordagem multifacetada e coordenada. Algumas soluções <br>eficazes incluem:<br> 1. Fiscalização e aplicação da lei: Reforçar as operações de fiscalização para detectar e deter atividades ilegais de garimpo. Isso requer o aumento da presença policial e a utilização de tecnologias como satélites e drones para monitorar áreas críticas. <br> 2. Fortalecimento das leis e punições: Implementar leis mais rigorosas e aplicar punições mais severas para aqueles envolvidos no garimpo ilegal, incluindo não apenas os garimpeiros, mas também os intermediários e financiadores dessa atividade. <br> 3. Regularização e controle da mineração: Estabelecer um sistema de licenciamento mais transparente e eficaz para a mineração legal, garantindo que as empresas cumpram rigorosos padrões ambientais e trabalhistas. <br> 4. Incentivos econômicos para a conservação: Promover alternativas econômicas sustentáveis para as comunidades locais, como o ecoturismo, agroflorestamento e manejo florestal sustentável, que geram renda sem degradar o meio ambiente.</html>");
        novaLabel2.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel2.setForeground(new Color(83, 83, 83));
        novaLabel2.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel

        // Adiciona as labels ao painel
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
        SwingUtilities.invokeLater(Solucao5::new);
    }
}