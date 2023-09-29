/*
 * CLASS : CMSC204
 * ASSIGNMENT 2
 * INSTRUCTOR : Dr.Kuijt
 * DESCRIPTION : InvalidNotationFormatException – occurs when a Notation format is incorrect
 * DUE : 10/1/23
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */

public class InvalidNotationFormatException extends RuntimeException {
	public InvalidNotationFormatException()
	{
		super("Invalid Notation");
	}
}