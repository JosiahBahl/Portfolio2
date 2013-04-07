
public class CalculatorNode<E>
{
	public CalculatorNode<E> _link;
	private E _data;
	
	public CalculatorNode(E data, CalculatorNode<E> link)
	{
		_data = data;
		_link = link;
	}
	
	public CalculatorNode<E> getLink() {
		return _link;
	}
	/**
	 * @param _link the _link to set
	 */
	public void setLink(CalculatorNode<E> link) {
		_link = link;
	}
	/**
	 * @return 
	 * @return the _data
	 */
	public E getData() {
		return (E) _data;
	}
	/**
	 * @param _data the _data to set
	 */
	public void setData(E data) {
		_data = data;
	}
	
	
}
