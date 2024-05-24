// It is required to import java.util.Arrays to use arrays in Java
import java.util.Arrays;
//It is required to import java.util.ArrayList to use Array Lists
import java.util.ArrayList;

class ArrayVSArrayList
{
    public static void main(String[] args) 
    {
        //To declare and initialize an array of 5 dogs names
        String[] dogNamesArray = {"Rufus","Sunshine","Madylin","Alice","Dr. Who"};

        //This Array now has a fixed length and can not be increased or decreased in size.
        //To add three more dogs to the Array you will have to copy the elements of the Array to another larger Array.
        String[] newDogNamesArray = Arrays.copyOf(dogNamesArray, dogNamesArray.length + 3);

        //To add the new dog names to the Array you will have to access the empty elements directly
        newDogNamesArray[5] = "Lassie";
        newDogNamesArray[6] = "Spot";
        newDogNamesArray[7] = "Jackie";

        //To remove an element from the Array you must use a loop to overwrite the value by shifting all higher index positions down one
        int index = 5; //Sets the element to be removed to index position 5
        int currentSize = newDogNamesArray.length - 1; //Initializes the current size of the Array
        for (int i = index; i < currentSize; i++)
        {
            newDogNamesArray[i] = newDogNamesArray[i + 1];
        }
        currentSize--; //reduces the usable size of the Array

        //To insert an element in the Array you must use a loop to shift all elements from the inserted index position and above up one. Assuming the Array is large enough
        for (int i = index; i < currentSize; i++)
        {
            newDogNamesArray[i + 1] = newDogNamesArray[i];
        }
        newDogNamesArray[5] = "Lassie"; //Inserts Lassie into index position 5
        currentSize++; //Increases the usable size of the Array

        //To print the elements of an Array use the toString method
        System.out.println("The elements in newDogNamesArray are " + Arrays.toString(newDogNamesArray));

        //The size of an Array List can be found by using the size method
        System.out.println("The length of the Array newDogNamesArray is " + newDogNamesArray.length + " elements.");

        //An Array List can be used to store the same elements but will allow the List to dynamically change in size
        //To initilize and empty Array List type the following
        ArrayList<String> dogNamesList = new ArrayList<String>();

        //New elements can be added by using the add method
        dogNamesList.add("Rufus");
        dogNamesList.add("Alice");

        //To overwrite the data at a specific index use the set method
        dogNamesList.set(1,"Madylin");

        //To insert an element into a List use the add method
        dogNamesList.add(1,"Sunshine");

        //Values must be added one element at a time
        dogNamesList.add("Alice");
        dogNamesList.add("Dr. Who");
        dogNamesList.add("Lassie");
        dogNamesList.add("Spot");
        dogNamesList.add("Jackie");

        //To get a value from a specific index from an ArrayList use the get method
        String rufus = dogNamesList.get(0);

        //An element can be removed from a List using the remove method
        dogNamesList.remove(7);

        //To print the elements of an ArrayList call the print method
        System.out.println("The elements in dogNamesList are " + dogNamesList);

        //The size of an Array List can be found by using the size method
        System.out.println("The size of this Array List is " + dogNamesList.size() + " elements.");




        

    }
}