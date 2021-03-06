package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.ui.*;

public class SidebarLayout extends VerticalLayout {

    public SidebarLayout() {
        setSizeFull();

        Button misyon=new Button();
        Button vizyon=new Button();
        Button hakkımızda= new Button() ;
        misyon.setCaption("misyon");
        vizyon.setCaption("vizyon");
        hakkımızda.setCaption("hakkımızda");

        misyon.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                ContectLayout contectLayout =new ContectLayout();
                contectLayout.misyon();

            }
        });




        addComponent(misyon);
        addComponent(vizyon);
        addComponent(hakkımızda);

        setExpandRatio(misyon,3f);
        setExpandRatio(vizyon,3f);
        setExpandRatio(hakkımızda,3f);



    }
}
