package edu.jiangxin.apktoolbox.help;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jiangxin
 * @author 2018-09-30
 *
 */
public class ContributeActionListener implements ActionListener {
    
    private static Logger logger = LogManager.getLogger(ContributeActionListener.class);

    @Override
    public void actionPerformed(ActionEvent e) {
        URI uri;
        try {
            uri = new URI("https://github.com/jiangxincode/ApkToolBoxGUI");
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
            logger.error("URISyntaxException", ex);
        } catch (IOException ex) {
            logger.error("IOException", ex);
        }
    }

}
