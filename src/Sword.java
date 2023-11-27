public class Sword {
    private double swordDamage;

    private double swordBaseDamage;

    Sword(int damage, int level){
        swordBaseDamage = damage;
        swordDamage = swordBaseDamage * (1 + 0.1 * level);
    }
    public void upgrade(int level){
        swordDamage = swordDamage * (1 + 0.1*level);

    }
    public double getSwordDamage(){
        return swordDamage;
    }
    public double getSwordBaseDamage(){
        return swordBaseDamage;
    }

}
