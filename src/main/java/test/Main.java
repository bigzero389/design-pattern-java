package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		
		p.text();
		p = c;		//Parent 의 Pointer 가 Child 로 바뀐다. 즉, 자료형이 아닌 포인터를 대입한다.
		p.text();   //C++에서는 virtual 쓰지 않으면 여기서 Parent 의 text() 가 호출된다.
		
		p.setName("Tom - child");
		p.text();
	}

}
