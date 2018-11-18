public interface Chain{
	public void setNext(Chain nextInChain);
    public void process(int request);
}