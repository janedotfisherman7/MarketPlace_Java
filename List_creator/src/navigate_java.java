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

import image_packages.ImageFileView;
import image_packages.ImageFilter;
import image_packages.ImagePreview;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//import javax.swing.filechooser.*;

/*
 * FileChooserDemo2.java requires these files:
 *   ImageFileView.java
 *   ImageFilter.java
 *   ImagePreview.java
 *   Utils.java
 *   images/jpgIcon.gif (required by ImageFileView.java)
 *   images/gifIcon.gif (required by ImageFileView.java)
 *   images/tiffIcon.gif (required by ImageFileView.java)
 *   images/pngIcon.png (required by ImageFileView.java)
 */
public class navigate_java extends JPanel implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static private String newline = "\n";
	
    private JTextArea log;
    private JFileChooser fc;

	//private void create_flat_file(){};
	
    static String[] path_STR = new String[1];//" Empty";
    
    public String return_path_STR(){
    	
    	return path_STR[0];
    }
    
    public navigate_java() {
        super(new BorderLayout());
        
        //Create the log first, because the action listener
        //needs to refer to it.
        
        log = new JTextArea(5,50);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);

        JButton sendButton = new JButton("Find CSV");
        JButton CreateFlatFile = new JButton("Create Template");
        sendButton.addActionListener(this);
        //CreateFlatFile.addActionListener(create_flat_file);		//Working part
        CreateFlatFile.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                
                try {
					@SuppressWarnings("unused")
					Write_Template_CSV creating_Template_NOW = new Write_Template_CSV();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });      
        //sendButton.getInputContext();
        
        add(sendButton, BorderLayout.WEST);
        add(CreateFlatFile, BorderLayout.EAST);
        //add(CreateFlatFile, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        //Set up the file chooser.
        if (fc == null) {
            fc = new JFileChooser();

	    //Add a custom file filter and disable the default
	    //(Accept All) file filter.
            fc.addChoosableFileFilter(new ImageFilter());
            fc.setAcceptAllFileFilterUsed(false);

	    //Add custom icons for file types.
            fc.setFileView(new ImageFileView());

	    //Add the preview pane.
            fc.setAccessory(new ImagePreview(fc));
        }

        //Show it.
        int returnVal = fc.showDialog(navigate_java.this,
                                      "Attach");

        //Process the results.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            log.append("Attaching file: " + file.getName()
                       + "." + newline);
            
 //           String str_abs_path_value = file.getAbsolutePath();
            path_STR[0] =  file.getAbsolutePath();
            //path_STR[1] =  file.getAbsolutePath();
            //System.out.println("array val = " + path_STR[0]);
        } else {
            log.append("Attachment cancelled by user." + newline);
        }
        log.setCaretPosition(log.getDocument().getLength());

        //Reset the file chooser for the next time it's shown.
        fc.setSelectedFile(null);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Navigate view");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //Add content to the window.
        frame.add(new navigate_java());
        

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void my_navigate(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
    	
    	
    	
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
              
            }
        });
      
    }

}