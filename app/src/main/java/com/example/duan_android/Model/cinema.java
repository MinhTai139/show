package com.example.duan_android.Model;

public class cinema {
    private int id;
    private String hinh;
    private String tenrap;
    private String diachi;
    private String sdt;

    public cinema(int id, String hinh, String tenrap, String diachi, String sdt) {
        this.id = id;
        this.hinh = hinh;
        this.tenrap = tenrap;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getTenrap() {
        return tenrap;
    }

    public void setTenrap(String tenrap) {
        this.tenrap = tenrap;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
