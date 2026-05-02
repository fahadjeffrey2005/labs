/*
 formatEmployeeName(): A method that formats the employee's name by
 capitalizing the first letter of each word and converting the remaining letters
 to lowercase. For example, if the employee's name is "JOHN DOE", this
 method would transform it to "John Doe".
 
 generateEmail(): A method that generates an email address for the employee
 based on their name. For example, if the employee's name is "John Doe", this
 method would generate an email address like jdoe@example.com.
 
 extract initials
 remove whitespaces
 find substring
 */

import java.util.*;
public class name
{
        public void extractInitials(String name)
        {
            String[] words = name.split(" ");
            String in = "";
            for(String word: words)
            {
                in += Character.toUpperCase(word.charAt(0));
            }
            in = new String(in);
            System.out.println(in);
        }
    
        public void removeSpace(String name)
        {
            String[] words = name.split(" ");
            String joined = "";
            for(String word: words)
            {
                joined += word;
            }
            joined = new String(joined);
            System.out.println(joined);
        }
        public void formatEmployeeName(String name)
        {
            String[] words = name.split(" ");
            String newname = "";
            for (String word: words)
            {
                char[] letters = word.toCharArray();
                newname += Character.toUpperCase(letters[0]);
                for (int i =1; i<letters.length;i++)
                {
                    newname += Character.toLowerCase(letters[i]);
                }
                newname += " ";
            }
            newname = new String(newname);
            System.out.println(newname);
        }
    
        public void generateEmail(String name)
        {
            String email = "";
            char[] letters = name.toCharArray();
            email += Character.toLowerCase(letters[0]);
            for(int i=0; i<letters.length;i++)
            {
                if(letters[i] == ' ')
                {
                    for(int j=i+1; j<letters.length;j++)
                    {
                        email += Character.toLowerCase(letters[j]);
                    }
                }
            }
            email += "@gmail.com";
            email = new String(email);
            System.out.println(email);
        }
        public void generateEmail(String name)
        {
            String email = "";
            String words[] = name.split(" ");
            char f = Character.toLowerCase(words[0].charAt(0));
            email = f+words[1]+"@gmail.com";
            email = new String(email);
            System.out.println(email);
        }
    
    public void search(String name)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter substring to be searched for: ");
        String sub = sc.nextLine();
        boolean flag = false;
        if(name.contains(sub))
        {
            flag = true;
        }
        if(flag)
            System.out.println("Substring found.");
        else
            System.out.println("Substring not found.");
    }
    
    public static void main(String[]args)
    {
        name obj = new name();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String n = sc.nextLine();
        obj.formatEmployeeName(n);
        obj.generateEmail(n);
        obj.extractInitials(n);
        obj.removeSpace(n);
        obj.search(n);
    }
}
