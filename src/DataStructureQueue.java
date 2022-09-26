import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DataStructureQueue {

    public static void main(String[] args){

        //Creating a linked list.

        Queue<String> list1= new LinkedList<String>();

        list1.add("CAR");
        list1.add("TOYS");
        list1.add("BAT");
        list1.add("BALL");
        list1.add("GLOVES");
        list1.add("BAT");

        //Printing the list.5
        System.out.println("Printing out the list"+list1);

        //removing the element from the list using function
        removeListElement(list1); //Function call

        //Adding the elements to the linked list using function
        addListElement(list1);
        System.out.println("List after adding is:"+list1);


    }


    //Removing Element form the list function program. Function defination
    public static void removeListElement(Queue<String> a){

        a.remove("BALL");
        System.out.println("String after removing Ball from queue:"+a);
        a.remove();
        System.out.println("Queue is:"+a);


    }

    //Adding element to the list program
    public static void addListElement(Queue<String> a){

        Scanner input = new Scanner(System.in);  // Create a Scanner class object
        System.out.println("Enter List Elements");

        String s;


        String elementsToInput = input.nextLine();  // Read the user input
        System.out.println("Enter the limit of elements you want to input: " + elementsToInput);

        int b= Integer.parseInt(elementsToInput);


        for(int i=1;i<=b;i++){

            s= input.nextLine();
            a.add(s);
        }
        System.out.println("Queue is:"+a);



    }

}