public class Role {
    private String name;
    private int level;
    private int blood;

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fight() {
        System.out.println("發動攻擊");
    }

    @Override
    public String toString(){
        return String.format("(%s, %d, %d)",blood,level,name);
    }
}
Role
public class SwordsMan extends Role {
    @Override
    public void fight() {
        super.fight();
        System.out.println("揮劍攻擊");
    }

    @Override
    public String toString(){
        return String.format("劍士:%s",super.toString());
    }
}

SwordsMan.java
public class Magician extends Role {
    @Override
    public void fight() {
        super.fight();
        System.out.println("魔法攻擊");
    }

    public void cure() {
        System.out.println("魔法治療");
    }

    @Override
    public String toString() {
        return String.format("魔法師:%s", super.toString());
    }
}
Magician.java
public class RPG {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        //System.out.printf("劍士：(%s, %d, %d)%n", swordsMan.getName(),
        //      swordsMan.getLevel(), swordsMan.getBlood());
        System.out.println(swordsMan);
        swordsMan.fight();
    }

    static void demoMagician() {
        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
//        System.out.printf("魔法師：(%s, %d, %d)%n", magician.getName(),
//                magician.getLevel(), magician.getBlood());
        System.out.println(magician);
        magician.fight();
        magician.cure();
    }
}
RPG.java