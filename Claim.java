package Assignments.Day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Implement Serialization and create methods to save and load claims from files

public abstract class Claim implements Serializable{
      static final long serialVersionUID=1L;
      final int id;
      final double amount;
      final String type;
      
    //constructor
      public Claim(int id,double amount,String type){
     	 this.id=id;
     	 this.amount=amount;
     	 this.type=type;
      }
      //getter
      public int getId() {
     	 return id;
      }
      
      public double getAmount() {
     	return amount; 
      }
      public String getType() {
     	 return type;
      }
      public abstract void process();
      
      //Save claim too file
      public void saveToFile(String filename) throws IOException{
    	  try(FileOutputStream fileOut=new FileOutputStream(filename);
    		 ObjectOutputStream out=new ObjectOutputStream(fileOut)){
    		  out.writeObject(this);
    	  }     
      }
      
      //Load claim from file
      public static Claim loadFromFile(String filename) throws IOException, ClassNotFoundException{
    	  try(FileInputStream fileIn=new FileInputStream(filename);
    		  ObjectInputStream in=new ObjectInputStream(fileIn)){
    		  return(Claim) in.readObject();
    	  }
      }
}
