package WeaponBasedLLD;

public class MachineGun extends AmmoStrategy{
    @Override
    public void attack() {
        System.out.println("Attacking");
        player.setHealth(player.getHealth() - 20);
    }

    @Override
    public int getDamage() {
        return 20;
    }
}
