package ua.lviv.iot.repair.model;

public class Wire extends AbstractMaterials {
    protected TypeOfWire typeOfWire;

    public TypeOfWire getTypeOfWire() {
        return typeOfWire;
    }

    public Wire(String materialsBrand,String materialsColor,double priceInUAH,double materialSize,String companyOfManufactures,boolean neededForSockets, TypeOfWire typeOfWire){
        super(materialsBrand,materialsColor,priceInUAH,materialSize,companyOfManufactures,neededForSockets);
        this.typeOfWire=typeOfWire;
    }
}
