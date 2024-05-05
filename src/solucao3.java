import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class solucao3 extends JFrame {
    public solucao3() {

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
        JMenuItem pgA = new JMenuItem("3 R's");

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
                ImageIcon backgroundImage = new ImageIcon(solucao3.class.getResource("img/fundo4.png"));
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem ao redor do painel
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        // Adiciona um círculo com uma imagem e um texto
        BufferedImage circleImage = loadImage("C:\\Users\\Master\\OneDrive\\Área de Trabalho\\Faculdade\\3 Sem\\APSTeste 4\\src\\img\\NatalyNeri.png"); // Substitua pelo caminho da sua imagem
        CirclePanel circlePanel = new CirclePanel(circleImage, "Natály Neri");
        panel1.add(circlePanel);

        // Label2 - Título "Solução"
        JLabel label2 = new JLabel("<html>Solução</html>");
        label2.setFont(new Font("Calibri", Font.BOLD, 22));
        label2.setForeground(new Color(23, 67, 68));
        label2.setAlignmentX(Component.LEFT_ALIGNMENT);

        // novaLabel2 - Sobre queimadas
        JLabel novaLabel2 = new JLabel("<html></html>");
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

    // Método para carregar a imagem
    private BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(solucao3::new);
    }

    private static class CirclePanel extends JPanel {
        private BufferedImage image;
        private String text;

        public CirclePanel(BufferedImage image, String text) {
            this.image = image;
            this.text = text;
            setOpaque(false); // Torna o JPanel transparente
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Obtém as dimensões do painel
            int width = getWidth();
            int height = getHeight();

            // Calcula as coordenadas do círculo
            int circleDiameter = Math.min(width, height) / 2;
            int circleX = (width - circleDiameter) / 2;
            int circleY = (height - circleDiameter) / 2;

            // Desenha o círculo
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.BLUE);
            g2d.fill(new Ellipse2D.Double(circleX, circleY, circleDiameter, circleDiameter));

            // Desenha a imagem dentro do círculo
            if (image != null) {
                BufferedImage clippedImage = createClippedImage(image, circleDiameter);
                int imgX = circleX;
                int imgY = circleY;
                g2d.drawImage(clippedImage, imgX, imgY, this);
            }

            // Desenha o texto abaixo do círculo
            if (text != null) {
                FontMetrics fm = g2d.getFontMetrics();
                int textWidth = fm.stringWidth(text);
                int textX = (width - textWidth) / 2;
                int textY = circleY + circleDiameter + fm.getHeight() + 10; // 10 pixels de espaço
                g2d.drawString(text, textX, textY);
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200); // Tamanho padrão do painel
        }

        // Método para criar uma imagem cortada em forma de círculo
        private BufferedImage createClippedImage(BufferedImage image, int diameter) {
            BufferedImage clippedImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = clippedImage.createGraphics();
            Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, diameter, diameter);
            g2d.setClip(ellipse);
            g2d.drawImage(image, 0, 0, diameter, diameter, null);
            g2d.dispose();
            return clippedImage;
        }
    }
}
