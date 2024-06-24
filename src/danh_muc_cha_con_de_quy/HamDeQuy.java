package danh_muc_cha_con_de_quy;

import java.util.ArrayList;
import java.util.List;

public class HamDeQuy {
    //parrentId = 0
    public void show_menu(String prefix, String indent, int parentId, List<Category> list){
        int index = 1;
        for(Category c : list){
            if(c.getParentId()==parentId){
                String currentPrefix = prefix.isEmpty()?""+index:prefix+"."+index;
                System.out.println(indent+currentPrefix+". "+c.getCatName());

                show_menu(currentPrefix, indent+"\t",c.getCatId(), list);

                index++;
            }
        }
    }

    public static void main(String[] args) {
        List<Category> list = new ArrayList<>();

        list.add(new Category(1, "Điện tử", 0));
        list.add(new Category(2, "Điện lạnh", 0));
        list.add(new Category(3, "Thời trang", 0));
        list.add(new Category(4, "Điện tử 1.1", 1));
        list.add(new Category(5, "Điện tử 1.2", 1));
        list.add(new Category(6, "Điện lạnh 2.1", 2));
        list.add(new Category(7, "Điện lạnh 2.1.1", 6));
        list.add(new Category(8, "Điện lạnh 2.2", 2));
        list.add(new Category(9, "Thời trang nam", 3));
        list.add(new Category(10, "Thời trang văn phòng", 9));
        list.add(new Category(11, "Thời trang trẻ em", 9));
        list.add(new Category(12, "Thời trang nữ", 3));

        System.out.println("Hiển thị menu đa cấp bằng đệ quy: ");
        HamDeQuy obj = new HamDeQuy();
        obj.show_menu("", "", 0, list);
    }
}
