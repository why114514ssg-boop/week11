public class Match implements SoccerEntity {

    private String id;
    private String homeTeam;
    private String awayTeam;
    private String score;

    public Match(String id, String homeTeam, String awayTeam, String score) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return homeTeam + " vs " + awayTeam;
    }

    public String getScore() {
        return score;
    }
}
