package item;
import java.util.Scanner;

public class Menu {
	private Scanner scan;
	
	public Menu() {
		scan = new Scanner(System.in);
	}
	
	public void start() {
		int choose;
		do {
		System.out.println("\nMenu Chest Satu Item\n1.Masukkan Item\n2.Lihat Item\n3.Hapus Semua Item\n4.Keluar\n");
		System.out.println("PILIHAN >> ");
		choose = scan.nextInt(); scan.nextLine();
		this.main_menu(choose);
		}while(choose != 4);
	}


	public void main_menu(int ch) {
		switch(ch) {
		case 1:
			SaveItem saveItem = new SaveItem(getItem("Input Item baru : "));
			saveItem.writeItem();
			break;
		case 2:
			ItemHolder itemholder = SaveItem.readItem();
			if(itemholder == null) {
				System.out.println("chest Tidak Berisi Item Alias Kosong\n");
			}
			else {
				System.out.println("Nama Item : " + itemholder.getItem());
			}
			break;
		case 3:
			SaveItem delItem = new SaveItem(null);
			delItem.writeItem();
			break;
		case 4:
			break;
		default:
			System.out.println("input tidak terdapat pada menu bos!\n");
			
		}
	}
	
	private String getItem(String msg) {
		System.out.println(msg);
		return scan.nextLine();
	}
		
}