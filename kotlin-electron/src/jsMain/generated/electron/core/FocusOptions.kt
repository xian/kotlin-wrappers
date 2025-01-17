package electron.core


external interface FocusOptions {
    /**
     * Make the receiver the active app even if another app is currently active.
     *
     * @platform darwin
     */
    var steal: Boolean
}
