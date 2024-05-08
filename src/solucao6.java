import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class solucao6 extends JFrame {
    public solucao6() {

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
        JMenuItem pgA = new JMenuItem("Poluição dos Mares");

        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela2(); // Abre a janela2
            }
        });

        pgA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                new janela6(); // Abre a janela5
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
                ImageIcon backgroundImage = new ImageIcon(solucao6.class.getResource("img/fundo4.png"));
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
        JLabel novaLabel2 = new JLabel("<html>Evitar a poluição dos mares requer a implementação de medidas abrangentes em várias frentes. Aqui estão algumas soluções importantes:<br>1. Redução do uso de plásticos descartáveis: Promover a redução do consumo de plásticos descartáveis e incentivar o uso de alternativas biodegradáveis e reutilizáveis. Isso pode ser feito por meio de campanhas de conscientização pública, políticas governamentais e iniciativas da indústria.<br>2. Melhoria da gestão de resíduos: Implementar sistemas eficazes de gestão de resíduos, incluindo coleta, reciclagem e descarte adequado de resíduos sólidos. Isso envolve investir em infraestrutura de reciclagem, promover a coleta seletiva e conscientizar sobre a importância de descartar resíduos de maneira responsável.<br>3. Regulação de descargas industriais e de esgotos: Reforçar as regulamentações para controlar as descargas industriais e de esgotos que podem poluir os mares. Isso inclui a implementação de tecnologias de tratamento de águas residuais e a aplicação de padrões mais rigorosos para a liberação de poluentes.<br>4. Proteção de ecossistemas marinhos: Estabelecer áreas marinhas protegidas e promover a conservação de ecossistemas costeiros, como recifes de coral e manguezais, que desempenham um papel fundamental na filtragem de poluentes e na proteção da biodiversidade marinha.<br>5. Monitoramento e fiscalização: Aumentar o monitoramento e a fiscalização das atividades que podem contribuir para a poluição marinha, como o transporte marítimo, a pesca e as operações industriais. Isso pode ser feito por meio de tecnologias de monitoramento remoto, inspeções regulares e aplicação rigorosa das leis ambientais.</html>");
        novaLabel2.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel2.setForeground(new Color(83, 83, 83));
        novaLabel2.setAlignmentX(Component.LEFT_ALIGNMENT); // Define o alinhamento horizontal da novaLabel;

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