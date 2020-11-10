package item;

import java.io.Serializable;

public class ItemHolder implements Serializable{
	private String itemname;
	public ItemHolder(String itemname) {
		this.itemname = itemname;
	}
	
	public String getItem() {
		return itemname;
	}

}
