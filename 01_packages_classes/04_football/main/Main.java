package main;

import footballtournament.Team;
import footballtournament.Player;
import footballtournament.Match;
import footballtournament.Tournament;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Team t = new Team();
        Player p = new Player();
        Match m = new Match();
        Tournament tou = new Tournament();
        
        t.name = "Jokers";
        t.players = "Dave,Fred,Leon,George";
        
        p.name = "Dave";
        
        m.team1 = t;
        m.score1 = 3;
        
        tou.name = "Champions";
        tou.teams = "Jokers,Smokers";
        tou.matches = "Jokers vs Smokers";
        
        System.out.println(t.name);
        System.out.println(p.name);
        System.out.println(m.score1);
        System.out.println(m.team1.players);
        System.out.println(tou.name);
    }    
}
