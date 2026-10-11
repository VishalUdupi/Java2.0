package WeaponBasedLLD;

abstract class AmmoStrategy implements Weapon {

    Player player;

    @Override
    public void attack() {
        System.out.println("Attacking");
        player.setHealth(player.getHealth() - 10);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}
