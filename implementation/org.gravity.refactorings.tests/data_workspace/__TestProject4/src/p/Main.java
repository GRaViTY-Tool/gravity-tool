package p;

public class Main {

	DataContainer list = new DataContainer();
	
	String[] names = {"a","b","c"};
	
	public static void main(String[] args) {
		Main m = new Main();
		m.createDatas();
		m.setValues();
		for(int i = 0; i < m.list.size(); i++){
			m.list.get(i).getS();
		}
	}

	void createDatas(){
		for(int i=0; i<100; i++){
			list.add(new Data());
		}
	}
	
	void setValues(){
		int i = 0;
		for(int j = 0; j < list.size(); j++){
			list.get(j).setS(names[i++]);
			if(i>names.length){
				i=0;
			}
		}
	}
}
