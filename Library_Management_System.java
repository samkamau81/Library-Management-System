/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolproj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ENM221-0040/2020
 */


public class Library_Management_System {
    String[] bookname={"Fire and Blood","The Firm","Differential Geometry","Harry Potter and the Philosopher's Stone","The Art of the Deal"};
    String[] author={"George R.R Martin","John Grisham", "Prof.J.K Gatoto","J.K Rowling","Donald J.Trump"};
    String[] genre={"Fantasy","Thriller","Educational","Adventure","Autobiography"};
    String[] status={"Available","Borrowed","Available","Available","Borrowed"};
//main method
    public static void main(String arv[]){
        String profile;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t  LIBRARY MANAGEMENT SYSTEM");
        System.out.println("\t\t*******************************************");
        System.out.println("Are you an Administrator(admin) or Student(stud):");
        profile=sc.nextLine();
        Library_Management_System obj = new Library_Management_System ();
        
        if ("stud".equals(profile)){            
            obj.menu();
            int i=0;
            while(i<2){


                System.out.print("\nPlease Enter choice :");
                i=Integer.parseInt(sc.nextLine());

                /** Use Switch Case Statements to navigate through the buttons **/

                switch(i)
                {
                  case 1:
                  {
                  obj.getInfo();
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj.menu();

                  break;
                  }

                  case 2:
                  {
                    obj.exit();
                    

                  }
                }
            }
        }else if("admin".equals(profile)){
            String [] pass={"7461"};
            String password;
            System.out.print("Admin Enter password --------: ");
            password=sc.nextLine();
             //if(password==pass[0]){}
            if (pass[0] == null ? password == null : pass[0].equals(password)){
                System.out.println("Welcome Admin");
                obj.admin();
            }else{
                System.out.println("Wrong Password");
            }
                
        }



    }
    public void exit(){
    System.out.println("\n*****************************************");
    System.out.println("Thank You For Using Waweru's Software :) ");
    System.out.println("*****************************************");
    System.exit(0);
    }
    public void getInfo(){
        String search_name;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book name --------: ");
        search_name=sc.nextLine();
        int found=0;
         //while(i<bookname.length)
        for(int i=0;i<bookname.length;i++){   
            if(bookname[i].equals(search_name)){
                found=found+i;
            }
        }        
        //if(search_name==bookname[i]){}
        if(found>0){
            System.out.println(bookname[found]);
            System.out.println("Author -->"+author[found]);
            System.out.println("Genre --->"+genre[found]);
            System.out.println("Status --->"+status[found]);
 
        }else{
            System.out.println("-----Such Book does not exist !!!-----");

        }                          
            
       
      
    }
   //The method verifys the admins password
    public void passwordVerification(){
        String [] pass={"7461"};
        String password;
      
        Scanner sc=new Scanner(System.in);
        System.out.print("Admin Enter password --------: ");
        password=sc.nextLine();
         //if(password==pass[0]){}
        if (pass[0] == null ? password == null : pass[0].equals(password)){
            System.out.println("Welcome Admin");
            
        }else{
            System.out.println("Wrong Password");
        }
          
 
    }
    public void menu(){
      System.out.println("\t\t\t    --------------------");
      System.out.println("\t\t\t     WELCOME STUDENT");
      System.out.println("\t\t\t    --------------------");
   
      System.out.println("Press 1 : To See an Book Details ");
      System.out.println("Press 2 : To Exit the Lib Portal");

    }
    // Admin can view or add a bookto the library array  
    public void admin() {
        System.out.println("Press 1 : To Add Book ");
        System.out.println("Press 2 : To Delete Book ");
        System.out.println("Press 3 : To See an Book Details ");
        System.out.println("Press 4 : To Exit the Admin Portal");
        
        int i=0;
        while(i<4){
            

            Scanner sc=new Scanner(System.in);

            System.out.print("\nPlease Enter choice :");
            i=Integer.parseInt(sc.nextLine());

            /** Use Switch Case Statements to navigate through the buttons **/

            switch(i)
            {
              case 1: //update book details 
              {
  
                try{                 

                    System.out.println("Add Book ");
                    ArrayList<String>arrayList1=new ArrayList<>(Arrays.asList(bookname));                
                    System.out.println("Enter Book Name ----> ");
                    arrayList1.add(sc.nextLine());
                    bookname = arrayList1.toArray(bookname); 
                    ArrayList<String>arrayList2=new ArrayList<>(Arrays.asList(author));
                    System.out.println("Enter Author ----> ");
                    arrayList2.add(sc.nextLine());
                    author = arrayList2.toArray(author); 
                    ArrayList<String>arrayList3=new ArrayList<>(Arrays.asList(genre));
                    System.out.println("Enter Genre ----> ");
                    arrayList3.add(sc.nextLine());
                    genre = arrayList3.toArray(genre); 
                    ArrayList<String>arrayList4=new ArrayList<>(Arrays.asList(status));
                    System.out.println("Enter Status(Available OR Borrowed) ----> ");
                    arrayList4.add(sc.nextLine());
                    status = arrayList4.toArray(status); 
                    System.out.println("UPDATE COMPLETE !!! "); 
                    System.out.println("---------OUTPUT----------");
                    System.out.println("Array after adding element: "+Arrays.toString(bookname));
                    System.out.println("Array after adding element: "+Arrays.toString(author));
                    System.out.println("Array after adding element: "+Arrays.toString(genre));
                    System.out.println("Array after adding element: "+Arrays.toString(status));
                }catch(Exception e){
                    System.out.println("Error Incurred ");
                    
                }
                

              break;
              }
              case 2://delete book
              {
                try{                 

                    String bookName;
                    System.out.print("Enter Book name --------: ");
                    bookName=sc.nextLine();

                    //while(i<bookname.length)
                    for(int j=0;i<bookname.length;j++){   
                        if(bookname[j].equals(bookName)){                   
                     
                            for(int k = j; k < bookname.length - 1; k++){
                                bookname[k] = bookname[k+1];
                                author[k] = author[k+1];
                                genre[k] = genre[k+1];
                                status[k] = status[k+1];
                            }

                        break;   
                     
                  
                        }else{
                            System.out.println("-----Such Book does not exist !!!-----");
                        }

                    }
           
                  System.out.println("DELETION COMPLETE !!! "); 
                  System.out.println("---------OUTPUT----------");
                  System.out.println("Array after deleting element: "+Arrays.toString(bookname));
                  System.out.println("Array after deleting element: "+Arrays.toString(author));
                  System.out.println("Array after deleting element: "+Arrays.toString(genre));
                  System.out.println("Array after deleting element: "+Arrays.toString(status));
              }catch(Exception e){
                  System.out.println("Error Incurred ");

              }


            break;
           
            }
              
            case 3://See book details
            {
                try{
                  String bookName;
                  System.out.print("Enter Book name --------: ");
                  bookName=sc.nextLine();
                  int found=0;
                  //while(i<bookname.length)
                  for(int j=0;i<bookname.length;j++){   
                      if(bookname[j].equals(bookName)){
                           found=found+j;
                      }
                   }        
                   //if(search_name==bookname[i]){}
                   if(found>0){
                       System.out.println(bookname[found]);
                       System.out.println("Author -->"+author[found]);
                       System.out.println("Genre --->"+genre[found]);
                       System.out.println("Status --->"+status[found]);

                   }else{
                       System.out.println("-----Such Book does not exist !!!-----");

                   }
                }catch(Exception e){
                     System.out.println("Error ");
                }

            }
              case 4://exit Admin portal
              {
                  exit();
    
              }
              
            }
        }

        
    }
  
}
