

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jardinGUI extends JFrame implements Interfaces_Test {
    private final int gridSize;
    private final JButton[][] buttons;
    private int selectedZone;
    private int selectedColumn;

    public jardinGUI(int gridSize) {
        this.gridSize = gridSize;
        buttons = new JButton[gridSize][gridSize];

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Jardin");

        JPanel gridPanel = new JPanel(new GridLayout(gridSize, gridSize));
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                JButton button = new JButton();
                button.setBackground(Color.WHITE);
                button.addActionListener(new ZoneButtonListener(row));
                gridPanel.add(button);
                buttons[row][col] = button;
            }
        }

        getContentPane().add(gridPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JButton tuyauButton = new JButton("Sélectionner une colonne pour le tuyau");
        tuyauButton.addActionListener(new TuyauButtonListener());
        controlPanel.add(tuyauButton);

        JLabel zoneLabel = new JLabel("Nombre de lignes pour la zone d'ombre : ");
        JTextField zoneTextField = new JTextField(5);
        JButton zoneButton = new JButton("Sélectionner la zone d'ombre");
        //zoneButton.addActionListener(new ZoneButtonListener());
        controlPanel.add(zoneLabel);
        controlPanel.add(zoneTextField);
        controlPanel.add(zoneButton);

        getContentPane().add(controlPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    @Override
    public boolean proximTuyeau() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ombragees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private class ZoneButtonListener implements ActionListener {
        private int row;

        public ZoneButtonListener(int row) {
            this.row = row;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedZone = row;
            for (int col = 0; col < gridSize; col++) {
                buttons[row][col].setBackground(Color.GRAY);
            }
        }
    }

    private class TuyauButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedColumn = gridSize / 2; // Sélectionne la colonne du milieu
            for (int row = 0; row < gridSize; row++) {
                buttons[row][selectedColumn].setBackground(Color.BLUE);
            }
        }
    }

    public static void main(String[] args) {
        final int gridSize = 5; // Taille de la grille n*n
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jardinGUI jardinGUI = new jardinGUI(gridSize);
            }
        });
    }
}
