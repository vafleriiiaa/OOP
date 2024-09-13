import java.util.Scanner;

public class task17 {
    static class Player {
        String name;
        int health;
        Player(String n, int h) { name = n; health = h; }
        void attack(Enemy e) { e.health -= 10; }
    }
    static class Enemy {
        int health = 50;
    }
    public static void main(String[] args) {
        Player p = new Player("Hero", 100);
        Enemy e = new Enemy();
        p.attack(e);
        System.out.println("Enemy health: " + e.health);
    }
}
