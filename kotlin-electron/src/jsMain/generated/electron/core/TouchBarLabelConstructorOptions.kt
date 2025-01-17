package electron.core


external interface TouchBarLabelConstructorOptions {
    /**
     * Text to display.
     */
    var label: String?

    /**
     * A short description of the button for use by screenreaders like VoiceOver.
     */
    var accessibilityLabel: String?

    /**
     * Hex color of text, i.e `#ABCDEF`.
     */
    var textColor: String?
}
