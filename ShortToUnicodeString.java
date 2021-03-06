/* Convert short array inits to binary strings */

public class ShortToUnicodeString extends ArrayInitBaseListener {

    // { -> "
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.println('"');
    }

    // } -> "
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.println('"');
    }

    // ints -> 4 digit hex
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }


}