package electron.core


external interface TitleOptions {
    /**
     * The font family variant to display, can be `monospaced` or `monospacedDigit`.
     * `monospaced` is available in macOS 10.15+ When left blank, the title uses the
     * default system font.
     */
    var fontType: (TitleOptionsFontType)?
}
