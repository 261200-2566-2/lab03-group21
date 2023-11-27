public class Hero {
    public String name;
    private int level;
    private int HP;
    private int maxHP;
    private  int mana;
    private  int maxMana;
    private  double maxSpeed;
    private  double baseSpeed;


    private Shield shield;
    private Sword sword;

    private boolean haveShield;
    private boolean haveSword;

    Hero(String name){
        this.name = name;
        level = 1;
        maxHP = 100+10*level;
        HP = maxHP;
        maxMana = 50+2*level;
        mana = maxMana;
        baseSpeed = 100;
        maxSpeed = baseSpeed*(0.1+0.03+level);
    }
     void levelUp(){
        level += 1;
        maxHP = 100+10*level;
        maxMana = 50+2*level;
        if(haveSword) {
            sword.upgrade(level);
            this.maxSpeed = maxSpeed - baseSpeed*((0.1*0.04*level));
        }
        if(haveShield){
            shield.upgrade(level);
            this.maxSpeed = maxSpeed - baseSpeed*((0.1*0.08*level));
        }
    }



    void equipSword(int damage){
        haveSword = true;
        sword = new Sword(damage,level);
        this.maxSpeed = maxSpeed-(baseSpeed*(0.1*0.04*level));
    }

    void equipShield(int defense){
        haveShield = true;
        shield = new Shield(defense,level);
        this.maxSpeed = maxSpeed-(baseSpeed*(0.1*0.08*level));
    }

    public void showcase() {
        System.out.println("Hero name : " + this.name);
        System.out.println("level : " + this.level);
        System.out.println("HP : " + this.HP +"/" + this.maxHP);
        System.out.println("mana : " + this.mana +"/" + this.maxMana);
        System.out.printf("speed : %.2f",this.maxSpeed);
        System.out.println();
        System.out.println("-----------");
        System.out.println("equip Sword: " + this.haveSword);
        if(this.haveSword) {
            System.out.println("base atk : " + this.sword.getSwordBaseDamage());
            System.out.printf("atk :  %.2f", this.sword.getSwordDamage());
            System.out.println();
        }
        System.out.println("-----------");
        System.out.println("equip Shield: " + this.haveShield);
        if(this.haveShield) {
            System.out.println("base def : " + this.shield.getShieldBaseDefense());
            System.out.printf("def :  %.2f", this.shield.getShieldDaefense());
            System.out.println();
        }
        System.out.println();




    }
}
