/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mehmurray.jframes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
import java.util.Objects;
import cit260.mehmurray.ascii.ASCII_Tiles;
import cit260.mehmurray.menus.MainMenu;
import cit260.mehmurray.menus.HelpMenu;
import cit260.mehmurray.menus.Menu;
import meh.murray.PlayMenu;
import meh.murray.Options;
import cit260.mehmurray.jframes.OptionsFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.util.Timer;

/**
 *
 * @author PATRICKS
 */
public class MainFrame extends javax.swing.JFrame {

    public Boolean getDebug() {
        return debug;
    }

    public int[] getArrTiles1() {
        return arrTiles1;
    }

    public int[] getArrTiles2() {
        return arrTiles2;
    }

    public int[] getArrMatched() {
        return arrMatched;
    }

    public int getT1_array_num() {
        return t1_array_num;
    }

    public int getT2_array_num() {
        return t2_array_num;
    }

    public int getT1_slider_position() {
        return t1_slider_position;
    }

    public int getT2_slider_position() {
        return t2_slider_position;
    }

    public String getT1_character() {
        return t1_character;
    }

    public String getT2_character() {
        return t2_character;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public String getMatch() {
        return match;
    }

    public String getMismatch() {
        return mismatch;
    }

    public JCheckBox getCbDebug() {
        return cbDebug;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPanelMeh() {
        return jPanelMeh;
    }

    public JPanel getjPanelMurray() {
        return jPanelMurray;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JSlider getjSlide1() {
        return jSlide1;
    }

    public JSlider getjSlide2() {
        return jSlide2;
    }

    public JButton getJbClear() {
        return jbClear;
    }

    public JButton getJbHelp() {
        return jbHelp;
    }

    public JButton getJbQuit() {
        return jbQuit;
    }

    public JLabel getJlSelectTile1() {
        return jlSelectTile1;
    }

    public JLabel getJlSelectTile2() {
        return jlSelectTile2;
    }

    public JLabel getJlTitle() {
        return jlTitle;
    }

    public JPanel getJpBody() {
        return jpBody;
    }

    public JPanel getJpFirstTile() {
        return jpFirstTile;
    }

    public JPanel getJpGame() {
        return jpGame;
    }

    public JPanel getJpOptions() {
        return jpOptions;
    }

    public JPanel getJpTitle() {
        return jpTitle;
    }

    public JSlider getJslideMatchPairs() {
        return jslideMatchPairs;
    }

    public JTextArea getJtMatchStatus() {
        return jtMatchStatus;
    }

    public JTextField getTxtMatch() {
        return txtMatch;
    }

    public JTextField getTxtTile() {
        return txtTile;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public void setArrTiles1(int[] arrTiles1) {
        this.arrTiles1 = arrTiles1;
    }

    public void setArrTiles2(int[] arrTiles2) {
        this.arrTiles2 = arrTiles2;
    }

    public void setArrMatched(int[] arrMatched) {
        this.arrMatched = arrMatched;
    }

    public void setT1_array_num(int t1_array_num) {
        this.t1_array_num = t1_array_num;
    }

    public void setT2_array_num(int t2_array_num) {
        this.t2_array_num = t2_array_num;
    }

    public void setT1_slider_position(int t1_slider_position) {
        this.t1_slider_position = t1_slider_position;
    }

    public void setT2_slider_position(int t2_slider_position) {
        this.t2_slider_position = t2_slider_position;
    }

    public void setT1_character(String t1_character) {
        this.t1_character = t1_character;
    }

    public void setT2_character(String t2_character) {
        this.t2_character = t2_character;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public void setMismatch(String mismatch) {
        this.mismatch = mismatch;
    }

    public void setCbDebug(JCheckBox cbDebug) {
        this.cbDebug = cbDebug;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjPanelMeh(JPanel jPanelMeh) {
        this.jPanelMeh = jPanelMeh;
    }

    public void setjPanelMurray(JPanel jPanelMurray) {
        this.jPanelMurray = jPanelMurray;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjSlide1(JSlider jSlide1) {
        this.jSlide1 = jSlide1;
    }

    public void setjSlide2(JSlider jSlide2) {
        this.jSlide2 = jSlide2;
    }

    public void setJbClear(JButton jbClear) {
        this.jbClear = jbClear;
    }

    public void setJbHelp(JButton jbHelp) {
        this.jbHelp = jbHelp;
    }

    public void setJbQuit(JButton jbQuit) {
        this.jbQuit = jbQuit;
    }

    public void setJlSelectTile1(JLabel jlSelectTile1) {
        this.jlSelectTile1 = jlSelectTile1;
    }

    public void setJlSelectTile2(JLabel jlSelectTile2) {
        this.jlSelectTile2 = jlSelectTile2;
    }

    public void setJlTitle(JLabel jlTitle) {
        this.jlTitle = jlTitle;
    }

    public void setJpBody(JPanel jpBody) {
        this.jpBody = jpBody;
    }

    public void setJpFirstTile(JPanel jpFirstTile) {
        this.jpFirstTile = jpFirstTile;
    }

    public void setJpGame(JPanel jpGame) {
        this.jpGame = jpGame;
    }

    public void setJpOptions(JPanel jpOptions) {
        this.jpOptions = jpOptions;
    }

    public void setJpTitle(JPanel jpTitle) {
        this.jpTitle = jpTitle;
    }

    public void setJslideMatchPairs(JSlider jslideMatchPairs) {
        this.jslideMatchPairs = jslideMatchPairs;
    }

    public void setJtMatchStatus(JTextArea jtMatchStatus) {
        this.jtMatchStatus = jtMatchStatus;
    }

    public void setTxtMatch(JTextField txtMatch) {
        this.txtMatch = txtMatch;
    }

    public void setTxtTile(JTextField txtTile) {
        this.txtTile = txtTile;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MainFrame other = (MainFrame) obj;
        if (!Objects.equals(this.debug, other.debug)) {
            return false;
        }
        if (!Arrays.equals(this.arrTiles1, other.arrTiles1)) {
            return false;
        }
        if (!Arrays.equals(this.arrTiles2, other.arrTiles2)) {
            return false;
        }
        if (!Arrays.equals(this.arrMatched, other.arrMatched)) {
            return false;
        }
        if (this.t1_array_num != other.t1_array_num) {
            return false;
        }
        if (this.t2_array_num != other.t2_array_num) {
            return false;
        }
        if (this.t1_slider_position != other.t1_slider_position) {
            return false;
        }
        if (this.t2_slider_position != other.t2_slider_position) {
            return false;
        }
        if (!Objects.equals(this.t1_character, other.t1_character)) {
            return false;
        }
        if (!Objects.equals(this.t2_character, other.t2_character)) {
            return false;
        }
        if (this.matchCount != other.matchCount) {
            return false;
        }
        if (!Objects.equals(this.match, other.match)) {
            return false;
        }
        if (!Objects.equals(this.mismatch, other.mismatch)) {
            return false;
        }
        if (!Objects.equals(this.cbDebug, other.cbDebug)) {
            return false;
        }
        if (!Objects.equals(this.jPanel1, other.jPanel1)) {
            return false;
        }
        if (!Objects.equals(this.jPanelMeh, other.jPanelMeh)) {
            return false;
        }
        if (!Objects.equals(this.jPanelMurray, other.jPanelMurray)) {
            return false;
        }
        if (!Objects.equals(this.jScrollPane1, other.jScrollPane1)) {
            return false;
        }
        if (!Objects.equals(this.jbClear, other.jbClear)) {
            return false;
        }
        if (!Objects.equals(this.jbHelp, other.jbHelp)) {
            return false;
        }
        if (!Objects.equals(this.jbQuit, other.jbQuit)) {
            return false;
        }
        if (!Objects.equals(this.jlSelectTile1, other.jlSelectTile1)) {
            return false;
        }
        if (!Objects.equals(this.jlSelectTile2, other.jlSelectTile2)) {
            return false;
        }
        if (!Objects.equals(this.jlTitle, other.jlTitle)) {
            return false;
        }
        if (!Objects.equals(this.jpBody, other.jpBody)) {
            return false;
        }
        if (!Objects.equals(this.jpFirstTile, other.jpFirstTile)) {
            return false;
        }
        if (!Objects.equals(this.jpGame, other.jpGame)) {
            return false;
        }
        if (!Objects.equals(this.jpOptions, other.jpOptions)) {
            return false;
        }
        if (!Objects.equals(this.jpTitle, other.jpTitle)) {
            return false;
        }
        if (!Objects.equals(this.jslideMatchPairs, other.jslideMatchPairs)) {
            return false;
        }
        if (!Objects.equals(this.jtMatchStatus, other.jtMatchStatus)) {
            return false;
        }
        if (!Objects.equals(this.txtMatch, other.txtMatch)) {
            return false;
        }
        if (!Objects.equals(this.txtTile, other.txtTile)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MainFrame{" + "debug=" + debug + ", arrTiles1=" + arrTiles1 + ", arrTiles2=" + arrTiles2 + ", arrMatched=" + arrMatched + ", t1_array_num=" + t1_array_num + ", t2_array_num=" + t2_array_num + ", t1_slider_position=" + t1_slider_position + ", t2_slider_position=" + t2_slider_position + ", t1_character=" + t1_character + ", t2_character=" + t2_character + ", matchCount=" + matchCount + ", match=" + match + ", mismatch=" + mismatch + ", cbDebug=" + cbDebug + ", jPanel1=" + jPanel1 + ", jPanelMeh=" + jPanelMeh + ", jPanelMurray=" + jPanelMurray + ", jScrollPane1=" + jScrollPane1 + ", jSlide1=" + jSlide1 + ", jSlide2=" + jSlide2 + ", jbClear=" + jbClear + ", jbHelp=" + jbHelp + ", jbQuit=" + jbQuit + ", jlSelectTile1=" + jlSelectTile1 + ", jlSelectTile2=" + jlSelectTile2 + ", jlTitle=" + jlTitle + ", jpBody=" + jpBody + ", jpFirstTile=" + jpFirstTile + ", jpGame=" + jpGame + ", jpOptions=" + jpOptions + ", jpTitle=" + jpTitle + ", jslideMatchPairs=" + jslideMatchPairs + ", jtMatchStatus=" + jtMatchStatus + ", txtMatch=" + txtMatch + ", txtTile=" + txtTile + '}';
    }
    
    private Boolean debug = false;
    private int[] arrTiles1;
    private int[] arrTiles2;
    public int[] arrMatched;
    private int t1_array_num, t2_array_num, t1_slider_position, t2_slider_position;
    private String t1_character, t2_character;
    private int matchCount = 0;
    private String match = "match";
    private String mismatch = "doh!";
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        Image Meh; Image Mur;
        URL meh; URL mur;
                
        //URLs for meh and murray pictures
        try
        {
        meh = new URL("http://i20.photobucket.com/albums/b212/HighlandSniper58/Emoticons/homer-simpson-meh.png");
        mur = new URL("http://1.bp.blogspot.com/_N1npI6e3LGQ/Sj-uVQ86UMI/AAAAAAAABRI/qWfsaLhwkLM/s1600-h/Ghostbusters-Peter-Venkman.gif");
        Meh = Toolkit.getDefaultToolkit().getImage(meh);
        Mur = Toolkit.getDefaultToolkit().getImage(mur);
        
        jPanelMeh.imageUpdate(Meh, 100, 100, 100, 100, 100);
        jPanelMurray.imageUpdate(Mur, 100, 100, 100, 100, 100);
        }
        catch(Exception U)
        {
            System.out.println(U.toString());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jbHelp = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jpGame = new javax.swing.JPanel();
        jpFirstTile = new javax.swing.JPanel();
        txtTile = new javax.swing.JTextField();
        jSlide1 = new javax.swing.JSlider();
        jSlide2 = new javax.swing.JSlider();
        jlSelectTile1 = new javax.swing.JLabel();
        jlSelectTile2 = new javax.swing.JLabel();
        jPanelMeh = new javax.swing.JPanel();
        txtMatches = new javax.swing.JTextField();
        jPanelMurray = new javax.swing.JPanel();
        txtMatch = new javax.swing.JTextField();
        jpOptions = new javax.swing.JPanel();
        jslideMatchPairs = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMatchStatus = new javax.swing.JTextArea();
        cbDebug = new javax.swing.JCheckBox();
        jbClear = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("memory");
        setResizable(false);

        jpBody.setBackground(new java.awt.Color(204, 204, 204));

        jpTitle.setBackground(new java.awt.Color(204, 204, 204));

        jlTitle.setBackground(new java.awt.Color(204, 204, 204));
        jlTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("meh, murray");
        jlTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jbHelp.setBackground(new java.awt.Color(153, 153, 153));
        jbHelp.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbHelp.setForeground(new java.awt.Color(0, 51, 153));
        jbHelp.setText("?");
        jbHelp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHelpActionPerformed(evt);
            }
        });

        jbQuit.setBackground(new java.awt.Color(153, 153, 153));
        jbQuit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbQuit.setForeground(new java.awt.Color(0, 51, 153));
        jbQuit.setText("X");
        jbQuit.setToolTipText("");
        jbQuit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpGame.setBackground(new java.awt.Color(204, 204, 204));

        jpFirstTile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpFirstTile.setToolTipText("");
        jpFirstTile.setPreferredSize(new java.awt.Dimension(335, 140));

        txtTile.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtTile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTile.setToolTipText("");
        txtTile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        txtTile.setEnabled(false);

        jSlide1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jSlide1.setMajorTickSpacing(1);
        jSlide1.setMaximum(16);
        jSlide1.setMinimum(1);
        jSlide1.setMinorTickSpacing(1);
        jSlide1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlide1.setPaintLabels(true);
        jSlide1.setPaintTicks(true);
        jSlide1.setSnapToTicks(true);
        jSlide1.setEnabled(false);
        jSlide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSlide1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlide1MouseReleased(evt);
            }
        });
        jSlide1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlide1StateChanged(evt);
            }
        });
        jSlide1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlide1MouseDragged(evt);
            }
        });

        jSlide2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jSlide2.setMajorTickSpacing(1);
        jSlide2.setMaximum(32);
        jSlide2.setMinimum(17);
        jSlide2.setMinorTickSpacing(1);
        jSlide2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlide2.setPaintLabels(true);
        jSlide2.setPaintTicks(true);
        jSlide2.setSnapToTicks(true);
        jSlide2.setEnabled(false);
        jSlide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlide2MouseReleased(evt);
            }
        });
        jSlide2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlide2StateChanged(evt);
            }
        });

        jlSelectTile1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jlSelectTile1.setText("First Selection");

        jlSelectTile2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jlSelectTile2.setText("Second Selection");

        jPanelMeh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtMatches.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtMatches.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatches.setToolTipText("");
        txtMatches.setBorder(null);
        txtMatches.setEnabled(false);
        txtMatches.setOpaque(false);

        javax.swing.GroupLayout jPanelMehLayout = new javax.swing.GroupLayout(jPanelMeh);
        jPanelMeh.setLayout(jPanelMehLayout);
        jPanelMehLayout.setHorizontalGroup(
            jPanelMehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMatches, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelMehLayout.setVerticalGroup(
            jPanelMehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMatches, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanelMurray.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtMatch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtMatch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatch.setToolTipText("");
        txtMatch.setBorder(null);
        txtMatch.setEnabled(false);
        txtMatch.setOpaque(false);

        javax.swing.GroupLayout jPanelMurrayLayout = new javax.swing.GroupLayout(jPanelMurray);
        jPanelMurray.setLayout(jPanelMurrayLayout);
        jPanelMurrayLayout.setHorizontalGroup(
            jPanelMurrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMatch, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelMurrayLayout.setVerticalGroup(
            jPanelMurrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMatch, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpFirstTileLayout = new javax.swing.GroupLayout(jpFirstTile);
        jpFirstTile.setLayout(jpFirstTileLayout);
        jpFirstTileLayout.setHorizontalGroup(
            jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFirstTileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlide1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFirstTileLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlSelectTile1)))
                .addGap(22, 22, 22)
                .addGroup(jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMurray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addComponent(jPanelMeh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlide2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSelectTile2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpFirstTileLayout.setVerticalGroup(
            jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFirstTileLayout.createSequentialGroup()
                .addGroup(jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpFirstTileLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanelMeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelMurray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFirstTileLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSlide1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlide2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpFirstTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSelectTile1)
                            .addComponent(jlSelectTile2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSlide1.getAccessibleContext().setAccessibleName("");
        jSlide1.getAccessibleContext().setAccessibleDescription("");

        jpOptions.setBackground(new java.awt.Color(204, 204, 204));
        jpOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "x pairs (new game)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        jslideMatchPairs.setBackground(new java.awt.Color(204, 204, 204));
        jslideMatchPairs.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jslideMatchPairs.setMajorTickSpacing(2);
        jslideMatchPairs.setMaximum(16);
        jslideMatchPairs.setMinorTickSpacing(1);
        jslideMatchPairs.setPaintLabels(true);
        jslideMatchPairs.setPaintTicks(true);
        jslideMatchPairs.setSnapToTicks(true);
        jslideMatchPairs.setToolTipText("");
        jslideMatchPairs.setValue(0);
        jslideMatchPairs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslideMatchPairsStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jpOptionsLayout = new javax.swing.GroupLayout(jpOptions);
        jpOptions.setLayout(jpOptionsLayout);
        jpOptionsLayout.setHorizontalGroup(
            jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jslideMatchPairs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpOptionsLayout.setVerticalGroup(
            jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOptionsLayout.createSequentialGroup()
                .addComponent(jslideMatchPairs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtMatchStatus.setColumns(20);
        jtMatchStatus.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtMatchStatus.setLineWrap(true);
        jtMatchStatus.setRows(5);
        jtMatchStatus.setWrapStyleWord(true);
        jtMatchStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jtMatchStatus);

        javax.swing.GroupLayout jpGameLayout = new javax.swing.GroupLayout(jpGame);
        jpGame.setLayout(jpGameLayout);
        jpGameLayout.setHorizontalGroup(
            jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGameLayout.createSequentialGroup()
                .addGroup(jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpFirstTile, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpGameLayout.setVerticalGroup(
            jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFirstTile, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );

        cbDebug.setBackground(new java.awt.Color(204, 204, 204));
        cbDebug.setText("v");
        cbDebug.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDebugItemStateChanged(evt);
            }
        });
        cbDebug.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbDebugPropertyChange(evt);
            }
        });

        jbClear.setBackground(new java.awt.Color(255, 255, 255));
        jbClear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbClear.setForeground(new java.awt.Color(0, 51, 153));
        jbClear.setText("-");
        jbClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbClearMouseClicked(evt);
            }
        });
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbClear, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbDebug)
                .addGap(14, 14, 14))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDebug)
                    .addComponent(jbClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jbQuitActionPerformed

    private void jbHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHelpActionPerformed
        
        try
        {
            // Create and display the form
            java.awt.EventQueue.invokeLater(new Runnable()
                    {
                        public void run()
                        {
                            HelpFrame helpFrame = new HelpFrame();
                            helpFrame.setLocationRelativeTo(null);
                            helpFrame.setVisible(true);
                            //boolean running = true;
                        }
                    });
        }
        catch(Exception x)
        {
            System.out.println("Unexpected error: " + x.getMessage());
        }          
    }//GEN-LAST:event_jbHelpActionPerformed

    public boolean tileMatch(int t1an, int t2an, int t1sp, int t2sp, String t1c, String t2c, int invoker)
    {
//tileMatch(getT1_array_num(), getT2_array_num(), getT1_slider_position(), getT2_slider_position(), getT1_character(), getT2_character(), 1);
        
        int tilePairs = jslideMatchPairs.getValue();
        
        //Check for nulls
        if (t1c == null)
        {
            if (debug)
            {
                jtMatchStatus.append("\n tileMatch: Tile 1 is null (not chosen yet)");
            }
            return false;
        }
                  
        if (t2c == null)
        {
            if (debug)
            {
                jtMatchStatus.append("\n tileMatch: Tile 2 is null (not chosen yet)");
            }
            return false;
        }
        
        //manual checking...
        
        
        
        //Check for matches
        
        if (t1c.equals(t2c))
        {
            if (debug)
            {
                jtMatchStatus.append("\n tileMatch: " + t1c + " matches " + t2c);
            }

            //if (checkMatch(t1sp, t2sp, invoker))
            if (checkMatch2(t1c, t2c, invoker))
            {
                jtMatchStatus.append("\n" + match);
                txtMatch.setText(match);
                matchCount = matchCount + 1;
                txtMatches.setText(matchCount + "");
                checkMatchCount(tilePairs, matchCount);
                return true;
            }
        }
        else
        {
            if (debug)
            {
                jtMatchStatus.append("\n tileMatch: " + t1c + " does not match " + t2c);
            }
            // Mismatches not currently being displayed in log window without debug on.
            //jtMatchStatus.append("\n Sorry, try again.");
            return false;
        }
        //Default return = false
        return false;
    }
    
    public void checkMatchCount(int maxMatches, int numMatches)
    {
        if (debug)
        {
            jtMatchStatus.append("\n checkMatchCount: \n Maximum Matches: " + maxMatches + "\n Actual Matches: " + numMatches);
        }
        
        txtMatches.setText(numMatches + "");
        
        if (numMatches == maxMatches)
        {
            txtMatch.setText("victory!");
            clearGame();
            //return true;
        }
        else
        {
            //return false;
        }
    }
    
    public void clearGame()
    {
        jSlide1.setEnabled(false);
        jSlide2.setEnabled(false);
        setMatchCount(0);
        txtTile.setText(null);
//        txtMatch.setText("");
//        Arrays.fill(arrMatched, 99);
//       Arrays.fill(arrTiles1, 0);
//        Arrays.fill(arrTiles2, 0);
        
    }
    
    public boolean checkMatch(int t1sp, int t2sp, int invoker)
    {
        ASCII_Tiles t = new ASCII_Tiles();
        int[] arrMatchedTiles = new int[2];
        arrMatchedTiles[0] = t1sp;
        arrMatchedTiles[1] = t2sp;
        boolean passedCheck = false; //Assume false as default
        
        // Check both tiles
        for (int a : arrMatchedTiles)
        {
            // Check against previously matched tiles
            for (int m : arrMatched)
            {
                if (a == m)
                {
                    jtMatchStatus.append("\n Tile already matched: " + m);
                    txtMatch.setText(mismatch);
                    passedCheck = false;
                }
                else
                {
                    passedCheck = true;
                }
            }
        }
            
        //Return if false/the tile has already been matched
        if (!passedCheck)
        {
            return false;
        }           

// -- Exit if check fails -- //     

/* *************************** */
        
// -- Since the match has been confirmed, add both tiles to the arrMatched array for future checks -- //
        
        //int a = 0;
        String tilesChosen = null;
        boolean added = false;
  
        // Add both tiles
        for (int add : arrMatchedTiles)
        {
            // Check against previously matched tiles
            for (int a = 0; a <= arrMatched.length - 1; a++)
            {
                if (arrMatched[a] == 99)
                {
                    try
                    {
                        arrMatched[a] = (add);
                        tilesChosen = tilesChosen + "," + add;
                        //a++;
                        added = true;
                        break;
                    }
                    catch (Exception x)
                    {
                        added = false;
                        if (debug)
                        {
                            jtMatchStatus.append("\n checkMatch: " + x);                            
                        }
                    }
                }
                else
                {
                    //arrMatched[a] = 99;
                    added = false;
                }
            }
        }
            
        // Print list of matched tiles    
        if (debug)
        {
            for (int e : arrMatched)
            {
//                if (e != -99)
//                {
                   jtMatchStatus.append("\n checkMatch: Matched Tile: " + e);
//                }
            }
        }
        
        //Ensure values are written to array (they are being reset for some reason
        try
        {
            //setArrMatched({tilesChosen.substring(1))};
            //setArrMatched(arrMatched);
        }
        catch (Exception z)
        {
            
        }
        
        //Return if false/the tile has already been matched
        if (!added)
        {
            if (debug)
            {
                jtMatchStatus.append("\n checkMatch: Matches not successfully added to list of matched.");
            }
            return false;
        }              
            
        //Default return: No match or re-matched
        return false;
    }
    
