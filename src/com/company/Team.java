package com.company;

import java.util.List;

public class Team {
    private String name;
    private String projektName;
    private List<Mitarbeiter> listMitarbeiter;

    public Team(String name, String projektName, List<Mitarbeiter> listMitarbeiter) {
        this.name = name;
        this.projektName = projektName;
        this.listMitarbeiter = listMitarbeiter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjektName() {
        return projektName;
    }

    public void setProjektName(String projektName) {
        this.projektName = projektName;
    }

    public List<Mitarbeiter> getListMitarbeiter() {
        return listMitarbeiter;
    }

    public void setListMitarbeiter(List<Mitarbeiter> listMitarbeiter) {
        this.listMitarbeiter = listMitarbeiter;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", projektName='" + projektName + '\'' +
                ", listMitarbeiter=" + listMitarbeiter +
                '}';
    }
}
