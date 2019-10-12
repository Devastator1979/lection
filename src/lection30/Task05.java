package lection30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class DVDInfo {
    String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLeadActor(String LeadActor) {
        this.LeadActor = LeadActor;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLeadActor() {
        return LeadActor;
    }
    String genre;
    String LeadActor;
    DVDInfo(String t, String g, String a){
        title = t;
        genre = g;
        LeadActor = a;
    }
    @Override
    public String toString(){
        return title + " " + genre + " " + LeadActor + "\n";
    }
    //@Override
    //public int compareTo(DVDInfo d){
    //    return title.compareTo(d.getTitle());
    //}
}
class GenreSort implements Comparator<DVDInfo>{
    @Override
    public int compare(DVDInfo one, DVDInfo two){
        return one.getGenre().compareTo(two.getGenre());
    }
}
class TitleSort implements Comparator<DVDInfo>{
    @Override
    public int compare(DVDInfo one, DVDInfo two){
        return one.getTitle().compareTo(two.getTitle());
    }
}
class GenreSortObr implements Comparator<DVDInfo>{
    @Override
    public int compare(DVDInfo two, DVDInfo one){
        return two.getGenre().compareTo(one.getGenre());
    }
}

public class Task05 {
    public static void main(String args[]){
        ArrayList<DVDInfo> dvdinfo = new ArrayList<> ();
        dvdinfo.add(new DVDInfo("Nations","pop","Citizen Zombie"));
        dvdinfo.add(new DVDInfo("Russian Metal Ballads","folk","Tintal"));
        dvdinfo.add(new DVDInfo("We The People","rock","Adrenaline Mob"));
        //Collections.sort(dvdinfo);
        GenreSortObr gs = new GenreSortObr();
        Collections.sort(dvdinfo, gs);
        for(DVDInfo str : dvdinfo){
            System.out.print(str);
        }
//        TitleSort ts = new TitleSort();
//        Collections.sort(dvdinfo, gs);
//        for(DVDInfo str : dvdinfo){
//            System.out.print(str);
//        }
    }
}
