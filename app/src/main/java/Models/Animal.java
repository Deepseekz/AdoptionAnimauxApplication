package Models;

public class Animal {

    private String _nom;
    private Espece _espece;
    private int _age;
    private String _status;
    private int _photo;

    public String get_nom() {
        return _nom;
    }

    public Espece get_espece() {
        return _espece;
    }

    public int get_age() {
        return _age;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status){

    }

    public int get_photo() {
        return _photo;
    }

    public Animal(String _nom, Espece _espece, int _age, String _status, int _photo) {
        this._nom = _nom;
        this._espece = _espece;
        this._age = _age;
        this._status = _status;
        this._photo = _photo;
    }
}
