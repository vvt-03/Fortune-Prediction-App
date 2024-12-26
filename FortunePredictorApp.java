import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

abstract class Fortune {
    private String name;

    public Fortune(String name) {
        this.name = name;
    }

    public abstract String getFortune(int index);
}

class FortuneProvider {
    // Static array of fortunes for all zodiac signs
    private static String[] fortunes = {"Work:Prepare for a breakthrough in your career as a new project comes your way, bringing unexpected success and recognition from your peers.\n\n" +
            "Love:The energy of romance is palpable; rekindle the spark with your partner, or be open to a new relationship that promises excitement.\n\n" +
            "Health:Treat your body as a sacred space; nourish it with wholesome foods and regular exercise to enhance your vitality and overall well-being.\n\n" +
            "Lifestyle:Embrace spontaneity and allow yourself to seek new adventures; they will lead to enriching experiences that expand your horizons.",

            "Work: An unexpected opportunity is on the horizon; stay alert, as it may lead you to a path of growth and success you hadn’t considered.\n\n" +
                    "Love: Honesty in your communication will strengthen your bond with a partner; open discussions will deepen your connection and foster trust.\n\n" +
                    "Health: Make rest a priority; allowing yourself to recharge will rejuvenate your spirit and improve your productivity.\n\n" +
                    "Lifestyle: Embrace change and be willing to step outside your comfort zone; it can lead to exciting new experiences and personal growth.",

            "Work: Your dedication and hard work will not go unnoticed; expect a well-deserved promotion or a raise to reflect your efforts.\n\n" +
                    "Love: A surprise confession from a friend or partner will illuminate your day; be prepared to embrace deeper feelings and connections.\n\n" +
                    "Health: Keep moving and stay active; your vibrant energy will inspire those around you and contribute to a healthier lifestyle.\n\n" +
                    "Lifestyle: Take a moment to declutter your physical space; a clean environment will lead to a clearer mind and greater focus on your goals.",

            "Work: Collaboration with colleagues will lead to great achievements; teamwork will enhance your productivity and open doors to new opportunities.\n\n" +
                    "Love: Trust your instincts when it comes to love; a significant relationship may be just around the corner, waiting for you to take the plunge.\n\n" +
                    "Health: Prioritize mindfulness in your daily routine; it will bring balance to your life and help you navigate challenges with grace.\n\n" +
                    "Lifestyle: Cultivate an attitude of gratitude; acknowledging the positives in your life will transform your perspective and enhance your happiness.",

            "Work: Your creativity will flourish in the coming weeks; harness this energy to bring innovative ideas to your projects and captivate your audience.\n\n" +
                    "Love: Shared experiences with your partner will deepen your connection; plan a special outing or create new memories together.\n\n" +
                    "Health: Remember to hydrate throughout the day; maintaining proper hydration is essential for your energy levels and overall health.\n\n" +
                    "Lifestyle: Engage in hobbies that bring you joy; dedicating time to your passions will enhance your happiness and fulfill your creative spirit."};


    public static String getFortune(int index) {
        if (index < 1 || index > fortunes.length) {
            return "Invalid fortune index.";
        }
        return fortunes[index - 1]; // Accessing array with 0-based index
    }
}

class AriesFortune extends Fortune {
    private int[] fortuneIndices = {5, 3, 1, 4, 2}; // Random order of indices

