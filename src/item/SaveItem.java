package item;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveItem implements Serializable{
	private ItemHolder newitem;
	
	public SaveItem(String newn) {
		if(newn == null) {
			newitem = null;
		}else {
			newitem = new ItemHolder(newn);
		}
	}
	
	public void writeItem() {
		try {
			FileOutputStream fileoutput = new FileOutputStream("data_item.txt");
			ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
			objectoutput.writeObject(this.newitem);
			objectoutput.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ItemHolder readItem() {
		ItemHolder item = null;
		try {
			FileInputStream fileinput = new FileInputStream("data_item.txt");
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			item = (ItemHolder) objectinput.readObject();
			objectinput.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return item;
	}

}
