/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author taymo
 */
public class TestUserprofile{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("User id: ");
        String id = input.nextLine();

        System.out.println("Comedy, Drama, Action, Mystery");
        System.out.print("Favourite genre: ");
        String genre = input.nextLine();

        UserProfile user = new UserProfile(id, genre);
        System.out.println("User profile created.");

        System.out.println("User id: " + user.getUserID());

        System.out.println("Favourite genre: " + user.getGenre());
        
        

    }
}

