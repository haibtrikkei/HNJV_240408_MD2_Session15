package danh_muc_cha_con;

public class Category {
    private int catId;
    private String catName;
    private int parentId;

    public Category() {
    }

    public Category(int catId, String catName, int parentId) {
        this.catId = catId;
        this.catName = catName;
        this.parentId = parentId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
