import java.util.*;

public class Methods_Reverse_and_Copy{
   public static void main(String[] args){
      
      //Create an array and convert to list
      Character[] ray = {'p', 'i', 'z','z', 'a'};
      List<Character> l= Arrays.asList(ray);
      //More efficient to do (deep copy vs Shallow copy)
      //List<Character> l = new ArrayList<Character>(Arrays.asList(ray));
      //Creates a new object thats a copy and doesnt change "l" when u change it
      
      System.out.println("List is : ");
      output(l);
      
      //reverse and print out the list
      Collections.reverse(l);
      System.out.println("After reverse : ");
      output(l);
      
      //create a new array and a new list
      Character[] newRay = new Character[5];
      List<Character> listCopy = Arrays.asList(newRay);
      
      //copy contents of list into listcopy
      Collections.copy(listCopy, l);//takes everything for l into listCopy
      System.out.println("Copy of list : ");
      output(listCopy);
      
      //fill collection with crap
      Collections.fill(l, 'X');//change every element in l to 'x'
      System.out.println("After filling the list: ");
      output(l);
   }
   //output method, but can just do System.out.println(list);
   private static void output(List<Character> thelist){
      for(Character thing: thelist)
         System.out.printf("%s", thing);
      System.out.println();
   }
}