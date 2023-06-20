import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.TerminalNode;

class BanglaTreeListener extends BanglaGrammarBaseListener {
    @Override
    public void visitTerminal(TerminalNode node) {

        String originalText = node.getText();
        String translatedText = translateTextToBangla(originalText);
        System.out.println(translatedText);
    }

    private String translateTextToBangla(String originalText) {
        // Add your implementation here
        return originalText; // Placeholder implementation
    }
}

public class grammar {
    public static void main(String[] args) {
        String input = "your input code here"; // Replace with your actual input code

        BanglaGrammarLexer lexer = new BanglaGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BanglaGrammarParser parser = new BanglaGrammarParser(tokens);
        ParseTree tree = parser.program(); // Invoke the entry point rule 'program'

        BanglaTreeListener listener = new BanglaTreeListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

    }
}
