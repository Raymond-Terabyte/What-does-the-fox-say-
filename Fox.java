import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Fox {

    public static void main(String args[]) throws FileNotFoundException{

        File text = new File("FoxTalk.txt");

        Scanner scan = new Scanner(text);

        String line = scan.nextLine();


        //arraylists for animals and foxttalk
        ArrayList<String> animals_list = new ArrayList<>(); 
        ArrayList<String> foxtalk_list = new ArrayList<>(); 

        String[] Animals =  {};
        String[] FoxTalks = {};


    for (int item = 0; item < Integer.parseInt(line) ; item++){ //Integer.parseInt() turns a string into an integer

        String line1 = scan.nextLine();

        FoxTalks = line1.split(" ");


        //adding all the words in the arraylist
        for(int i = 0; i < FoxTalks.length; i++)
            foxtalk_list.add(FoxTalks[i]);

    }

    for (int item = 0; item < 4 ; item++){

        String line2 = scan.nextLine();

        Animals = line2.split(" "); 

        //adding all the words in the arraylist
        for(int i = 0; i < Animals.length; i++)
        animals_list.add(Animals[i]);

    }


    //removeAll from second array list
    for(int i = 0; i < foxtalk_list.size(); ++i){
        for(int j = 0; j < animals_list.size(); j++){

            //if a matching word found
            if(foxtalk_list.get(i).equals(animals_list.get(j))){

                //remove it from the arraylist
                foxtalk_list.remove(i);
                i--;
                break;
            }
                
        }
    }

    //print the final unique talks
    for(int i = 0; i < foxtalk_list.size(); i++)
        System.out.print(foxtalk_list.get(i) + " ");
    System.out.println();
    }

}