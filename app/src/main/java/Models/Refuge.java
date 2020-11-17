package Models;

import java.util.ArrayList;

public class Refuge {
    private String _nom;
    private String _adresse;
    private ArrayList<Animal> _animaux;
    private ArrayList<Espece> _especes;

    public Refuge(String _nom, String _adresse) {
        this._nom = _nom;
        this._adresse = _adresse;
        this._animaux = new ArrayList<>();
        this._especes = new ArrayList<>();
    }

    public void AjouterAnimal(Animal unAnimal){
        this._animaux.add(unAnimal);
    }

    public void AjouterEspece(Espece uneEspece){
        this._especes.add(uneEspece);
    }

}
