package memento;

public class MementoMain {
	public static void main(String[] args){
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		for(int i=0,j=100 ; i<j ; i++){
			System.out.println("====== " + i);
			System.out.println("Current status: " + gamer);
			
			gamer.bet();
			
			System.out.println("Your money is got " + gamer.getMoney());
			
			if(gamer.getMoney() > memento.getMoney()){
				System.out.println("I have to save my money for increasing a lot");
				memento = gamer.createMemento();
			}else if(gamer.getMoney() < memento.getMoney()/2){
				System.out.println("I have to restore my money for decreasing a lot");
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("");
		}
		
	}

}
