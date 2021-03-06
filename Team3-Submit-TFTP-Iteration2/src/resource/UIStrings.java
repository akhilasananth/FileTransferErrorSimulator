package resource;

/**
 * @author Team 3
 *
 * Collection of user interface strings used throughout the TFTP system
 */
public class UIStrings {

	public static final String MENU_ERROR_SIMULATOR_ERROR_SELECTION 
							   = "----------------------\n"
							   + "| Error Selection Menu |\n"
							   + "----------------------\n"
							   + "Please select which error to generate\n"
							   + "Options : \n"
							   + "\t 1.File not found \n"
							   + "\t 2.Access violation \n"
							   + "\t 3.Disk full or allocation exceeded \n"
							   + "\t 4.Illegal TFTP operation \n"
							   + "\t 5.Unknown transfer ID \n"
							   + "\t 6.File already exists \n"
							   + "\t 7.No such user (obsolete) \n"
							   + "\t 8.No errors please \n"
							   + "\t 9.Exit \n"
							   + "Select option :";
	public static final String MENU_ERROR_SIMULATOR_ILLEGAL_TFTP_OPERATION 
							   = "----------------------\n"
			   				   + "| Illegal TFTP Operation Menu |\n"
			   				   + "----------------------\n"
			   				   + "Please select which error to generate\n"
			   				   + "Options : \n"
			   				   + "\t 1.Invalid file name (WRQ/RRQ) \n"
			   				   + "\t 2.Invalid mode (WRQ/RRQ) \n"
			   				   + "\t 3.Invalid zero padding bytes (WRQ/RRQ) \n"
			   				   + "\t 4.Invalid block number \n"
			   				   + "\t 5.Invalid packet header during transfer \n"
			   				   + "\t 6.Invalid packet size \n"
			   				   + "\t 7.Invalid initiating (first) packet\n"
			   				   + "\t 8.Go back to the previous menu \n"
			   				   + "Select option : ";
	 public static final String MENU_ERROR_SIMULATOR_LOG_LEVEL 
							   = "----------------------------------\n"
			   				   + "|    Error Simulator Test Menu    |\n"
			   				   + "----------------------------------\n"
			   				   +"Please select logging level for this session\n"
			   				   + "Options : \n"
			   				   + "\t 1. Interfere with packets going to the Client\n"
			   				   + "\t 2. Interfere with packets going to the Server\n"
			   				   + "Select option : ";
	 public static final String MENU_CLIENT_SELECTION 
							   = "----------------------\n"
							   +"| Client Select Menu |\n"
							   +"----------------------\n"
							   +"Options : \n"
							   +"\t 1. Read File\n"
							   +"\t 2. Write File\n"
							   +"\t 3. Exit \n\n\n"
							   +"Select option : \n";
	 public static final String CLIENT_LOG_LEVEL_SELECTION 
	 						   = "-------------------------------\n"
	 						   +"| Client Select Logging Level |\n"
	 						   +"-------------------------------\n"	   
	 						   +"Options : \n"
	 						   +"\t 1. Verbose\n"
	 						   +"\t 2. Silent\n"
	 						   +"Select option : \n";
	 public static final String CLIENT_MODE 
	 						  = "--------------------------------\n"
	 						  +"| Select Client operation Mode |\n"
	 						  +"--------------------------------\n"
	 						  +"Options : \n"
	 						  +"\t 1. Normal (No Error Simulator)\n"
	 						  +"\t 2. Test (With Error Simulator)\n"
	 						  +"Select option : \n";
	 						   
}
