import java.util.List;

public class MatchRepository extends Repository<Match> {

    public List<Match> filterByTeam(String team) {
        return filter(match ->
                match.getName().toLowerCase().contains(team.toLowerCase())
        );
    }
}
