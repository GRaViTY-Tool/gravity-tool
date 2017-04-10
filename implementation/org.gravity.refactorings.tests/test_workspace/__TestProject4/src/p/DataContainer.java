package p;

public class DataContainer{

	Data[] datas = {};
	
	void add(Data d){
		int datas_length = datas.length;
		Data[] tmp = new Data[datas_length];
		for(int i = 0; i< datas_length; i++){
			tmp[i] = datas[i];
		}
		tmp[datas_length] = d;
		datas = tmp;
	}
	
	Data get(int i){
		if(datas.length >= i){
			return datas[i];
		}
		else{
			return null;
		}
	}
	
	int size(){
		return datas.length;
	}
}
