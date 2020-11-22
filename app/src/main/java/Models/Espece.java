package Models;

import java.io.Serializable;

public class Espece implements Serializable {
    String _nom;

    public Espece(String _nom) {
        this._nom = _nom;
    }

    @Override
    public String toString()
    {
        return _nom;
    }
}
