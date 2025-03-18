/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Guided;

/**
 *
 * @author tuf
 */
public class LibraryBook {
    
    private String title;
    private String author;
    private boolean isBorrowed;
    private String getTitle;
    private String getAuthor;
    private String getisBorrowed;
    
    public void setTitle(String title){
        this.title = title;
        
    }
    
    public void setAuthor(String author){
        this.author = author;
        
    }
    
    public void setisBorrowed(boolean bool ){
        this.isBorrowed = bool;
        
    }
    
    public String getTitle(){
        return title;
        
    }
    
    public String getAuthor(){
        return author;
        
    }
    
    public boolean getisBorrowed(){
        return isBorrowed;
       
    }
    public static void main(String args[]){
       LibraryBook lb = new LibraryBook();
       lb.setTitle("Petualangan Ramzi");
       lb.setAuthor("Hello");
       lb.setisBorrowed(true);
       
       System.out.println("Title: " + lb.title);
       System.out.println("Author: " + lb.author);
       System.out.println("Bool: " + lb.isBorrowed);
       
       System.out.println("Title: " + lb.getTitle);
       System.out.println("Author: " + lb.getAuthor);
       System.out.println("Bool: " + lb.getisBorrowed);
       
    
}

    String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  }


