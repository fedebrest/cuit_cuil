package client;

import java.awt.Desktop;
import java.awt.Dimension;

import java.awt.Image;
import java.awt.Rectangle;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import java.net.URI;

import java.net.URISyntaxException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {
    private Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("CUIL-CUIT.png"));
    private String[] items = {"20-Hombre","27-Mujer","30-Empresa"};
    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel(items);
    private MiCuil miCuil = new MiCuil();
    private JComboBox jComboBox1 = new JComboBox();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel1 = new JLabel();
    private JButton jButton1 = new JButton();
    private JLabel jLabel2 = new JLabel();
    private JTextField jTextField2 = new JTextField();
    private JButton jButton2 = new JButton();
    private JSeparator jSeparator1 = new JSeparator();
    private JLabel jLabel3 = new JLabel();
    private JTextField jTextField3 = new JTextField();
    private JButton jButton3 = new JButton();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private JButton jButton6 = new JButton();
    private JButton jButton7 = new JButton();
    private JSeparator jSeparator2 = new JSeparator();

    public VentanaPrincipal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(371, 428));
        this.setTitle("Calcular CUIL o CUIT");
        this.setResizable(false);
        jComboBox1.setBounds(new Rectangle(5, 25, 135, 25));
        jTextField1.setBounds(new Rectangle(150, 25, 205, 25));
        jLabel1.setText("Escribir un DNI");
        jLabel1.setBounds(new Rectangle(150, 5, 205, 20));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jButton1.setText("Calcular");
        jButton1.setBounds(new Rectangle(100, 60, 200, 35));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jLabel2.setText("CUIL/T = ");
        jLabel2.setBounds(new Rectangle(5, 105, 75, 25));
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jTextField2.setBounds(new Rectangle(85, 105, 165, 27));
        jTextField2.setEditable(false);
        jButton2.setText("Copiar");
        jButton7.setText("ANSES");
        jButton2.setBounds(new Rectangle(260, 102, 100, 32));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        jSeparator1.setBounds(new Rectangle(5, 150, 350, 5));
        jLabel3.setText("Escribir un CUIL o CUIT para verificar");
        jLabel3.setBounds(new Rectangle(6, 153, 350, 23));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField3.setBounds(new Rectangle(84, 186, 166, 25));
        jButton3.setText("Verificar");
     //   jButton4.setText("CUIL/T = ");
        jLabel4.setText("CUIL/T = ");
        jButton3.setBounds(new Rectangle(100, 220, 200, 35));
        jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton3_actionPerformed(e);
                }
            });
        jLabel5.setText("¿...?");
        jLabel5.setBounds(new Rectangle(100, 265, 200, 30));
        jLabel4.setBounds(new Rectangle(0, 185, 78, 26));
        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("<html><a href='https://clincash.com.ar'>https://clincash.com.ar</a><html>");
        jLabel6.setBounds(new Rectangle(5, 365, 355, 25));
        jButton4.setText("AFIP");
        jButton4.setBounds(new Rectangle(12, 306, 97, 50));
        jButton4.setToolTipText("http://www.afip.gov.ar/mercurio/consultapadron/buscarcontribuyente.aspx");
        jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton4_actionPerformed(e);
                }
            });
        jButton5.setText("Clincash");
        jButton5.setBounds(new Rectangle(254, 307, 96, 49));
        jButton6.setText("Pegar");
        jButton6.setBounds(new Rectangle(260, 181, 101, 32));
        jButton7.setBounds(new Rectangle(133, 308, 95, 47));
        jButton7.setToolTipText("https://www.anses.gob.ar");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton7_actionPerformed(e);
            }
        });
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton6_actionPerformed(e);
            }
        });
        jButton5.setToolTipText("https://clincash.com.ar");
        jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton5_actionPerformed(e);
                }
            });
        jSeparator2.setBounds(new Rectangle(5, 295, 350, 5));
        this.getContentPane().add(jSeparator2, null);
        this.getContentPane().add(jButton7, null);
        this.getContentPane().add(jButton6, null);
        this.getContentPane().add(jButton5, null);
        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jSeparator1, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jComboBox1, null);
        jComboBox1.setModel(dcbm);
        jComboBox1.setSelectedIndex(0);
        this.setIconImage(icon);
        
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        miCuil.setTipoDNI(this.jComboBox1.getSelectedItem().toString().substring(0, 2), this.jTextField1.getText().replace(".", "").trim());
       // this.jTextField2.setText("");
        this.jTextField2.setText(miCuil.getCuil());
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        if(miCuil.verificarCUIL(jTextField3.getText().replace("-", "").trim())==true) {
            this.jLabel5.setText(jTextField3.getText().trim() + " Correcto");
        }else{
            this.jLabel5.setText(jTextField3.getText().trim() + " !Incorrecto¡");
        }
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        try {
            URI uri = new URI(jButton4.getToolTipText());
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
        }catch(IOException ex){
        }
    }

    private void jButton5_actionPerformed(ActionEvent e) {
        try {
            URI uri = new URI(jButton5.getToolTipText());
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
        }catch(IOException ex){
        }
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(jTextField2.getText());
        cb.setContents(ss, ss);
    }

    private void jButton6_actionPerformed(ActionEvent e) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        Clipboard clip = tool.getSystemClipboard();
        Transferable trans = clip.getContents(null);
        Object objeto;
        try {
            objeto = trans.getTransferData(DataFlavor.stringFlavor);
        } catch (IOException f) {
            return;
        } catch (UnsupportedFlavorException f) {
            return;
        }
        String str = (String) objeto;
        this.jTextField3.setText(str);
    }

    private void jButton7_actionPerformed(ActionEvent e) {
        try {
            URI uri = new URI(jButton7.getToolTipText());
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
        }catch(IOException ex){
        }
    }
}


