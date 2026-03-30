import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public List<Team> createSampleTeams() {

        List<Team> teams = new ArrayList<>();

        teams.add(new Team("1","FC Barcelona","Spain","La Liga"));
        teams.add(new Team("2","Manchester United","England","Premier League"));
        teams.add(new Team("3","Bayern Munich","Germany","Bundesliga"));
        teams.add(new Team("4","Juventus","Italy","Serie A"));
        teams.add(new Team("5","PSG","France","Ligue 1"));

        return teams;
    }

    public List<Player> createSamplePlayers() {

        List<Player> players = new ArrayList<>();

        players.add(new Player("1","Messi","Forward","FC Barcelona"));
        players.add(new Player("2","Ronaldo","Forward","Juventus"));
        players.add(new Player("3","Lewandowski","Forward","Bayern Munich"));
        players.add(new Player("4","De Bruyne","Midfielder","Manchester City"));

        return players;
    }

    public List<Match> createSampleMatches() {

        List<Match> matches = new ArrayList<>();

        matches.add(new Match("1","Barcelona","Real Madrid","2-1"));
        matches.add(new Match("2","Manchester United","Liverpool","0-3"));
        matches.add(new Match("3","Bayern Munich","Dortmund","4-2"));

        return matches;
    }
}
