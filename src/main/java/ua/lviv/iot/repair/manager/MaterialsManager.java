package ua.lviv.iot.repair.manager;

import ua.lviv.iot.repair.model.AbstractMaterials;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaterialsManager {
    private List<AbstractMaterials> materials = new LinkedList<>();
    public void addMaterials(List<AbstractMaterials> materials){
        this.materials.addAll(materials);
    }

    public List<AbstractMaterials> findMaterialsByPrice(double priceInUAH){
        List<AbstractMaterials> foundMaterials = new LinkedList<>();
        for(AbstractMaterials material:materials){
            if(material.getPriceInUAH()==priceInUAH){
                foundMaterials.add(material);
            }
        }
        return foundMaterials;
    }

    public List<AbstractMaterials> findMaterialsByColor(List<AbstractMaterials> materials, String materialsColor){
        List<AbstractMaterials> foundMaterials=new LinkedList<AbstractMaterials>();
        for(AbstractMaterials material:materials){
            if(material.getMaterialsColor().contains(materialsColor)){
                foundMaterials.add(material);
            }
        }
        return foundMaterials;
    }



}
