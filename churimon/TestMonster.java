package churimon;

//検証用クラス
class TestMonster {
	public static void main (String[] args) {
		System.out.println( "▼Monster3▼");

		//Monster3
		//Monster3 m3 = new Monster3();
		//Monster3 m3 = new Monster3("トレーナー1","モンスター3");
		Monster3 m3 = new Monster3("トレーナー1","モンスター3",1);
		System.out.println( m3.toString() );

		//m3.levelUp(2);
		//System.out.println( m3.toString() );

		m3.setWaza("わざ１", "9.0");
		System.out.println( m3.toString() );
	
		System.out.println(m3.getStatus());
		
		System.out.println(m3.useWaza());
	
		//m3.damaged(20);
		//System.out.println( m3.toString() );

		
		System.out.println( "▼Hitokake▼");
		Hitokake h1 = new Hitokake("トレーナA","Hitokake-A",2);
		System.out.println( h1.toString() );

		System.out.println( "▼Fushigiyade▼");
		Fushigiyade f1 = new Fushigiyade("トレーナB","Fushigiyade-A",3);
		System.out.println( f1.toString() );

		f1.damaged(h1.useWaza());
		System.out.println( h1.toString() );
		System.out.println( f1.toString() );
	}
}