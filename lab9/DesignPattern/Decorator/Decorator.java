public class Decorator implements Component {

	private Component component;

    public Decorator( Component c )
    {
        component = c ;
    }

	public String print()
    {
        return component.print() ;
    }

}