/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

//package components;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Create_Marketplace_Flat_Files extends JPanel implements ActionListener {
    /**
	 * This is the GUI section, have the ability to create flat files via other functionalities
	 *User will press one of the N number of options
	 *These options will execute the singular 'Market_place_Export_Prep'
	 *With passing a string of location file, and then the internally made int choice
	 */
	private static final long serialVersionUID = 2L;

	static private String newline = "\n";
	
    private JTextArea log;
    private JFileChooser fc;
	
    static String[] path_STR = new String[1];//" Empty";
    
    /*
    public String return_path_STR(){
    	
    	return path_STR[0];
    }
    */
    
    public Create_Marketplace_Flat_Files() {
        super(new BorderLayout());
        
        //Create the log first, because the action listener
        //needs to refer to it.
        
        log = new JTextArea(5,50);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);

        JButton AMAZON = new JButton("Create Amazon Flat File Listing");
        JButton BUY = new JButton("Create Buy.com Flat File Listing");
        JButton eBay = new JButton("Create eBay Flat File Listing");
        JButton AMAZON_EU = new JButton("Create Amazon Europe Flat File Listing");
        JButton Nemix = new JButton("Create Nemix Flat File????");
       // sendButton.addActionListener(this);
        //CreateFlatFile.addActionListener(create_flat_file);		//Working part
        AMAZON.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {

            	String flat_File_Location = path_STR[0];
            	int Market_Place_choice = 1;
            	try {
					Market_place_Export_Prep create_marketplace_Flat_File = new Market_place_Export_Prep(flat_File_Location,Market_Place_choice);
					/*
					 * Begin exportation to the amazon market place
					 * Pass two arguments, one the location of the nemix standard flat file
					 * That file will have the required information to create the desired flat file for
					 * desired marketplace. In this case it is amazon
					 * Second argument is an int, which is used in the next step for a switch statement
					 * Switch is used for export to said marketplace
					 * Option one goes to the amazon marketplace exportation
					 * 
					 */

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });      
        //sendButton.getInputContext();
        
        add(AMAZON, BorderLayout.NORTH);
        add(BUY, BorderLayout.EAST);
        add(eBay, BorderLayout.WEST);
        add(AMAZON_EU, BorderLayout.SOUTH);
        //add(CreateFlatFile, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);
    }


    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("MarketPlace");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //Add content to the window.
        frame.add(new Create_Marketplace_Flat_Files());
        

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void my_Marketplace_Flat_Files(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
    	
    	path_STR[0] = args[0];
    	//Action above just copied the location of the desired url path
    	
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
              
            }
        });
      
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}