package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T p) {
        participants.add(p);
        System.out.println("New partisipant ("+ p.getName()
                + ") added into team " + name);
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        }
        else {
            winnerName = team.name;
        }
        System.out.println("The winner team is " + winnerName);
    }
}