    public AriesFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class TaurusFortune extends Fortune {
    private int[] fortuneIndices = {2, 1, 4, 5, 3}; // Random order of indices

    public TaurusFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class GeminiFortune extends Fortune {
    private int[] fortuneIndices = {1, 4, 2, 3, 5}; // Random order of indices

    public GeminiFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class CancerFortune extends Fortune {
    private int[] fortuneIndices = {4, 2, 1, 5, 3}; // Random order of indices

    public CancerFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class LeoFortune extends Fortune {
    private int[] fortuneIndices = {3, 1, 5, 2, 4}; // Random order of indices

    public LeoFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class VirgoFortune extends Fortune {
    private int[] fortuneIndices = {2, 3, 1, 5, 4}; // Random order of indices

    public VirgoFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class LibraFortune extends Fortune {
    private int[] fortuneIndices = {1, 5, 3, 2, 4}; // Random order of indices

    public LibraFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class ScorpioFortune extends Fortune {
    private int[] fortuneIndices = {4, 1, 5, 3, 2}; // Random order of indices

    public ScorpioFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class SagittariusFortune extends Fortune {
    private int[] fortuneIndices = {2, 5, 3, 1, 4}; // Random order of indices

    public SagittariusFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class CapricornFortune extends Fortune {
    private int[] fortuneIndices = {3, 1, 4, 5, 2}; // Random order of indices

    public CapricornFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class AquariusFortune extends Fortune {
    private int[] fortuneIndices = {5, 2, 1, 3, 4}; // Random order of indices

    public AquariusFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

class PiscesFortune extends Fortune {
    private int[] fortuneIndices = {1, 3, 4, 5, 2}; // Random order of indices

    public PiscesFortune(String name) {
        super(name);
    }

    @Override
    public String getFortune(int index) {
        return FortuneProvider.getFortune(fortuneIndices[index - 1]); // Use mapped index
    }
}

// ZodiacCalculator class remains unchanged
class ZodiacCalculator {
    public static String getZodiacSign(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Taurus";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricorn";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Aquarius";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Pisces";
        return "Unknown";
    }

    public static Fortune getFortuneClass(String zodiacSign, String name) {
        switch (zodiacSign) {
            case "Aries": return new AriesFortune(name);
            case "Taurus": return new TaurusFortune(name);
            case "Gemini": return new GeminiFortune(name);
            case "Cancer": return new CancerFortune(name);
            case "Leo": return new LeoFortune(name);
            case "Virgo": return new VirgoFortune(name);
            case "Libra": return new LibraFortune(name);
            case "Scorpio": return new ScorpioFortune(name);
            case "Sagittarius": return new SagittariusFortune(name);
            case "Capricorn": return new CapricornFortune(name);
            case "Aquarius": return new AquariusFortune(name);
            case "Pisces": return new PiscesFortune(name);
            default: return null;
        }
    }
}

public class FortunePredictorApp extends JFrame {
    private JTextField nameField;
    private JTextField birthdateField;
    private JLabel zodiacLabel;
    private JTextArea fortuneTextArea;
    private int selectedNumber = 1;

    public FortunePredictorApp() {
        setupUI();
    }

    private void setupUI() {
        setTitle("Fortune Predictor App");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout()); // Center everything in the window
        setLocationRelativeTo(null); // Center the window on the screen

        // Main panel with padding and layout adjustments
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(250, 250, 250));

        // Title label
        JLabel titleLabel = new JLabel("Fortune Predictor App", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Name field
        JLabel nameLabel = new JLabel("Enter your name:");
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(nameLabel);
        nameField = new JTextField(20);
        nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, nameField.getPreferredSize().height));
        mainPanel.add(nameField);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Birthdate field
        JLabel birthdateLabel = new JLabel("Enter your birthdate (dd-mm-yyyy):");
        birthdateLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(birthdateLabel);
        birthdateField = new JTextField(20);
        birthdateField.setMaximumSize(new Dimension(Integer.MAX_VALUE, birthdateField.getPreferredSize().height));
        mainPanel.add(birthdateField);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Number selection buttons
        JLabel chooseNumberLabel = new JLabel("Choose a number (1-5):");
        chooseNumberLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(chooseNumberLabel);
        JPanel numberButtonPanel = new JPanel(new GridLayout(1, 5, 10, 10));
        numberButtonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        for (int i = 1; i <= 5; i++) {
            JButton numberButton = new JButton(String.valueOf(i));
            numberButton.addActionListener(new NumberButtonListener(i));
            numberButton.setBackground(Color.LIGHT_GRAY);
            numberButton.setFocusPainted(false);
            numberButtonPanel.add(numberButton);
        }
        mainPanel.add(numberButtonPanel);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Calculate button
        JButton calculateButton = new JButton("Predict My Fortune");
        calculateButton.setFont(new Font("Arial", Font.BOLD, 16));
        calculateButton.setBackground(new Color(60, 179, 113));
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setFocusPainted(false);
        calculateButton.addActionListener(e -> calculateFortune());
        calculateButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(calculateButton);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Zodiac label
        zodiacLabel = new JLabel("Zodiac Sign: ");
        zodiacLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        zodiacLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(zodiacLabel);

        // JTextArea for fortune display with a scroll pane
        fortuneTextArea = new JTextArea(10, 30);
        fortuneTextArea.setLineWrap(true);
        fortuneTextArea.setWrapStyleWord(true);
        fortuneTextArea.setEditable(false);
        fortuneTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(fortuneTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(scrollPane);

        // Adding the mainPanel to the center
        add(mainPanel, new GridBagConstraints());

        setVisible(true);
    }

    private void calculateFortune() {
        String name = nameField.getText();
        String birthdateStr = birthdateField.getText();
        String zodiacSign = "";

        try {
            LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            int day = birthdate.getDayOfMonth();
            int month = birthdate.getMonthValue();

            zodiacSign = ZodiacCalculator.getZodiacSign(day, month);
            zodiacLabel.setText("Zodiac Sign: " + zodiacSign);

            Fortune fortune = ZodiacCalculator.getFortuneClass(zodiacSign, name);
            String fortuneText = fortune != null ? fortune.getFortune(selectedNumber) : "No fortune available";

            fortuneTextArea.setText("Your Fortune:\n\n" + fortuneText);

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the birthdate in dd-MM-yyyy format.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            zodiacLabel.setText("Zodiac Sign: " + zodiacSign);
            fortuneTextArea.setText("An error occurred while calculating your fortune.");
        }
    }

    private class NumberButtonListener implements ActionListener {
        private final int number;

        public NumberButtonListener(int number) {
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            selectedNumber = number;
            for (Component comp : ((JPanel) e.getSource()).getParent().getComponents()) {
                if (comp instanceof JButton) {
                    comp.setBackground(Color.LIGHT_GRAY); // Reset color
                }
            }
            ((JButton) e.getSource()).setBackground(Color.YELLOW); // Highlight selected button
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FortunePredictorApp::new);
    }
}