package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String temp;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        temp = tuloskentta.getText();
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("0");
    }

    @Override
    public void peru() {
        tuloskentta.setText(temp);
    }
}
