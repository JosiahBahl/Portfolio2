import java.util.EmptyStackException;

public class CalculatorStack<E>
{
	private CalculatorNode<E> _top = null;
	private CalculatorNode<E> _bottom = null;
	private int _size = 0;
	
	public CalculatorStack()
	{
		
	}
	
	public void push(E data)
	{
		if(isEmpty())
		{
			_top = new CalculatorNode<E>(data, _bottom);
			_size++;
		}
		else
		{
			_top = new CalculatorNode<E>(data, _top);
			_size++;
		}
	}
	
	public E pop()
	{
		E poped;
		poped = (E)_top.getData();
		_top = _top._link;
		_size--;
		return poped;
	}
	
	public int size()
	{
		return _size;
	}
	
	public E peek()
	{
		if(_top == null)
		{
			throw new EmptyStackException();
		}
		return (E)_top.getData();
	}
	
	public boolean isEmpty()
	{
		return (_top == null);
	}
	
	public CalculatorStack<E> flip()
	{
		CalculatorStack<E> newStack = new CalculatorStack<E>();
		for(int i = 0; i < _size; i++)
		{
			newStack.push(_top.getData());
			_top = _top._link;
		}
		
		return newStack;
	}

	/**
	 * @return the _top
	 */
	public CalculatorNode<E> getTop() {
		return _top;
	}

	/**
	 * @param _top the _top to set
	 */
	public void setTop(CalculatorNode<E> top) {
		_top = top;
	}

	/**
	 * @return the _bottom
	 */
	public CalculatorNode<E> getBottom() {
		return _bottom;
	}

	/**
	 * @param _bottom the _bottom to set
	 */
	public void setBottom(CalculatorNode<E> bottom) {
		_bottom = bottom;
	}

	/**
	 * @param _size the _size to set
	 */
	public void setSize(int size) {
		_size = size;
	}
}
