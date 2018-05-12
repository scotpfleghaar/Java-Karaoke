package com.karaoke;

import com.teamtreehouse.model.SongBook;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;



class KaraokeMachine {
    private SongBook mSongBook;
    private BufferedReader mReader;
    private Map<String, String> mMenu;

    public KaraokeMachine(SongBook songBook){
        mSongBook = songBook;
        mReader = new BufferedReader(new InputStreamReader(System.in));
        mMenu = new HashMap<String, String>();
        mMenu.put("add", "Add a new song to the songbook");
        mMenu.put("quit", "Give up, Exit the program");
    }
    private String promptAction() throws IOException{
        System.out.printf("There are %d songs available. Your options are: %n", mSongBook.getSongCount());
        for (Map.entry<String, String> option : mMenu.entrySet()){
            System.out.printf("%s - %s %n", option.getKey(), option.getValue());
        }
        System.out.print("What do you want to do: ");
        String choice = mReader.readLine();
        return choice.trim().toLowerCase();
    }

    public void run(){
        String choice = "";
        do {
            try {
                choice = promptAction();
                switch(choice){
                    case "add": 
                        // TODO: add a new song
                        break;
                    case "quit": 
                        System.out.println("Thanks for playing!");
                        break;
                    default: 
                        System.out.printf("Uknown Choice: '%s'%n%n", choice);
                }
            } catch(IOException ioe) {
                System.out.println("Problem with input");
                ioe.printStackTrace();
            }
            while(!choice.equals("quit"));
        } while ();
    }
    

}