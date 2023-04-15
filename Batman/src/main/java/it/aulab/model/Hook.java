package it.aulab.model;

public class Hook {
    private Integer lunghezza;

    public Hook() {
    }

    public Hook(Integer lunghezza) {
        System.out.println("Create Hook");
        this.lunghezza = lunghezza;
    }

    public Integer getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(Integer lunghezza) {
        this.lunghezza = lunghezza;
    }
}
