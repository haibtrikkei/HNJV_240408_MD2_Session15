package danh_muc_cha_con_de_quy;

import java.util.*;

// Định nghĩa lớp MenuItem để biểu diễn một mục trong menu
class MenuItem {
    String label;
    List<MenuItem> children;

    public MenuItem(String label) {
        this.label = label;
        this.children = new ArrayList<>();
    }

    public void addChild(MenuItem child) {
        children.add(child);
    }

    public List<MenuItem> getChildren() {
        return children;
    }
}

public class MultiLevelMenu {

    // Phương thức đệ quy để in ra menu
    public static void printMenu(MenuItem item, String prefix) {
        System.out.println(prefix + item.label);
        for (MenuItem child : item.getChildren()) {
            printMenu(child, prefix + "\t");
        }
    }

    public static void main(String[] args) {
        // Tạo menu đa cấp
        MenuItem root = new MenuItem("Menu");

        // Tạo các mục con cho menu
        MenuItem dienTu = new MenuItem("Điện tử");
        dienTu.addChild(new MenuItem("Điện tử 1.1"));
        dienTu.addChild(new MenuItem("Điện tử 1.2"));

        MenuItem dienTu1_2 = new MenuItem("Điện tử 1.2");
        dienTu1_2.addChild(new MenuItem("Điện tử 1.2.1"));
        dienTu1_2.addChild(new MenuItem("Điện tử 1.2.2"));

        dienTu.addChild(dienTu1_2);

        MenuItem dienLanh = new MenuItem("Điện lạnh");
        MenuItem dienLanh2_1 = new MenuItem("Điện lạnh 2.1");
        dienLanh2_1.addChild(new MenuItem("Điện lạnh 2.1.1"));
        dienLanh.addChild(dienLanh2_1);

        MenuItem dienLanh2_2 = new MenuItem("Điện lạnh 2.2");
        dienLanh.addChild(dienLanh2_2);

        MenuItem thoiTrang = new MenuItem("Thời trang");
        MenuItem thoiTrangNam = new MenuItem("Thời trang nam");
        thoiTrangNam.addChild(new MenuItem("Thời trang văn phòng"));
        thoiTrangNam.addChild(new MenuItem("Thời trang trẻ em"));

        MenuItem thoiTrangNu = new MenuItem("Thời trang nữ");

        thoiTrang.addChild(thoiTrangNam);
        thoiTrang.addChild(thoiTrangNu);

        root.addChild(dienTu);
        root.addChild(dienLanh);
        root.addChild(thoiTrang);

        // In ra menu
        printMenu(root, "");
    }
}
