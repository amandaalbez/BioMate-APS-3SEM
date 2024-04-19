import javax.swing.*;
import java.awt.*;

public class Splash {
    private final int LARGURA_IMG = 420;
    private final int ALTURA_IMG = 250;
    private final int TEMPO_DE_SPLASH = 3000; // Reduzido para 3 segundos
    private final String CAMINHO_IMAGEM = "img\\splash.png";

    public Splash(){
        JWindow janelaSplash = new JWindow();

        janelaSplash.getContentPane().add(
                new JLabel(
                        "",
                        new ImageIcon(getClass().getResource(CAMINHO_IMAGEM)),
                        SwingConstants.CENTER
                )
        );

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        janelaSplash.setBounds(
                (dimension.width - LARGURA_IMG) / 2,
                (dimension.height - ALTURA_IMG) / 2,
                LARGURA_IMG,
                ALTURA_IMG
        );

        janelaSplash.setVisible(true);
        try{
            Thread.sleep(TEMPO_DE_SPLASH);
        }catch(InterruptedException e){}

        janelaSplash.dispose(); // Fechar a janela splash apÃ³s o tempo definido
    }
}