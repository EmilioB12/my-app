package com.example.application.views.detallevehiculo;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("DetalleVehiculo")
@Route(value = "detalle-vehiculo", layout = MainLayout.class)
@Uses(Icon.class)
public class DetalleVehiculoView extends Composite<VerticalLayout> {

    public DetalleVehiculoView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H5 h5 = new H5();
        H6 h6 = new H6();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H5 h52 = new H5();
        H6 h62 = new H6();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        h5.setText("Heading");
        h5.setWidth("max-content");
        h6.setText("Heading");
        h6.setWidth("max-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        h52.setText("Heading");
        h52.setWidth("max-content");
        h62.setText("Heading");
        h62.setWidth("max-content");
        getContent().add(layoutRow);
        layoutRow.add(h5);
        layoutRow.add(h6);
        getContent().add(layoutRow2);
        layoutRow2.add(h52);
        layoutRow2.add(h62);
    }
}
