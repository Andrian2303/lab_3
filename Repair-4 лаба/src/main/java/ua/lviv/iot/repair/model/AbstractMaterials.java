package ua.lviv.iot.repair.model;

public abstract class AbstractMaterials {
    protected String materialsBrand;
    protected String materialsColor;
    protected double priceInUAH;
    protected int materialSize;
    protected String companyOfManufactures;
    protected boolean neededForSockets;

    public String getMaterialsBrand(){
        return materialsBrand;
    }

    public void setMaterialsBrand(String materialsBrand) {
        this.materialsBrand = materialsBrand;
    }


    public String getMaterialsColor(){
        return materialsColor;
    }

    public void setMaterialsColor(String materialsColor ) {
        this.materialsColor = materialsColor;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(double priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public int getMaterialSize() {
        return materialSize;
    }

    public void setMaterialSize(int materialSize) {
        this.materialSize = materialSize;
    }

    public String getCompanyOfManufactures(){
        return companyOfManufactures;
    }
    public void setCompanyOfManufactures(String companyOfManufactures) {
        this.companyOfManufactures = companyOfManufactures;
    }
    public Boolean getNeededForSockets() {
        return neededForSockets;
    }

    public void setNeededForSockets(boolean neededForSockets) {
        this.neededForSockets = neededForSockets;
    }

    public  AbstractMaterials(String materialsBrand,String materialsColor,double priceInUAH,int materialSize,String companyOfManufactures,boolean neededForSockets){
        super();

        this.materialsBrand=materialsBrand;
        this.materialsColor=materialsColor;
        this.priceInUAH=priceInUAH;
        this.materialSize=materialSize;
        this.companyOfManufactures=companyOfManufactures;
        this.neededForSockets=neededForSockets;
    }

    public  int compareTo(AbstractMaterials secondMaterial){
        return 0;
    }
}
