package danh_muc_cha_con;

import java.util.ArrayList;
import java.util.List;

public class SuDungVongLap {
    public static void main(String[] args) {
        List<danh_muc_cha_con.Category> list = new ArrayList<>();

        list.add(new danh_muc_cha_con.Category(1,"Điện tử",0));
        list.add(new danh_muc_cha_con.Category(2,"Điện lạnh",0));
        list.add(new danh_muc_cha_con.Category(3,"Thời trang",0));
        list.add(new danh_muc_cha_con.Category(4,"Điện tử 1.1",1));
        list.add(new danh_muc_cha_con.Category(5,"Điện tử 1.2",1));
        list.add(new danh_muc_cha_con.Category(6,"Điện lạnh 2.1",2));
        list.add(new danh_muc_cha_con.Category(7,"Điện lạnh 2.1.1",6));
        list.add(new danh_muc_cha_con.Category(8,"Điện lạnh 2.2",2));
        list.add(new danh_muc_cha_con.Category(9,"Thời trang nam",3));
        list.add(new danh_muc_cha_con.Category(10,"Thời trang văn phòng",9));
        list.add(new danh_muc_cha_con.Category(11,"Thời trang trẻ em",9));
        list.add(new danh_muc_cha_con.Category(12,"Thời trang nữ",3));

        System.out.println("Hiển thị menu đa cấp bằng vòng lặp: ");
        int index = 1;

        for(int i=0;i<list.size();i++){
            danh_muc_cha_con.Category current = list.get(i); //lay danh muc dang can xu ly ra

            //Lay duoc Category co parent = 0 dau tien (de in ra danh muc cha dau tien)
            if(current.getParentId()==0){
                //xu ly de in ra
                System.out.println(index+". "+current.getCatName()); //In ra duoc ten cua danh muc cha ngoai cung

                //In ra danh muc con cap 1 dau tien cua no (phat duyet tu dau danh sach)
                int level1_index = 1;
                int tab_level1 = 1;
                for(int j=0;j<list.size();j++){
                    danh_muc_cha_con.Category cat_leve1 = list.get(j);
                    if(cat_leve1.getParentId()==current.getCatId()){
                        //in ra ten danh muc con cap 1 cua Category dang xu ly

                        //Phai in ra so tab (so tab = level1_index)
                        for(int tab = 1; tab<=tab_level1;tab++){
                            System.out.print("\t");
                        }

                        //In ten danh muc con
                        System.out.println(index+"."+level1_index+". "+cat_leve1.getCatName());
                        //In xong roi thi se xu ly de in tiep danh muc con cap 2:

                        int level2_index = 1;
                        int tab_level2 = 2;
                        for(int k = 0; k<list.size();k++){
                            Category cat_level2 = list.get(k);
                            if(cat_level2.getParentId()== cat_leve1.getCatId()){
                                //in so tab cua con cap 2:
                                for(int tab = 1; tab<=tab_level2; tab++){
                                    System.out.print("\t");
                                }
                                System.out.println(index+"."+level1_index+"."+level2_index+". "+cat_level2.getCatName());

                                //xu ly xong thi tang level2_index len 1 de in ra node con cap 2 tiep theo
                                level2_index++;
                            }
                        }

                        //in ra xong thi tang level1_index len 1 de in ra tiep node con cap 1 tiep theo
                        level1_index++;
                    }
                }

                //in ra xong thi se tang index len 1 den sau nay in ra Category cap ngoai cung tiep theo
                index++;
            }
        }
    }
}
