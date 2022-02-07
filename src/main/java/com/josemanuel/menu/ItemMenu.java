package com.josemanuel.menu;

import java.util.Scanner;
import java.util.function.Function;

//Esta función representa un submenu dependiendo del calculo que quiera realizar

public class ItemMenu {

    private String mensajeMenu;
    private Menu subMenu;
    private Function<Scanner, Void> itemMenuFuncion;

    public ItemMenu(String mensajeMenu, Menu subMenu) {
        this.subMenu = subMenu;
        this.mensajeMenu = mensajeMenu;        
    }

    public ItemMenu(String mensajeMenu, Function<Scanner, Void> itemMenuFuncion) {
        this.mensajeMenu = mensajeMenu;
        this.itemMenuFuncion = itemMenuFuncion;
    }

    public Menu getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(Menu subMenu) {
        this.subMenu = subMenu;
    }

    public String getMensajeMenu() {
        return mensajeMenu;
    }

    public void setMensajeMenu(String mensajeMenu) {
        this.mensajeMenu = mensajeMenu;
    }

    public Function<Scanner, Void> getItemMenuFuncion() {
        return itemMenuFuncion;
    }

}
