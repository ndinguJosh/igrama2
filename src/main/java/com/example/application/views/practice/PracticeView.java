package com.example.application.views.practice;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;

@PageTitle("Practice")
@Route(value = "practice", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class PracticeView extends Composite<VerticalLayout> {

    public PracticeView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H2 h2 = new H2();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Paragraph textLarge = new Paragraph();
        Paragraph textLarge2 = new Paragraph();
        Hr hr = new Hr();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Paragraph textLarge3 = new Paragraph();
        Paragraph textLarge4 = new Paragraph();
        H2 h22 = new H2();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Span badge = new Span();
        Span badge2 = new Span();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h2.setText("test yourself");
        h2.setWidth("max-content");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("min-content");
        layoutRow.setHeight("min-content");
        textLarge.setText("word");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textLarge2.setText("another");
        textLarge2.setWidth("100%");
        textLarge2.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        textLarge3.setText("wordbank");
        textLarge3.setWidth("max-content");
        textLarge3.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textLarge4.setText("anotherbank");
        textLarge4.setWidth("max-content");
        textLarge4.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        h22.setText("rate yourself");
        h22.setWidth("max-content");
        layoutRow3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("min-content");
        layoutRow3.setHeight("min-content");
        badge.setText("word");
        badge.setWidth("min-content");
        badge.getElement().getThemeList().add("badge");
        badge2.setText("another");
        badge2.setWidth("min-content");
        badge2.getElement().getThemeList().add("badge");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h2);
        layoutColumn2.add(layoutRow);
        layoutRow.add(textLarge);
        layoutRow.add(textLarge2);
        layoutColumn2.add(hr);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(textLarge3);
        layoutRow2.add(textLarge4);
        layoutColumn2.add(h22);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(badge);
        layoutRow3.add(badge2);
    }
}
