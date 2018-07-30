package com.pallidaretake.pallidaretake.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

  @Entity
  public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int inStore;
    private float unitPrice;

    private String itemName;
    private String manufacturer;
    private String category;
    private String size;


    public Warehouse() {
    }

    public Warehouse(int inStore, float unitPrice, String itemName, String manufacturer, String category, String size) {
      this.inStore = inStore;
      this.unitPrice = unitPrice;
      this.itemName = itemName;
      this.manufacturer = manufacturer;
      this.category = category;
      this.size = size;
    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public int getInStore() {
      return inStore;
    }

    public void setInStore(int inStore) {
      this.inStore = inStore;
    }

    public float getUnitPrice() {
      return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
      this.unitPrice = unitPrice;
    }

    public String getItemName() {
      return itemName;
    }

    public void setItemName(String itemName) {
      this.itemName = itemName;
    }

    public String getManufacturer() {
      return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
    }

    public String getCategory() {
      return category;
    }

    public void setCategory(String category) {
      this.category = category;
    }

    public String getSize() {
      return size;
    }

    public void setSize(String size) {
      this.size = size;
    }


  }
