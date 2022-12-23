package com.example.mini_project_dictonary;

import java.util.HashMap;

public class Dictionary_using_HM {
    private static HashMap<String,String> dictionary;
    public Dictionary_using_HM() {
        dictionary = new HashMap<>();
        addWordList();
    }
    public static String getMeaning(String word){
        char [] arr = word.toCharArray();
        if(arr[0] >= 'a' && arr[0] <= 'z') arr[0] = (char)(arr[0] -32);
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < arr.length;i++) sb.append(arr[i]);
        word = sb.toString();
        return dictionary.getOrDefault(word, "Name does not exit in dictionary!!");
    }
    public boolean addWord(String word, String meaning){
        try{
            dictionary.put(word, meaning);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private void addWordList(){
        // add all word and meaning at once
        addWord("Aubh", "Auspicious");
        addWord("Abc", "Sample to show Wrap Up text function by keeping random meaning of word abc : abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789");
        addWord("ccd", "ccd");
        addWord("Absence"," The lack or unavailability of something or someone.");
        addWord("Approval"," Having a positive opinion of something or someone");
        addWord("Answer"," The response or receipt to a phone call, question, or letter");
        addWord("Attention"," Noticing or recognizing something of interest");
        addWord("Amount"," A mass or a collection of something");
        addWord("Borrow"," To take something with the intention of returning it after a period of time");
        addWord("Baffle"," An event or thing that is a mystery and confuses");
        addWord("Ban"," An act prohibited by social pressure or law");
        addWord("Banish"," Expel from the situation, often done officially");
        addWord("Banter"," Conversation that is teasing and playful");
        addWord("Characteristic"," referring to features that are typical to the person, place, or thing");
        addWord("Cars"," Four-wheeled vehicles used for traveling");
        addWord("Care"," extra responsibility and attention");
        addWord("Chip"," a small and thin piece of a larger item");
        addWord("Cease"," to eventually stop existing");
        addWord("Dialogue"," A conversation between two or more people");
        addWord("Decisive"," a person who can make decisions promptly");
        addWord("Delusion"," false impression or belief");
        addWord("Deplete"," steady reduction in the quantity or number of something");
        addWord("Derogatory"," disrespectful person or statement");
        addWord("Edible"," something suitable to be eaten");
        addWord("Effervescent"," an event marked by excitement and high spirits");
        addWord("Eloquent"," an individual who expresses themselves effectively and clearly");
        addWord("Elusive"," a person skilled at evading capture; a daily use of English words used to describe evasive criminals");
        addWord("Embody"," represented in a physical form");
        addWord("Fabricate"," an invention of untrue facts to a story or situation");
        addWord("Feasible"," an activity that is possible");
        addWord("Feat"," an activity that requires great strength, skill, and courage");
        addWord("Feeble"," a person or statement that is unconvincing and weak");
        addWord("Fixation"," An obsession over something or someone");
        addWord("Generic"," a group or class that does not have a brand name");
        addWord("Gimmick"," a device or trick delivered to attract attention");
        addWord("Graffiti"," Drawings or writings on a surface in public");
        addWord("Grandiose"," a person, plan, or situation that is ambitious, showy, and impressive");
        addWord("Grievous"," an event or person causing severe grief");
        addWord("Hostile"," an unfriendly person or situation");
        addWord("Huddle"," to gather together in a close mass or group");
        addWord("Hindsight"," the understanding of an event after it has already happened");
        addWord("Idealistic"," a person who is motivated by moral and noble beliefs as opposed to practicality");
        addWord("Imminent"," an event or a situation that is about to occur or close in time");
        addWord("Impartial"," a person who is free from preconceived notions or undue bias");
        addWord("Imperative"," an action that is necessary or crucial");
        addWord("Impromptu"," describing a situation that occurs without advance preparations");
        addWord("Jeopardize"," the endangerment to a person or situation");
        addWord("Jovial"," a cheerful, merry and good-natured person");
        addWord("Jug"," a utensil or container used to hold liquids");
        addWord("Jostle"," moving through a crowd by means of shoving and pushing");
        addWord("Jubilant"," a person or crowd that is full of delight and high spirits");
    }
}
