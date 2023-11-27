public class Shield {
    private double shieldDefense;
    private double shieldBaseDefense;

    Shield(int defense, int level){
        shieldBaseDefense = defense;
        shieldDefense = shieldBaseDefense * (1 + 0.1*level);
    }
    public void upgrade(int level){
        shieldDefense = shieldBaseDefense * (1 + 0.1*level);
    }
    public double getShieldDaefense(){
        return shieldDefense;
    }
    public double getShieldBaseDefense(){
        return shieldBaseDefense;
    }
}
