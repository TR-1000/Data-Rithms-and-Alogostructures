package comparesort;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class InfyCupCricketSelection {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfPlayers = scan.nextInt();

        List<Player> playersList = new ArrayList<>();
        for (int i = 1; i <= noOfPlayers; i++) {
            Player player = new Player(scan.next(), scan.nextDouble(), scan.next());
            playersList.add(player);
       
        }
        //System.out.println(playersList);
        //Collections.sort(playersList);
        //System.out.println(playersList);

        Map<Integer, Player> finalSetOfPlayers = new HashMap<>();
        finalSetOfPlayers = Player.selectionProcess(playersList, noOfPlayers);
        System.out.println(finalSetOfPlayers);
        scan.close();

    }

}

class Player implements Comparable<Player>{
    private String playerName;
    private Double avarage;
    private String playerDOB;

    public Player(String playerName, Double avarage, String playerDOB) {
        super();
        this.playerName = playerName;
        this.avarage = avarage;
        this.playerDOB = playerDOB;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Double getAvarage() {
        return avarage;
    }

    public void setAvarage(Double avarage) {
        this.avarage = avarage;
    }

    public String getPlayerDOB() {
        return playerDOB;
    }

    public void setPlayerDOB(String playerDOB) {
        this.playerDOB = playerDOB;
    }

    
    public int compareTo(Player otherPlayer) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        int diff = getAvarage().compareTo(otherPlayer.getAvarage());

        if (diff != 0)
            return diff;

        diff = LocalDate.parse(getPlayerDOB(), formatter)
                .compareTo(LocalDate.parse(otherPlayer.getPlayerDOB(), formatter));
        if (diff != 0)
            if (diff > 0) {
                diff = -1;
                return diff;
            } else {
                diff = 1;
                return diff;
            }

        diff = getPlayerName().compareTo(otherPlayer.getPlayerName());
        if (diff > 0) {
            diff = -1;
            return diff;
        } else {
            diff = 1;
            return diff;
        }
    }      

    @Override
    public String toString() {
        return this.playerName;
    }

    public static Map<Integer, Player> selectionProcess(List<Player> playerList, int noOfPlayers) {
        
        Set<Player> playerSet = new TreeSet<>();
        
        for(Player p: playerList){
            playerSet.add(p);
        }
         
        
        Map<Integer, Player> playerMap = new TreeMap<>();
        for(Player p: playerSet){
            playerMap.put(noOfPlayers,p);
            noOfPlayers--;
           
        }
        return playerMap;
    }
}