MarketPlace_Java
================

GUI implementation of creating nemix listings in java

Creating java program for creating and managing listings.
Created gui navigation as well as default save in user directory.
Completed creation of MVC for execution of commands, as well as navigation on GUI buttons to execute correct args in sub branch of GUI buttons.
Need to create a JDBC for minumum 4 seperate database. 
One for Nemix listings that contain machine information, such as Machine, Series, Model, Total Slots, Max Ram, Notes, url_img {Inside nemix ftp}, OEM PN, must NOT contain Nemix PN, other columns.
Second Database will contain OEM PN, with associated Nemix PN, manufactor alt PN, Kingston/Crucial/Axiom comparable PN, and manufactor (IE This DB will contain stand along Kingston PN as KTD-WS667/16GB and the manufactor = Kingston, and have only the nemix alt where applicable.
3rd DB will contain ALL of the nemix PN, it's description, attributes and pricing schema{hidden from user view}, and url images (nemix ftp).
4th DB will be the linked between the memory offered for a specific machine. Restriction the primary key = machine primary key. This will contain All of the offered Nemix Memory for sale for this machine, and OEM PN that is assocaited DIRECTLY with machine {See each individual manual etc.....}.

Mapping and schema must be described in each respective DB.
