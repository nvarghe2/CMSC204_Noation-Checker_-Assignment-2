/*
 * CLASS : CMSC204
 * ASSIGNMENT 2
 * INSTRUCTOR : Dr.Kuijt
 * DESCRIPTION : StackUnderflowException – occurs when a top or pop method is called on an empty stack. 
 * DUE : 10/1/23
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */

public class StackUnderflowException extends RuntimeException {
	public StackUnderflowException()
	{
		super("Stack is empty.");
	}
}