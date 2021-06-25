public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Dani
    Date: 6/125/2055
    */
        public static void main(String[] args){
        String name1 = "Shreck";
        String name2 = "Fiona";
        String adjective1 = "colorful";
        String adjective2 = "awesome";
        String noun1 = "house";
        String noun2 = "truck";
        String verb1 = "run";
        String noun3 = "shovel";
        String noun4 = "garbage can";
        String adjective3 = "cute";
        String place1 = "San Francisco";
        String noun5 = "tree";
        int number = 328;
        String noun6 = "delicious";
        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
      }       
  }
  