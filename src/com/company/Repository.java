package com.company;
import java.util.ArrayList; import java.util.List; public class Repository {

    List<Mitarbeiter> mitarbeitersList; List<Team> teamList; public Repository(){
        mitarbeitersList = new ArrayList<>(); teamList = new ArrayList<>(); }

    public void addMitarbeiter(Mitarbeiter mitarbeiter){
        mitarbeitersList.add(mitarbeiter); }

    public void addTeam(Team team){
        teamList.add(team); }

    public Mitarbeiter getMitarbeiter(int i){
        return mitarbeitersList.get(i); }

    public Mitarbeiter getProduct(String name) throws Exception {
        for(int i = 0 ; i < mitarbeitersList.size() ; i++){
            if(mitarbeitersList.get(i).name.equals(name)){
                return mitarbeitersList.get(i); }
        }

        throw new Exception("Mitarbeiter doesnt exist"); }

    public Team getTeam(int i){
        return teamList.get(i); }

    public void removeMitarbeiterByIndex(int i){
        mitarbeitersList.remove(i); }

    public void removeProductByName(String name){
        for(int i = 0 ; i < mitarbeitersList.size() ; i++){
            if(mitarbeitersList.get(i).name.equals(name)){
                mitarbeitersList.remove(i); i--; }
        }
    }


    @Override public String toString(){
        String message = "Mitarbeiter:\n"; for(int i = 0 ; i < mitarbeitersList.size() ; i++){
            message += "\t" + mitarbeitersList.get(i) + "\n"; }

        message += "Team:\n"; for(int i = 0 ; i < teamList.size() ; i++){
            message += "\t" + teamList.get(i) + "\n"; }

        return message; }

}
