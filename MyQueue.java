/*
 * CLASS : CMSC204
 * ASSIGNMENT 2
 * INSTRUCTOR : Dr.Kuijt
 * DESCRIPTION : MyQueue will implement the QueueInterface
 * DUE : 10/1/23
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */

import java.util.ArrayList;

public class MyQueue<T> implements QueueInterface{
	private ArrayList<T> queue;
	private int size = 10;

	/**
	 * Constructor with parameter
	 * 
	 * @param size
	 */
	public MyQueue(int size) {
		queue = new ArrayList<T>(size);
		this.size = size;
	}
	/**
	 * Default Constructor
	 */
	public MyQueue() {
		queue = new ArrayList<T>();
	}
	/**
	 * Check if queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	/**
	 * Check if queue is full
	 */
	@Override
	public boolean isFull() {
		return queue.size() == size;
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty())
			throw new QueueUnderflowException();
		T o = queue.get(0);
		queue.remove(0);
		return o;
	}

	@Override
	public int size() {
		return queue.size();
	}

	@Override
	public boolean enqueue(Object e) throws QueueOverflowException {
		if (isFull())
			throw new QueueOverflowException();
		queue.add((T)e);
		return true;
	}

	@Override
	public String toString(String delimiter) {
		if (queue.size() == 0)
			return "";

		String s = "" + queue.get(0);
		for (int i = 1; i < queue.size(); i++)
			s += delimiter + queue.get(i);
		return s;
	}

	@Override
	public String toString() {
		return toString("");
	}

	@Override
	public void fill(ArrayList list) {
		for (int i = 0; i < list.size(); i++)
		{
			try {
				enqueue(list.get(i));
			}catch(Exception e) {}
		}
	}


}