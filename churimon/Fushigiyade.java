package churimon;

public class Fushigiyade extends Monster3{
	Fushigiyade(){
		super.setCharacter("フシギヤデ");
	}

	Fushigiyade(String pTrainer, String pName){
		super(pTrainer, pName);
		super.setCharacter("フシギヤデ");
	}

	Fushigiyade(String pTrainer, String pName, int pLv){
		super(pTrainer, pName, pLv);
		super.setCharacter("フシギヤデ");
	}

	void levelUp(int pUpLv) {
		setLv (getLv()   + (pUpLv*1) );
		setHp (getHp()   + (pUpLv*31));
		setAtk(getAtk()  + (pUpLv*6));
		setDef(getDef()  + (pUpLv*7));
		setSpd(getSpd()  + (pUpLv*8));
		setHpMax(getHp());
	}
}
