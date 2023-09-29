/*
 * CLASS : CMSC204
 * ASSIGNMENT 2
 * INSTRUCTOR : Dr.Kuijt
 * DESCRIPTION : StackOverflowException– occurs when a push method is called on a full stack.
 * DUE : 10/1/23
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */
public class StackOverflowException extends RuntimeException {
	public StackOverflowException()
	{
		super("Stack is full.");
	}
}