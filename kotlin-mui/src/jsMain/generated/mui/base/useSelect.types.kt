// Automatically generated - do not modify!

package mui.base

external interface SelectOptionDefinition {
    var value: Any

    var disabled: Boolean?

    var label: String
}

external interface UseSelectParameters<OptionValue, Multiple> {
    /**
     * If `true`, the select will be open by default.
     * @default false
     */
    var defaultOpen: Boolean?

    /**
     * The default selected value. Use when the component is not controlled.
     */
    var defaultValue: Any? /* SelectValue<OptionValue, Multiple> */

    /**
     * If `true`, the select is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The ref of the trigger button element.
     */
    var buttonRef: react.Ref<dynamic>?

    /**
     * The `id` attribute of the listbox element.
     */
    var listboxId: String?

    /**
     * The ref of the listbox element.
     */
    var listboxRef: react.Ref<dynamic>?

    /**
     * If `true`, the end user can select multiple values.
     * This affects the type of the `value`, `defaultValue`, and `onChange` props.
     *
     * @default false
     */
    var multiple: Any? /* Multiple */

    /**
     * Callback fired when an option is selected.
     */
    var onChange: Any? /* (e: React.MouseEvent | React.KeyboardEvent | React.FocusEvent | null, value: SelectValue<OptionValue, Multiple>) => void */

    /**
     * Callback fired when an option is highlighted.
     */
    var onHighlightChange: Any? /* (e: React.MouseEvent<Element, MouseEvent> | React.KeyboardEvent<Element> | React.FocusEvent<Element, Element> | null, highlighted: OptionValue | null) => void */

    /**
     * Callback fired when the listbox is opened or closed.
     */
    var onOpenChange: ((open: Boolean) -> Unit)?

    /**
     * Controls the open state of the select's listbox.
     * This is the controlled equivalent of the `defaultOpen` prop.
     */
    var open: Boolean?

    /**
     * An alternative way to specify the options.
     * If this parameter is set, options defined as JSX children are ignored.
     */
    var options: dynamic

    /**
     * A function used to convert the option label to a string.
     * This is useful when labels are elements and need to be converted to plain text
     * to enable keyboard navigation with character keys.
     *
     * @default defaultOptionStringifier
     */
    var optionStringifier: ((option: SelectOption<OptionValue>) -> String)?

    /**
     * The selected value.
     * Set to `null` to deselect all options.
     */
    var value: Any? /* SelectValue<OptionValue, Multiple> */
}

external interface UseSelectReturnValue<Value> {
    /**
     * If `true`, the trigger button is active (pressed).
     */
    var buttonActive: Boolean

    /**
     * If `true`, the trigger button has a visible focus.
     */
    var buttonFocusVisible: Boolean

    /**
     * If `true`, the select is disabled.
     */
    var disabled: Boolean

    /**
     * Action dispatcher for the select component.
     * Allows to programmatically control the select.
     */
    var dispatch: (action: Any /* ListAction<Value> | SelectAction */) -> Unit

    /**
     * Resolver for the button slot's props.
     * @param otherHandlers event handlers for the button slot
     * @returns props that should be spread on the button slot
     */
    var getButtonProps: react.Props /* <OtherHandlers extends EventHandlers = {}>(otherHandlers?: OtherHandlers) => UseSelectButtonSlotProps<OtherHandlers> */

    /**
     * Resolver for the listbox slot's props.
     * @param otherHandlers event handlers for the listbox slot
     * @returns props that should be spread on the listbox slot
     */
    var getListboxProps: react.Props /* <OtherHandlers extends EventHandlers = {}>(otherHandlers?: OtherHandlers) => UseSelectListboxSlotProps<OtherHandlers> */

    /**
     * A function that returns the metadata of an option with a given value.
     *
     * @param optionValue the value of the option
     * @returns
     */
    var getOptionMetadata: (optionValue: Value) -> SelectOption<Value>?

    /**
     * A value to be passed to the `SelectProvider` component.
     */
    var contextValue: dynamic

    /**
     * The value of the highlighted option.
     */
    var highlightedOption: dynamic

    /**
     * If `true`, the listbox is open.
     */
    var open: Boolean

    /**
     * Values of all the registered options.
     */
    var options: dynamic

    /**
     * The value of the selected option(s).
     */
    var value: dynamic
}

external interface ButtonClickAction {
    var type: dynamic

    var event: dynamic
}

external interface ButtonArrowKeyDownAction {
    var type: dynamic

    var key: String

    var event: dynamic
}

external interface SelectInternalState {
    var open: Boolean
}
