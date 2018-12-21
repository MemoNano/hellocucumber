package common.models;

/**
 * Element Object Class
 */
public class Element {

    private SelectorType selectorType;
    private String selector;
    private String description;

    /**
     * Element Object
     *
     * @param selectorType Type of element selector (xpath, id, css, etc)
     * @param selector     Specific selecter to look for
     * @param description  Description of element
     */
    public Element(SelectorType selectorType, String selector, String description) {
        this.selectorType = selectorType;
        this.selector = selector;
        this.description = description;
    }

    /**
     * Returns Selector type
     *
     * @return selectorType
     */
    public SelectorType getSelectorType() {
        return selectorType;
    }

    /**
     * Returns Selector text
     *
     * @return selector
     */
    public String getSelector() {
        return selector;
    }

    /**
     * Returns selector description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Enum of all allowed Selector Types
     */
    public enum SelectorType {
        ID, XPATH, LINK, PARTIAL_LINK, NAME, TAG, CLASS, CSS
    }
}
