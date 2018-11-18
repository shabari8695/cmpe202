public class BaconDecorator extends Decorator {

	private String addedState;

    public BaconDecorator( Component c)
    {
        super( c ) ;
    }

    public String print()
    {
        addedState = super.print() ;
        return modifyText( addedState ) ;
    }

	private String modifyText(String in) {
		return "{{{{{" + in + "}}}}}" ;
	}

}