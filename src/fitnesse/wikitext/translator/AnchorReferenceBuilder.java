package fitnesse.wikitext.translator;

import fitnesse.html.HtmlTag;
import fitnesse.html.HtmlUtil;
import fitnesse.wikitext.parser.Symbol;

public class AnchorReferenceBuilder implements Translation {
    public String toHtml(Translator translator, Symbol symbol) {
        String name = translator.translate(symbol.childAt(0));
        return HtmlUtil.makeLink("#" + name, ".#" + name).html();
    }
}
