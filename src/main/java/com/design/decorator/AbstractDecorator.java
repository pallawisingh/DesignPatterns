package com.design.decorator;

public class AbstractDecorator extends Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    void makeHouse() {
        if (component != null) {
            component.makeHouse();
        }
    }
}
