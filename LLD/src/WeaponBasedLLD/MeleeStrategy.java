package WeaponBasedLLD;

abstract class MeleeStrategy implements Weapon{

    Player player;

    @Override
    public void attack() {
        System.out.println("Attacking");
        player.setHealth(player.getHealth() - 5);
    }

    @Override
    public int getDamage() {
        return 5;
    }
}
