/*
 * CLASS : CMSC204
 * ASSIGNMENT 2
 * INSTRUCTOR : Dr.Kuijt
 * DESCRIPTION : QueueUnderflowException – occurs when a dequeue method is called on an empty queue.
 * DUE : 10/1/23
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */

public class QueueUnderflowException extends RuntimeException {
	public QueueUnderflowException()
	{
		super("queue underflow");
	}
}