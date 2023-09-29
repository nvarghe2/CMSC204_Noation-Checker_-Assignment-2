/*
 * CLASS : CMSC204
 * ASSIGNMENT 2
 * INSTRUCTOR : Dr.Kuijt
 * DESCRIPTION : QueueOverflowException – occurs when a enqueue method is called on a full queue
 * DUE : 10/1/23
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */

public class QueueOverflowException extends RuntimeException {
	public QueueOverflowException()
	{
		super("overflow");
	}
}