package cuartelbomberos.entidades;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class FiltroNumeros extends DocumentFilter {
    
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        StringBuilder builder = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        builder.insert(offset, string);
        String content = builder.toString();
        if (isNumeric(content)) {
            int value = Integer.parseInt(content);
            if (value >= 0 && value <= 10) {
                super.insertString(fb, offset, string, attr);
            }
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        StringBuilder builder = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        builder.replace(offset, offset + length, text);
        String content = builder.toString();
        if (isNumeric(content)) {
            int value = Integer.parseInt(content);
            if (value >= 0 && value <= 10) {
                super.replace(fb, 0, fb.getDocument().getLength(), text, attrs);
            }
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("10|\\d");
    }
    
}
