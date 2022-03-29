package churimon;

//検証用クラス
class TestMonster {
	public static void main (String[] args) {

		System.out.println( "▼Monster1▼");
		//Monster1
		Monster1 m1 = new Monster1();
		System.out.println( m1.toString() );

		m1.levelUp(2);
		System.out.println( m1.toString() );
		
		m1.setWaza("突撃", "10.0");
		System.out.println( m1.toString() );

		System.out.println(m1.getStatus());
		
		System.out.println(m1.useWaza());

		//m1.damaged(20);
		//System.out.println( m1.toString() );


		System.out.println( "▼Monster2▼");

		//Monster2
//		Monster2 m2 = new Monster2();
//		Monster2 m2 = new Monster2("trainer", "name");
		Monster2 m2 = new Monster2("trainer", "name",5);
		System.out.println( m2.toString() );

		m1.levelUp(2);
		System.out.println( m1.toString() );
		
		m1.setWaza("突撃", "10.0");
		System.out.println( m1.toString() );

		System.out.println(m1.getStatus());
		
		System.out.println(m1.useWaza());

		//m1.damaged(20);
		//System.out.println( m1.toString() );

		System.out.println( "▼Monster3▼");

		//Monster3
		Monster3 m3 = new Monster3();
		System.out.println( m3.toString() );
	}
}