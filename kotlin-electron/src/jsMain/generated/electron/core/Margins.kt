package electron.core


external interface Margins {
    /**
     * Can be `default`, `none`, `printableArea`, or `custom`. If `custom` is chosen,
     * you will also need to specify `top`, `bottom`, `left`, and `right`.
     */
    var marginType: (MarginsMarginType)?

    /**
     * The top margin of the printed web page, in pixels.
     */
    var top: Double?

    /**
     * The bottom margin of the printed web page, in pixels.
     */
    var bottom: Double?

    /**
     * The left margin of the printed web page, in pixels.
     */
    var left: Double?

    /**
     * The right margin of the printed web page, in pixels.
     */
    var right: Double?
}
