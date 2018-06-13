package com.pluralsight;

public class WorkKey implements Key {

    private int keyCode;
    //public method to get the age variable
    public int get_keyCode(){ return this.keyCode; }
    //public method to set the age variable
    public void set_keyCode(int keyCode){ this.keyCode = keyCode; }
    @Override
    public void CreateKeyCode(int keyCode) {
        this.set_keyCode(keyCode);
        System.out.print("Succesful");
        System.out.print("\n");
    }
    public void Show(){
        System.out.print("Door Key : ");
        System.out.print(get_keyCode());
    }
}
