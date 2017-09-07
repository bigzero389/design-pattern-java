package chainofResponsibility;

public abstract class Support {
	private String name;
	private Support next;
	
	public Support(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	// ��������� ������ �ִ� ������ null �� �ƴϸ� �ѱ� �� �ִ�.
	public final void support(Trouble trouble){
		
		if(this.resolve(trouble)){
			this.done(trouble);
		}else if(next != null){
			next.support(trouble);
		}else {
			this.fail(trouble);
		}
	}
	
	//next�� setting �Ѵٴ°� �������� �ѱ�ٴ� �ǹ�
	public Support setNext(Support next){
		this.next = next;
		return this.next;
	}
	
	public String toString(){
		return "[" + this.name + "]";
	}
	
	public void done(Trouble trouble){
		System.out.println("Trouble "+ trouble +" is resolved by " + this + ".");
	}
	
	public void fail(Trouble trouble){
		System.out.println("Trouble "+ trouble +" isn't resolved by " + this + ".");
	}
	
	public abstract boolean resolve(Trouble trouble);

}