public boolean checkMatch2(String t1c, String t2c, int invoker)
    {
        ASCII_Tiles t = new ASCII_Tiles();
        int[] arrMatchedTiles = new int[2];
        boolean passedCheck = false; //Assume false as default
        
        //Return if false/the tile has already been matched
        if (t1c.equals(t2c))
        {
            return true;
        }
        else
        {
            return false;
        }

// -- Exit if check fails -- //     

/* *************************** */
        
// -- Since the match has been confirmed, add both tiles to the arrMatched array for future checks -- //
        
//        int a = 0;
//        String tilesChosen = null;
//        boolean added = false;
//  
//         Add both tiles
//        for (int add : arrMatchedTiles)
//        {
//             Check against previously matched tiles
//            for (int a = 0; a <= arrMatched.length - 1; a++)
//            {
//                if (arrMatched[a] == 99)
//                {
//                    try
//                    {
//                        arrMatched[a] = (add);
//                        tilesChosen = tilesChosen + "," + add;
//                        a++;
//                        added = true;
//                        break;
//                    }
//                    catch (Exception x)
//                    {
//                        added = false;
//                        if (debug)
//                        {
//                            jtMatchStatus.append("\n checkMatch: " + x);                            
//                        }
//                    }
//                }
//                else
//                {
//                    arrMatched[a] = 99;
//                    added = false;
//                }
//            }
//        }
//            
//         Print list of matched tiles    
//        if (debug)
//        {
//            for (int e : arrMatched)
//            {
//                if (e != -99)
//                {
//                   jtMatchStatus.append("\n checkMatch: Matched Tile: " + e);
//                }
//            }
//        }
//        
//        Ensure values are written to array (they are being reset for some reason
//        try
//        {
//            setArrMatched({tilesChosen.substring(1))};
//            setArrMatched(arrMatched);
//        }
//        catch (Exception z)
//        {
//            
//        }
//        
//        Return if false/the tile has already been matched
//        if (!added)
//        {
//            if (debug)
//            {
//                jtMatchStatus.append("\n checkMatch: Matches not successfully added to list of matched.");
//            }
//            return false;
//        }              
//            
//        Default return: No match or re-matched
//        return false;
    }    
    
    
    public void setTileArrays1(int tilePairs)
    {
               
        try
        {
            ASCII_Tiles t = new ASCII_Tiles();
            arrTiles1 = t.createTileArrays1(tilePairs);
            
            if (debug)
            {
                String arr = "";
            
                for (int e : arrTiles1)
                {
                    arr = arr + "," + e;
                }
                jtMatchStatus.append("\n setTileArrays1: " + arr.substring(1));
            }
                    
        }
        catch (Exception xx)
        {
            if (debug)
            {
                jtMatchStatus.append("\n setTileArrays1: " + xx.toString());
            }
        }   

    }
    
    public void setTileArrays1(int tilePairs, boolean fixed)
    {
        try
        {
            ASCII_Tiles t = new ASCII_Tiles();
            arrTiles1 = t.createTileArrays1(tilePairs, true);
            
            if (debug)
            {
                String arr = "";
            
                for (int e : arrTiles1)
                {
                    arr = arr + "," + e;
                }
                jtMatchStatus.append("\n setTileArrays1: " + arr.substring(1));
            }
                    
        }
        catch (Exception xx)
        {
            if (debug)
            {
                jtMatchStatus.append("\n setTileArrays1: " + xx.toString());
            }
        }   

    }    
    
    public void setTileArrays2(int tilePairs2)
    {             
        try
        {
         // Second set of tiles, using the first set as the source: X / Chiasmus style... Meet in the middle!
         int o = (tilePairs2 - 1);
         arrTiles2 = new int[o + 1];
         for (int e : arrTiles1)
         {
            arrTiles2[o] = e;
            o--;
         }
         
        if (debug)
        {
            String arr2 = "";
            
            for (int f : arrTiles2)
            {
                arr2 = arr2 + "," + f;
            }
            jtMatchStatus.append("\n setTileArrays2: " + arr2.substring(1));
        }         

        }
        catch (Exception x)
        {
            if (debug)
            {
                jtMatchStatus.append("\n setTileArrays2: " + x.toString());
            }
        }

    }

    public void setTileArrays2(int tilePairs2, boolean fixed)
    {             
        try
        {
         // Second set of tiles, using the first set as the source: X / Chiasmus style... Meet in the middle!
         int o = (tilePairs2 - 1);
         arrTiles2 = new int[o + 1];
         for (int e : arrTiles1)
         {
            arrTiles2[o] = e;
            o--;
         }
         
        if (debug)
        {
            String arr2 = "";
            
            for (int f : arrTiles2)
            {
                arr2 = arr2 + "," + f;
            }
            jtMatchStatus.append("\n setTileArrays2: " + arr2.substring(1));
        }         

        }
        catch (Exception x)
        {
            if (debug)
            {
                jtMatchStatus.append("\n setTileArrays2: " + x.toString());
            }
        }

    }
    

    private void jslideMatchPairsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslideMatchPairsStateChanged

        
        // Clear previous values if clear method didn't work or fire)
        setMatchCount(0);
        txtMatches.setText("0");
        txtMatch.setText(null);
        txtTile.setText(null);
        jtMatchStatus.setText(null);
        
        // Start new game
        int tilePairs = jslideMatchPairs.getValue();
        // Enable controls
        if (tilePairs >= 4)
        {
        //jcbTile1.setEnabled(true);
        jSlide1.setEnabled(true);
        //jcbTile2.setEnabled(true);
        jSlide2.setEnabled(true);
        
        // Reset numbers on vertical sliders
        jSlide1.setMinimum(1);
        jSlide1.setValue(1);
        jSlide1.setMaximum(tilePairs);
        jSlide2.setMinimum(jSlide1.getMaximum() + 1);
        jSlide2.setValue(jSlide2.getMinimum());
        jSlide2.setMaximum(jSlide1.getMaximum() * 2);

        }
        else
        {
            //jcbTile1.setEnabled(false);
            jSlide1.setEnabled(false);
            //jcbTile2.setEnabled(false);
            jSlide2.setEnabled(false);
            return;
        }

        ASCII_Tiles t = new ASCII_Tiles();
        //t.createTileArray(tilePairs * 2);      
        setTileArrays1(tilePairs, true);
        setTileArrays2(tilePairs, true);    
        
        //Initialize arrMatched array
        //arrMatched = new int[tilePairs * 2];
        //Arrays.fill(arrMatched, 99);

    }//GEN-LAST:event_jslideMatchPairsStateChanged

    private void jSlide1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlide1StateChanged

    }//GEN-LAST:event_jSlide1StateChanged

    private void jSlide2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlide2StateChanged

    }//GEN-LAST:event_jSlide2StateChanged

    private void jSlide1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlide1MouseExited

    }//GEN-LAST:event_jSlide1MouseExited

    private void jSlide1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlide1MouseReleased
        
        ASCII_Tiles t = new ASCII_Tiles();
        try
        {
            setT1_slider_position(jSlide1.getValue()); //Slider position minus one for array compatibility
            setT1_array_num(arrTiles1[getT1_slider_position() - 1]); //Tile array value (not character value) pulled from the tile array
            setT1_character(t.returnTile(getT1_array_num())); //Tile value
            setT1_character(t.returnTile(getT1_array_num())); //Tile value
            txtTile.setText(getT1_character());
        }
        catch (Exception x)
        {
            if (debug)
            {
                jtMatchStatus.append("\n jSlide1:" + x.toString());           
            }           
        }
        
        //Scroll to the bottom
        jtMatchStatus.setCaretPosition(jtMatchStatus.getDocument().getLength());
        
        //Check for matches
        tileMatch(getT1_array_num(), getT2_array_num(), getT1_slider_position(), getT2_slider_position(), getT1_character(), getT2_character(), 1);        
        
        // Toggle sliders
        if (txtMatch.getText() != "victory!")
        {
            jSlide1.setEnabled(false);
            jSlide2.setEnabled(true);
        }
        else
        {
            jSlide1.setEnabled(false);
            jSlide2.setEnabled(false);           
        }
    }//GEN-LAST:event_jSlide1MouseReleased

    private void jSlide1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlide1MouseDragged

    }//GEN-LAST:event_jSlide1MouseDragged

    private void jSlide2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlide2MouseReleased
        
        ASCII_Tiles t = new ASCII_Tiles();
        try
        {
            setT2_slider_position(jSlide2.getValue()); //Slider position minus one for array compatibility
            int tilePairsPlus1 = jSlide1.getMaximum() + 1;
            setT2_array_num(arrTiles2[getT2_slider_position() - tilePairsPlus1]); //Tile array value (not character value) pulled from the tile array
            setT2_character(t.returnTile(getT2_array_num())); //Tile value
            txtTile.setText(getT2_character());
        }
        catch (Exception x)
        {
            if (debug)
            {
                jtMatchStatus.append("\n jSlide2:" + x.toString());           
            }           
        }
        
        //Scroll to the bottom
        jtMatchStatus.setCaretPosition(jtMatchStatus.getDocument().getLength());
        
        //Check for matches
        tileMatch(getT1_array_num(), getT2_array_num(), getT1_slider_position(), getT2_slider_position(), getT1_character(), getT2_character(), 1);
        
        // Toggle sliders
        if (txtMatch.getText() != "victory!")
        {
            jSlide1.setEnabled(true);
            jSlide2.setEnabled(false);
        }
        else
        {
            jSlide1.setEnabled(false);
            jSlide2.setEnabled(false);           
        }
    }//GEN-LAST:event_jSlide2MouseReleased

    private void cbDebugPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbDebugPropertyChange
 
    }//GEN-LAST:event_cbDebugPropertyChange

    private void cbDebugItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDebugItemStateChanged
        debug = cbDebug.isSelected();
    }//GEN-LAST:event_cbDebugItemStateChanged

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbClearActionPerformed

    private void jbClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbClearMouseClicked
        jtMatchStatus.setText(null);
    }//GEN-LAST:event_jbClearMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainFrame().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbDebug;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMeh;
    private javax.swing.JPanel jPanelMurray;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSlider jSlide1;
    public javax.swing.JSlider jSlide2;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbHelp;
    private javax.swing.JButton jbQuit;
    private javax.swing.JLabel jlSelectTile1;
    private javax.swing.JLabel jlSelectTile2;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpFirstTile;
    private javax.swing.JPanel jpGame;
    private javax.swing.JPanel jpOptions;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JSlider jslideMatchPairs;
    private javax.swing.JTextArea jtMatchStatus;
    private javax.swing.JTextField txtMatch;
    private javax.swing.JTextField txtMatches;
    private javax.swing.JTextField txtTile;
    // End of variables declaration//GEN-END:variables
}

