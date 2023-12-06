package com.example.application.views.vehiculos2;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Vehiculos2")
@Route(value = "vehiculos2", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class Vehiculos2View extends Composite<VerticalLayout> {

    public Vehiculos2View() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
