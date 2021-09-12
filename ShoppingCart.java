interface ShoppingCart{
    void addMenu(Menu menu);
    void removeMenu(String name);
    Menu[] saveMenus();
}