import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class solucao7 extends JFrame {
    public solucao7() {

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
        JMenuItem pgA = new JMenuItem("Queimadas");

        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela2(); // Abre a janela2
            }
        });

        pgA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela7(); // Abre a janela5
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
                ImageIcon backgroundImage = new ImageIcon(solucao7.class.getResource("img/fundo4.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Label2 - Título "Solução"
        JLabel label2 = new JLabel("<html>Solução</html>");
        label2.setFont(new Font("Calibri", Font.BOLD, 22));
        label2.setForeground(new Color(23,67,68));
        label2.setAlignmentX(Component.LEFT_ALIGNMENT);

        // novaLabel2 - Sobre queimadas
        JLabel novaLabel2 = new JLabel("<html>Evitar as queimadas demanda uma abordagem abrangente que envolve medidas preventivas, regulamentações<br> eficazes e conscientização. Aqui estão algumas soluções importantes:<br>1. Monitoramento e fiscalização: Aumentar a vigilância por meio de satélites, drones e equipes de campo para detectar e deter atividades ilegais de queimadas. Implementar punições rigorosas para quem iniciar queimadas ilegais.<br>2. Educação e conscientização: Promover campanhas educativas para sensibilizar as comunidades sobre os riscos das queimadas e alternativas para o manejo sustentável da terra, enfatizando práticas agrícolas e pecuárias que não envolvam o uso do fogo.<br>3. Desenvolvimento de técnicas alternativas: Investir em pesquisa e desenvolvimento de técnicas agrícolas e florestais alternativas, como o uso de métodos de plantio direto, controle biológico de pragas e manejo integrado do fogo, que reduzem a necessidade de queimadas.<br>4. Regularização fundiária e ordenamento territorial: Promover a regularização fundiária e o ordenamento territorial para combater o desmatamento e o avanço desordenado das atividades agropecuárias, garantindo o uso sustentável da terra e a conservação de áreas protegidas.<br>5. Manejo integrado do fogo: Implementar estratégias de manejo integrado do fogo em áreas propensas a queimadas, envolvendo a realização de queimadas controladas e o uso de aceiros para prevenir a propagação descontrolada do fogo.</html>");
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
        SwingUtilities.invokeLater(solucao7::new);
    }
}