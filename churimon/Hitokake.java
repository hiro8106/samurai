package churimon;

public class Hitokake extends Monster3{
	Hitokake(){
		super.setCharacter("ヒトカケ");
	}

	Hitokake(String pTrainer, String pName){
		super(pTrainer, pName);
		super.setCharacter("ヒトカケ");
	}

	Hitokake(String pTrainer, String pName, int pLv){
		super(pTrainer, pName, pLv);
		super.setCharacter("ヒトカケ");
	}

	void levelUp(int pUpLv) {
		setLv (getLv()   + (pUpLv*1) );
		setHp (getHp()   + (pUpLv*29));
		setAtk(getAtk()  + (pUpLv*8));
		setDef(getDef()  + (pUpLv*5));
		setSpd(getSpd()  + (pUpLv*9));
		setHpMax(getHp());
	}
}
