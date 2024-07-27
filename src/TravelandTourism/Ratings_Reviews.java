package TravelandTourism;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Ratings_Reviews extends JFrame {
    private JLabel titleLabel;
    private JLabel ratingLabel;
    private JPanel starsPanel;
    private JTextArea reviewTextArea;
    private JTextArea suggestionTextArea; // New text area for suggestions
    private JButton submitButton;

    private int rating = 0;

    public Ratings_Reviews() {
        setTitle("Ratings and Reviews");
        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("Rate and Review this Product");
        ratingLabel = new JLabel("Your Rating:");
        starsPanel = new JPanel();
        reviewTextArea = new JTextArea(5, 20);
        suggestionTextArea = new JTextArea(5, 20); // Initialize suggestion text area
        suggestionTextArea.setBorder(BorderFactory.createTitledBorder("Add your suggestions")); // Set titled border
        submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(80, 30)); // Set preferred size

        starsPanel.setLayout(new FlowLayout());
        for (int i = 1; i <= 5; i++) {
            JButton starButton = new JButton("" + i);
            starButton.addActionListener(new StarButtonListener(i));
            starsPanel.add(starButton);
        }

        submitButton.addActionListener(new SubmitButtonListener());

        JPanel textAreasPanel = new JPanel(new GridLayout(2, 1));
        textAreasPanel.add(reviewTextArea);
        textAreasPanel.add(suggestionTextArea);

        setLayout(new BorderLayout());
        add(titleLabel, BorderLayout.NORTH);
        add(starsPanel, BorderLayout.CENTER);
        add(ratingLabel, BorderLayout.WEST);
        add(textAreasPanel, BorderLayout.SOUTH); // Add both text areas to the panel
        add(submitButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class StarButtonListener implements ActionListener {
        private int starValue;

        public StarButtonListener(int value) {
            starValue = value;
        }

        public void actionPerformed(ActionEvent event) {
            rating = starValue;
            ratingLabel.setText("Your Rating: " + rating + " stars");
        }
    }

    private class SubmitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String review = reviewTextArea.getText();
            String suggestion = suggestionTextArea.getText(); // Get suggestion text
            // Here you can do something with the rating, review, and suggestion,
            // like submitting to a database.
            JOptionPane.showMessageDialog(Ratings_Reviews.this,
                    "Thank you for your feedback!",
                    "Feedback Submitted", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ratings_Reviews();
            }
        });
    }
}
