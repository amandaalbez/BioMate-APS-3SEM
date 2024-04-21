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

        JPanel panel1 = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(janela2.class.getResource("img\\fundo5.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        //titulo - label_titulo
        JLabel label_titulo = new JLabel("Sobre os 3 R's");
        label_titulo.setFont(new Font("Calibri", Font.BOLD, 28));
        label_titulo.setForeground(new Color(23,67,68));
        label_titulo.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(label_titulo);
        //novalabel
        JLabel novaLabel = new JLabel("<html>Os 3 “R’s” da sustentabilidade significam: reduzir, reutilizar e reciclar, ou seja, reduzir ao máximo o consumo, reutilizar produtos e materiais (o quanto puder ser reutilizado) e reciclar, nada mais que reciclar itens que tiverem chegado ao fim de sua vida útil.\n" +
                "Com essas práticas é possível diminuir os gastos, principalmente no setor industrial, favorecer a sustentabilidade global e contribuir para a reversão dos impactos negativos causados na natureza ao longo dos anos.\n</html>");
        novaLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel.setForeground(new Color(83, 83, 83));
        novaLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(novaLabel);

        //subtitulo1 - label_titulo2
        JLabel label_titulo1 = new JLabel("Reduzir");
        label_titulo1.setFont(new Font("Calibri", Font.BOLD, 20));
        label_titulo1.setForeground(new Color(23,67,68));
        label_titulo1.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(label_titulo1);
        //novalabel1
        JLabel novaLabel1 = new JLabel("<html>O objetivo da “redução” é a aquisição de bens e serviços de acordo com as reais necessidades de consumo para evitar desperdícios, economizando energia, água, alimentos e combustível, atentando-se sempre para a utilização consciente desses recursos.</html>");
        novaLabel1.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel1.setForeground(new Color(83, 83, 83));
        novaLabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(novaLabel1);

        //subtitulo2 - label_titulo2
        JLabel label_titulo2 = new JLabel("Reutilizar");
        label_titulo2.setFont(new Font("Calibri", Font.BOLD, 20));
        label_titulo2.setForeground(new Color(23,67,68));
        label_titulo2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(label_titulo2);
        //novalabel2
        JLabel novaLabel2 = new JLabel("<html>A reutilização contribui para recursos renováveis utilizados para fabricar cada vez mais bens de consumo, pois quando utilizamos um produto, simplesmente atribuímos mais tempo ao seu uso, prolongando sua vida útil.</html>");
        novaLabel2.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel2.setForeground(new Color(83, 83, 83));
        novaLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(novaLabel2);

        //subtitulo3 - label_titulo3
        JLabel label_titulo3 = new JLabel("Reciclar");
        label_titulo3.setFont(new Font("Calibri", Font.BOLD, 20));
        label_titulo3.setForeground(new Color(23,67,68));
        label_titulo3.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(label_titulo3);
        //novalabel2
        JLabel novaLabel3 = new JLabel("<html>envolve o processamento de materiais por meio de sua transformação física ou química, geralmente em forma de matéria-prima para produção de novos produtos e bens de consumo onde um produto reciclável é descartado corretamente para coleta seletiva, que se encarregará de destinar os materiais para os lugares corretos.\n</html>");
        novaLabel3.setFont(new Font("Calibri", Font.BOLD, 14));
        novaLabel3.setForeground(new Color(83, 83, 83));
        novaLabel3.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel1.add(novaLabel3);



        panel1.add(Box.createVerticalStrut(20));

        add(panel1);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(janela3::new);
    }
}
