package com.uniyaz.components;

import com.vaadin.ui.Alignment;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class FooterLayout extends HorizontalLayout {


    public FooterLayout(){


        setSizeFull();

        Label footer =new Label();
        footer.setValue("Universal genç programcı");
        footer.setSizeUndefined();

        addComponent(footer);
        setComponentAlignment(footer, Alignment.MIDDLE_CENTER);


    }



}
