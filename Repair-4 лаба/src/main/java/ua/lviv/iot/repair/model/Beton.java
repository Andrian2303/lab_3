package ua.lviv.iot.repair.model;

public class Beton extends AbstractMaterials{
    protected String betonBrend;

    public String getBetonBrend() {
        return betonBrend;
    }

    public Beton(String materialsBrand,String materialsColor,double priceInUAH,int materialSize,String companyOfManufactures,boolean neededForSockets,String betonBrend){
        super(materialsBrand,materialsColor,priceInUAH,materialSize,companyOfManufactures,neededForSockets);
        this.betonBrend=betonBrend;
    }


}
