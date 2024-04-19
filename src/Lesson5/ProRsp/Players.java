package Lesson5.ProRsp;

public class Players extends Logic {
    public int[] players;
    public int count;

    public Players(String rock, String paper, String scissors) {
        super(rock, paper, scissors);
    }

    public int[] arrayPlayers() {

        return players;
    }

    public void display() {
        for (int numberOfThem : arrayPlayers()) {
            System.out.println(count++ + ") player");
        }
    }
}
